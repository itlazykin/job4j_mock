package ru.checkdev.mock.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.checkdev.mock.domain.Interview;
import ru.checkdev.mock.dto.FeedbackDTO;
import ru.checkdev.mock.mapper.FeedbackMapper;
import ru.checkdev.mock.repository.FeedbackRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class FeedbackJpaService implements FeedbackService {
    private final FeedbackRepository repository;

    @Override
    public Optional<FeedbackDTO> save(FeedbackDTO feedbackDTO) {
        var interview = new Interview();
        interview.setId(feedbackDTO.getInterviewId());
        var feedback = FeedbackMapper.getFeedback(feedbackDTO, interview);
        Optional<FeedbackDTO> result = Optional.empty();
        try {
            repository.save(feedback);
            var newFeedbackDTO = FeedbackMapper.getFeedbackDTO(feedback);
            result = Optional.of(newFeedbackDTO);
        } catch (Exception e) {
            log.error("Feedback save error: {}", e.getMessage());
        }
        return result;
    }

    @Override
    public List<FeedbackDTO> findByInterviewId(int interviewId) {
        return repository.findAllByInterviewId(interviewId);
    }

    @Override
    public List<FeedbackDTO> findByInterviewIdAndUserId(int interviewId, int userId) {
        return repository.findByInterviewIdAndUserId(interviewId, userId);
    }
}
