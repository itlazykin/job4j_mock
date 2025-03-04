package ru.job4j.site.service;

import ru.job4j.site.dto.FeedbackDTO;

import java.util.List;

public interface FeedbackService {
    boolean save(String token, FeedbackDTO feedbackDTO);

    List<FeedbackDTO> findByInterviewId(int interviewId);

    List<FeedbackDTO> findByInterviewIdAndUserId(int interviewId, int userID);
}
