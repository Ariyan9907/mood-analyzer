package com.bridglabz.moodanalyzertest;

import com.bridglabz.exception.MoodAnalysisException;
import com.bridglabz.moodanalyzer.MoodAnalyzer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {
    @Test
    public void givenSadMood_WhenAnalyzed_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Sad");
        String actual=moodAnalyzer.analyzeMood();
        assertEquals("SAD",actual);
    }

    @Test
    public void givenHappyMood_WhenAnalyzed_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String actual=moodAnalyzer.analyzeMood();
        assertEquals("HAPPY",actual);
    }

}
