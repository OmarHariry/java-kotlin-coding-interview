package com.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.game.Result.RoundResult;
import com.game.Player.Choice;

class ResultTest {
    private final Result result = new Result();

    @Test
    public void testDrawScenarios() {
        assertEquals(RoundResult.DRAW, result.getRoundResult(Choice.ROCK, Choice.ROCK), "ROCK vs ROCK should result in a DRAW");
        assertEquals(RoundResult.DRAW, result.getRoundResult(Choice.PAPER, Choice.PAPER), "PAPER vs PAPER should result in a DRAW");
        assertEquals(RoundResult.DRAW, result.getRoundResult(Choice.SISSORS, Choice.SISSORS), "SISSOR vs SISSOR should result in a DRAW");
    }

    @Test
    public void testRockWinsAgainstScissors() {
        assertEquals(RoundResult.WIN, result.getRoundResult(Choice.ROCK, Choice.SISSORS), "ROCK should WIN against SISSOR");
    }

    @Test
    public void testRockLosesAgainstPaper() {
        assertEquals(RoundResult.LOSE, result.getRoundResult(Choice.ROCK, Choice.PAPER), "ROCK should LOSE against PAPER");
    }

    @Test
    public void testPaperWinsAgainstRock() {
        assertEquals(RoundResult.WIN, result.getRoundResult(Choice.PAPER, Choice.ROCK), "PAPER should WIN against ROCK");
    }

    @Test
    public void testPaperLosesAgainstScissors() {
        assertEquals(RoundResult.LOSE, result.getRoundResult(Choice.PAPER, Choice.SISSORS), "PAPER should LOSE against SISSOR");
    }

    @Test
    public void testScissorsWinsAgainstPaper() {
        assertEquals(RoundResult.WIN, result.getRoundResult(Choice.SISSORS, Choice.PAPER), "SISSOR should WIN against PAPER");
    }

    @Test
    public void testScissorsLosesAgainstRock() {
        assertEquals(RoundResult.LOSE, result.getRoundResult(Choice.SISSORS, Choice.ROCK), "SISSOR should LOSE against ROCK");
    }
}