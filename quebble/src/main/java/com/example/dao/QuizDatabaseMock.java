package com.example.dao;

import com.example.domain.Quiz;
import com.example.domain.Vraag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuizDatabaseMock implements QuizDatabase {
    private ArrayList<Quiz> quizzes = new ArrayList();
    QuizDataBaseVragen vragenDB = new QuizDataBaseVragen();
    Random r = new Random();

    public ArrayList getQuizzes() {
        List<Vraag> vragen = vragenDB.getAllVragen();
        ArrayList<Vraag> quizVragen = new ArrayList<>();

        for(int i = 0; i < 8; ++i) {
            int randomint = r.nextInt(vragen.size());

            // check if vraag exists in quizVragen
            if(quizVragen.contains(vragen.get(randomint))) {
                --i;
            } else {
                System.out.println(randomint);
                quizVragen.add(vragen.get(randomint));
            }
        }

        Quiz q1 = new Quiz(quizVragen);
        quizzes.add(q1);

        return quizzes;
    }
}
