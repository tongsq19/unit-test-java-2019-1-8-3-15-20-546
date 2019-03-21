package tw.core;

import org.junit.Test;
import tw.core.exception.OutOfRangeAnswerException;
import tw.core.generator.AnswerGenerator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * 在GameTest文件中完成Game中对应的单元测试
 */


public class GameTest {
    @Test
    public void Game_1_Run_Success_Test() throws OutOfRangeAnswerException {
        AnswerGenerator mockAnswerGenerator = mock(AnswerGenerator.class);
        Answer answer = Answer.createAnswer("1 2 3 4");
        when(mockAnswerGenerator.generate()).thenReturn(answer);

        Game game = new Game(mockAnswerGenerator);

        Answer answer1 = Answer.createAnswer("1 2 3 4");
        game.guess(answer1);

        assertEquals(game.checkStatus(), "success");
        assertFalse(game.checkCoutinue());
    }

    @Test
    public void Game_2_Run_Success_Test() throws OutOfRangeAnswerException {
        AnswerGenerator mockAnswerGenerator = mock(AnswerGenerator.class);
        Answer answer = Answer.createAnswer("1 2 3 4");
        when(mockAnswerGenerator.generate()).thenReturn(answer);

        Game game = new Game(mockAnswerGenerator);

        Answer answer1 = Answer.createAnswer("4 3 2 1");
        game.guess(answer1);

        assertEquals(game.checkStatus(), "continue");
        assertTrue(game.checkCoutinue());

        Answer answer2 = Answer.createAnswer("1 2 3 4");
        game.guess(answer2);

        assertEquals(game.checkStatus(), "success");
        assertFalse(game.checkCoutinue());
    }

    @Test
    public void Game_3_Run_Success_Test() throws OutOfRangeAnswerException {
        AnswerGenerator mockAnswerGenerator = mock(AnswerGenerator.class);
        Answer answer = Answer.createAnswer("1 2 3 4");
        when(mockAnswerGenerator.generate()).thenReturn(answer);

        Game game = new Game(mockAnswerGenerator);

        Answer answer1 = Answer.createAnswer("4 3 2 1");
        Answer answer2 = Answer.createAnswer("4 3 2 1");
        game.guess(answer1);
        game.guess(answer2);

        assertEquals(game.checkStatus(), "continue");
        assertTrue(game.checkCoutinue());

        Answer answer3 = Answer.createAnswer("1 2 3 4");
        game.guess(answer3);

        assertEquals(game.checkStatus(), "success");
        assertFalse(game.checkCoutinue());
    }

    @Test
    public void Game_4_Run_Success_Test() throws OutOfRangeAnswerException {
        AnswerGenerator mockAnswerGenerator = mock(AnswerGenerator.class);
        Answer answer = Answer.createAnswer("1 2 3 4");
        when(mockAnswerGenerator.generate()).thenReturn(answer);

        Game game = new Game(mockAnswerGenerator);

        Answer answer1 = Answer.createAnswer("4 3 2 1");
        Answer answer2 = Answer.createAnswer("4 3 2 1");
        Answer answer3 = Answer.createAnswer("4 3 2 1");
        game.guess(answer1);
        game.guess(answer2);
        game.guess(answer3);

        assertEquals(game.checkStatus(), "continue");
        assertTrue(game.checkCoutinue());

        Answer answer4 = Answer.createAnswer("1 2 3 4");
        game.guess(answer4);

        assertEquals(game.checkStatus(), "success");
        assertFalse(game.checkCoutinue());
    }

    @Test
    public void Game_5_Run_Success_Test() throws OutOfRangeAnswerException {
        AnswerGenerator mockAnswerGenerator = mock(AnswerGenerator.class);
        Answer answer = Answer.createAnswer("1 2 3 4");
        when(mockAnswerGenerator.generate()).thenReturn(answer);

        Game game = new Game(mockAnswerGenerator);

        Answer answer1 = Answer.createAnswer("4 3 2 1");
        Answer answer2 = Answer.createAnswer("4 3 2 1");
        Answer answer3 = Answer.createAnswer("4 3 2 1");
        Answer answer4 = Answer.createAnswer("4 3 2 1");

        game.guess(answer1);
        game.guess(answer2);
        game.guess(answer3);
        game.guess(answer4);

        assertEquals(game.checkStatus(), "continue");
        assertTrue(game.checkCoutinue());

        Answer answer5 = Answer.createAnswer("1 2 3 4");
        game.guess(answer5);

        assertEquals(game.checkStatus(), "success");
        assertFalse(game.checkCoutinue());
    }

    @Test
    public void Game_6_Run_Success_Test() throws OutOfRangeAnswerException {
        AnswerGenerator mockAnswerGenerator = mock(AnswerGenerator.class);
        Answer answer = Answer.createAnswer("1 2 3 4");
        when(mockAnswerGenerator.generate()).thenReturn(answer);

        Game game = new Game(mockAnswerGenerator);

        Answer answer1 = Answer.createAnswer("4 3 2 1");
        Answer answer2 = Answer.createAnswer("4 3 2 1");
        Answer answer3 = Answer.createAnswer("4 3 2 1");
        Answer answer4 = Answer.createAnswer("4 3 2 1");
        Answer answer5 = Answer.createAnswer("4 3 2 1");

        game.guess(answer1);
        game.guess(answer2);
        game.guess(answer3);
        game.guess(answer4);
        game.guess(answer5);

        assertEquals(game.checkStatus(), "continue");
        assertTrue(game.checkCoutinue());

        Answer answer6 = Answer.createAnswer("1 2 3 4");
        game.guess(answer6);

        assertEquals(game.checkStatus(), "success");
        assertFalse(game.checkCoutinue());
    }

    @Test
    public void Game_6_Run_Fail_Test() throws OutOfRangeAnswerException {
        AnswerGenerator mockAnswerGenerator = mock(AnswerGenerator.class);
        Answer answer = Answer.createAnswer("1 2 3 4");
        when(mockAnswerGenerator.generate()).thenReturn(answer);

        Game game = new Game(mockAnswerGenerator);

        Answer answer1 = Answer.createAnswer("4 3 2 1");
        Answer answer2 = Answer.createAnswer("4 3 2 1");
        Answer answer3 = Answer.createAnswer("4 3 2 1");
        Answer answer4 = Answer.createAnswer("4 3 2 1");
        Answer answer5 = Answer.createAnswer("4 3 2 1");

        game.guess(answer1);
        game.guess(answer2);
        game.guess(answer3);
        game.guess(answer4);
        game.guess(answer5);

        assertEquals(game.checkStatus(), "continue");
        assertTrue(game.checkCoutinue());

        Answer answer6 = Answer.createAnswer("4 3 2 1");
        game.guess(answer6);

        assertEquals(game.checkStatus(), "fail");
        assertFalse(game.checkCoutinue());
    }
}
