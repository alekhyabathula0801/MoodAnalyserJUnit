package com;

public class MoodAnalysisException extends Exception{
    public ExceptionType type;

    public enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY
    }

    public MoodAnalysisException(ExceptionType type , String message){
        super(message);
        this.type = type;
    }
}
