package com.game;

public class Main {
    private static final int ROUNDS = 100;
    public static void main(String[] args) {
        Game game = new Game(new Player(), new Player(), new Result());
        game.playRounds(ROUNDS);
        game.getRoundResults(ROUNDS);
    }
}