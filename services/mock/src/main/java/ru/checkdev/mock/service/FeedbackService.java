package ru.checkdev.mock.service;

import ru.checkdev.mock.dto.FeedbackDTO;

import java.util.List;
import java.util.Optional;

public interface FeedbackService {

    Optional<FeedbackDTO> save(FeedbackDTO feedbackDTO);

    List<FeedbackDTO> findByInterviewId(int interviewId);

    List<FeedbackDTO> findByInterviewIdAndUserId(int interviewId, int userId);
}
