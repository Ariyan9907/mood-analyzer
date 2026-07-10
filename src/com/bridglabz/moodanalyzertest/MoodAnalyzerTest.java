package com.bridglabz.moodanalyzertest;

import com.bridglabz.moodanalyzer.MoodAnalyzer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {
    @Test
    public void testSadmessage(){
        String actual=new MoodAnalyzer().analyzeMood("I am Sad");
        assertEquals("SAD",actual);
    }

    @Test
    public void testHappymessage(){
        String actual=new MoodAnalyzer().analyzeMood("I am in any mood");
        assertEquals("HAPPY",actual);
    }

}
