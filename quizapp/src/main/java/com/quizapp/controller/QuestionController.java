package com.quizapp.controller;


import com.quizapp.Question;
import com.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @RequestMapping("allQuestions")
    public List<Question> getAllQuestions() {
        System.out.println(questionService.getAllQuestions());
        return questionService.getAllQuestions();
    }
}


