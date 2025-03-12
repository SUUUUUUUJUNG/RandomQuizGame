package com.example.RandomQuizGame.service;

import com.example.RandomQuizGame.model.Quiz;
import com.example.RandomQuizGame.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    private final Random random = new Random();

    // 랜덤 퀴즈 하나 가져오기
    public Quiz getRandomQuiz() {
        List<Quiz> quizzes = quizRepository.findAll();
        if (quizzes.isEmpty()) {
            return null;
        }
        return quizzes.get(random.nextInt(quizzes.size())); // 랜덤 선택
    }
}
