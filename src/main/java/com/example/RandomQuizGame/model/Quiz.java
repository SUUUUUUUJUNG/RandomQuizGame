package com.example.RandomQuizGame.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;         // 퀴즈 ID

    private String question; // 문제 내용
    private String option1;  // 선택지 1
    private String option2;  // 선택지 2
    private String option3;  // 선택지 3
    private String option4;  // 선택지 4
    private String answer;   // 정답 (문자열)

    public Quiz() {} // 기본 생성자
}
