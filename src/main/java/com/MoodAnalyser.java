package com;

public class MoodAnalyser {
    private final String moodMessage;

    public MoodAnalyser(String moodMessage) {
        this.moodMessage = moodMessage;
    }

    public String analyseMood() {
        if(moodMessage.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }
}
