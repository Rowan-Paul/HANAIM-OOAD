package com.example.dao;

import com.example.Quiz;
import com.example.Vraag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuizDatabaseMock implements QuizDatabase {
    QuizDataBaseVragen vragenDB = new QuizDataBaseVragen();
    Random r = new Random();
    private ArrayList<Quiz> quizzes = new ArrayList();
    private int quizID = 0;

    public ArrayList getQuizzes() {
        Quiz q1 = new Quiz(0,newQuiz());
        Quiz q2 = new Quiz(1,newQuiz());
        Quiz q3 = new Quiz(2,newQuiz());
        Quiz q4 = new Quiz(3,newQuiz());
        Quiz q5 = new Quiz(4,newQuiz());
        Quiz q6 = new Quiz(5,newQuiz());
        Quiz q7 = new Quiz(6,newQuiz());
        Quiz q8 = new Quiz(7,newQuiz());
        Quiz q9 = new Quiz(8,newQuiz());
        Quiz q10 = new Quiz(9,newQuiz());
        quizzes.add(q1);
        quizzes.add(q2);
        quizzes.add(q3);
        quizzes.add(q4);
        quizzes.add(q5);
        quizzes.add(q6);
        quizzes.add(q7);
        quizzes.add(q8);
        quizzes.add(q9);
        quizzes.add(q10);

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
