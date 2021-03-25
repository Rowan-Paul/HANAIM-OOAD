package com.example.dao;

import com.example.domain.Quiz;

import java.util.ArrayList;

public class QuizDatabaseMock implements QuizDatabase {
    private ArrayList<Quiz> quizzes = new ArrayList();
    QuizDataBaseVragen vragenDB = new QuizDataBaseVragen();

    public ArrayList getQuizzes() {
        Quiz q1 = new Quiz(vragenDB.getAllVragen());
        quizzes.add(q1);

        return quizzes;
    }
}
