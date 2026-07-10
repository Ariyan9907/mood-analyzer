package com.bridglabz.moodanalyzer;

import com.bridglabz.exception.MoodAnalysisException;

public class MoodAnalyzer {
    private String msg;

    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String msg){
        this.msg=msg;
    }

    //Analyzing Mood
    public String analyzeMood() throws MoodAnalysisException {
        if(msg==null){
            throw new MoodAnalysisException("Null Msg not allowed");
        }
        if(msg.contains("Sad")){
            return "SAD";
        }
        return "HAPPY";
    }
}
