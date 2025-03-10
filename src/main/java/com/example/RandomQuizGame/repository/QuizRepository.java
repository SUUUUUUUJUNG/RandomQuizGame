package com.example.RandomQuizGame.repository;

import com.example.RandomQuizGame.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
    // 랜덤 퀴즈를 가져오는 메서드 (추가 예정)
}
