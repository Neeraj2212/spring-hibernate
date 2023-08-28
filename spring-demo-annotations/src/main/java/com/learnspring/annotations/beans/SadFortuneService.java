package com.learnspring.annotations.beans;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is very sad day";
    }

}
