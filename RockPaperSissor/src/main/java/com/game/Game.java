package com.game;

import com.game.Result.RoundResult;

public class Game {
    private int playerAWins;
    private int playerBWins;
    private int draw;

    private final Player playerA;
    private final Player playerB;
    private final Result result;

    public Game(Player playerA, Player playerB, Result result){
        this.playerA = playerA;
        this.playerB = playerB;
        this.result = result;
        this.playerAWins = 0;
        this.playerBWins = 0;
        this.draw = 0;
    }

    public void playRounds(int rounds) {
        for(int i=0;i<rounds;++i) {
            RoundResult roundResult = result.getRoundResult(playerA.chooseRandom(), playerB.chooseRock());
            updateRoundResult(roundResult);
        }
    }
    private void updateRoundResult(RoundResult roundResult) {
        switch(roundResult) {
            case WIN -> ++playerAWins;
            case LOSE -> ++playerBWins;
            case DRAW -> ++draw;
        }
    }

    public void getRoundResults(int rounds) {
        System.out.printf("Player A wins %d of %d games%n", playerAWins, rounds);
        System.out.printf("Player B wins %d of %d games%n", playerBWins, rounds);
        System.out.printf("Draws: %d of %d games%n", draw, rounds);
    }

}
