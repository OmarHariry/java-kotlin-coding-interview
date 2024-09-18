package com.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.game.Player.Choice;

class PlayerTest {

    @Test
    public void testChooseRandomly() {
        Player playerA = new Player();
        assertEquals(Choice.ROCK, playerA.chooseRock());
    }

    @Test
    public void testAlwaysChooseRock() {
        Player playerB = new Player();
        Choice move = playerB.chooseRandom();
        assertTrue(move == Choice.ROCK || move == Choice.PAPER
                || move == Choice.SISSORS);

    }
}