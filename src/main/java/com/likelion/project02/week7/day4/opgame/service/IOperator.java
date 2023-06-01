package com.likelion.project02.week7.day4.opgame.service;

public interface IOperator {
    void setA(int a);
    void setB(int b);
    void generateQuestion(int max);
    String getQuestionMsg();
    boolean isEquals(int answer);
}