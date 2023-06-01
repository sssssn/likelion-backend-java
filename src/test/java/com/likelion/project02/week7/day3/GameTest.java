package com.likelion.project02.week7.day3;

import static org.junit.jupiter.api.Assertions.*;

import com.likelion.project02.week7.day3.opgame.service.OpGame;
import com.likelion.project02.week7.day3.opgame.service.PlusOperatorLevelOne;
import org.junit.jupiter.api.Test;

/**
 * @author jun
 *
 * 1. 덧셈
 * 2. 기회 3회
 * 3. 격려
 * 4. 결과는 10 이하
 *
 */
public class GameTest {

    @Test
    public void test() {
        OpGame game = new OpGame(new PlusOperatorLevelOne());
        game.makeQuestion();
        String question = game.getQuestion();

        assertEquals("1 + 1 = ", question);
        assertEquals(3, game.getRemainingAnswers());
        assertEquals(false, game.isAnswer(3));
        assertEquals(2, game.getRemainingAnswers());
        assertEquals("한번 더 해보자", game.getCheeringUpMsg());
        assertEquals(true, game.isAnswer(2));
    }

    @Test
    public void testRandom() {
        System.out.println( (int)(Math.random() * 10) );
    }

    @Test
    public void testSumMax() {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        System.out.printf("%d + %d = %d", a, b, a + b);
        assertTrue(a + b < 10);
    }
}