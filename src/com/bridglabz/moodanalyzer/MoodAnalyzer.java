package com.bridglabz.moodanalyzer;

public class MoodAnalyzer {

    //Analyzing Mood
    public String analyzeMood(String msg){
        if(msg.contains("Sad")){
            return "SAD";
        }
        return "HAPPY";
    }
}
