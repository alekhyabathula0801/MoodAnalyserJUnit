package com;

public class MoodAnalyser {
    private final String moodMessage;

    public MoodAnalyser(String moodMessage) {
        this.moodMessage = moodMessage;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (moodMessage.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter proper mood");
            else if (moodMessage.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter proper mood");
        }
    }
}
