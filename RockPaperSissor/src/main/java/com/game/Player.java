package com.game;

import java.util.Random;

public class Player {
    public enum Choice {
        ROCK, PAPER, SISSORS
    }

    public Choice chooseRandom() {
        Choice[] choices = Choice.values();
        Random randomIdx = new Random();
        return choices[randomIdx.nextInt(choices.length)];
    }

    public Choice chooseRock() {
        return Choice.ROCK;
    }
}
