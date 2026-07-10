package com.bridglabz.test;

import com.bridglabz.exception.MoodAnalysisException;
import com.bridglabz.moodanalyzer.MoodAnalyzer;

public class Main {
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }

    }
}
