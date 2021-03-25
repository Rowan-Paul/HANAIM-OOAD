package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    public String read() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String input = reader.readLine();

        return input;
    }
}
