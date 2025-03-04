package ru.job4j.site.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InterviewStatistic {
    /**
     * Общее количество участников по одному собеседованию.
     * Из модели WisherDTO группировка по полю interviewID
     */
    private int participate;
    /**
     * Количество участников которые ожидают сдачи собеседования.
     * Из модели WisherDTO поле approve = false.
     */
    private int expect;
    /**
     * Количество участников которые прошли собеседование
     * из модели WisherDTO поле approve = true.
     */
    private int passed;
}
