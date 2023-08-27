package com.learnspring.annotations.beans;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Just Do it: It's your lucky day";
    }

}
