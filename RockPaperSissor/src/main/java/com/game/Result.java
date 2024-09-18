package com.game;

import com.game.Player.Choice;
public class Result {
    public enum RoundResult {
        WIN, LOSE, DRAW
    }

    public RoundResult getRoundResult(Choice playerAChoice, Choice playerBChoice) {
        if (playerAChoice == playerBChoice)
            return RoundResult.DRAW;

        return switch (playerAChoice) {
            case ROCK -> playerBChoice == Choice.SISSORS ? RoundResult.WIN : RoundResult.LOSE;
            case PAPER -> playerBChoice == Choice.ROCK ? RoundResult.WIN : RoundResult.LOSE;
            case SISSORS -> playerBChoice == Choice.PAPER ? RoundResult.WIN : RoundResult.LOSE;
            default -> throw new IllegalStateException("Unexpected value: " + playerAChoice);
        };

    }
}
