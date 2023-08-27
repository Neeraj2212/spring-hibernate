package com.learnspring.annotations.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = { "Beware of wolf in sheep's clothing",
            "Dilligence is the mother of good luck",
            "The One Piece is Real" };

    private Random random = new Random();

    @Override
    public String getFortune() {

        int idx = random.nextInt(data.length);
        return data[idx];

    }

}
