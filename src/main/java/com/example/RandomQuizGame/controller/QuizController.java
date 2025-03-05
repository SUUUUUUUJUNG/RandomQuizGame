package com.example.RandomQuizGame.controller;

import com.example.RandomQuizGame.model.Quiz;
import com.example.RandomQuizGame.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    // 퀴즈 페이지 반환
    @GetMapping("")
    public String quizPage(Model model) {
        return "quiz";
    }

    // 랜덤 퀴즈 가져오기 (JSON 반환)
    @GetMapping("/random")
    @ResponseBody
    public Quiz getRandomQuiz() {
        return quizService.getRandomQuiz();
    }
}
