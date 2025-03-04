package ru.checkdev.mock.mapper;

import ru.checkdev.mock.domain.Feedback;
import ru.checkdev.mock.domain.Interview;
import ru.checkdev.mock.dto.FeedbackDTO;

public class FeedbackMapper {

    public static FeedbackDTO getFeedbackDTO(Feedback feedback) {
        return new FeedbackDTO(feedback.getId(), (feedback.getInterview().getId()),
                feedback.getUserId(), feedback.getRoleInInterview(),
                feedback.getTextFeedback(),
                feedback.getScope());
    }

    public static Feedback getFeedback(FeedbackDTO feedbackDTO, Interview interview) {
        return new Feedback(feedbackDTO.getId(), interview,
                feedbackDTO.getUserId(), feedbackDTO.getRoleInInterview(),
                feedbackDTO.getTextFeedback(), feedbackDTO.getScope());
    }
}
