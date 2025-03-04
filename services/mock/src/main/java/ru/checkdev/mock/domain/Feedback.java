package ru.checkdev.mock.domain;

import lombok.*;

import javax.persistence.*;

@Entity(name = "cd_feedback")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Feedback {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "interview_id", nullable = false)
    private Interview interview;
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Column(name = "role_in_interview", nullable = false)
    private int roleInInterview;
    @Column(name = "text_feedback")
    private String textFeedback;
    @Column(name = "scope")
    private int scope;
}
