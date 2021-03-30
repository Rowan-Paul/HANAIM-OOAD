package com.example.dao;

import com.example.domain.Quiz;
import com.example.domain.Vraag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuizDatabaseMock implements QuizDatabase {
    QuizDataBaseVragen vragenDB = new QuizDataBaseVragen();
    Random r = new Random();
    private ArrayList<Quiz> quizzes = new ArrayList();

    public ArrayList getQuizzes() {
        Quiz q1 = new Quiz(newQuiz());
        Quiz q2 = new Quiz(newQuiz());
        Quiz q3 = new Quiz(newQuiz());
        Quiz q4 = new Quiz(newQuiz());
        quizzes.add(q1);
        quizzes.add(q2);
        quizzes.add(q3);
        quizzes.add(q4);

        return quizzes;
    }

    public ArrayList<Vraag> newQuiz() {
        List<Vraag> vragen = vragenDB.getAllVragen();
        ArrayList<Vraag> quizVragen = new ArrayList<>();

        for (int i = 0; i < 8; ++i) {
            int randomint = r.nextInt(vragen.size());

            // check if vraag exists in quizVragen
            if (quizVragen.contains(vragen.get(randomint))) {
                --i;
            } else {
                quizVragen.add(vragen.get(randomint));
            }
        }

        return quizVragen;
    }
}
