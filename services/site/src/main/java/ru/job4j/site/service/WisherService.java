package ru.job4j.site.service;

import ru.job4j.site.dto.InterviewStatistic;
import ru.job4j.site.dto.WisherDto;

import java.util.List;
import java.util.Map;

public interface WisherService {

    boolean saveWisherDto(String token, WisherDto wisherDto);

    List<WisherDto> getAllWisherDtoByInterviewId(String token, String interviewId);

    boolean setNewStatusByWisherInterview(String token, String interviewId,
                                                 String wisherId, String newStatusId,
                                                 String anyStatusId);

    boolean isWisher(int userId, int interviewId, List<WisherDto> wishers);

    boolean isDismissed(int interviewId, List<WisherDto> wishers);

    Map<Integer, InterviewStatistic> getInterviewStatistic(List<WisherDto> wishers);
}
