package tw.controllers;

import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static tw.core.Answer.*;

import org.mockito.internal.matchers.Any;
import tw.commands.GuessInputCommand;
import tw.core.Answer;
import tw.core.Game;
import tw.core.model.GuessResult;
import tw.views.GameView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * 在GameControllerTest文件中完成GameController中对应的单元测试
 */
public class GameControllerTest {


    @Test
    public void GameBeginTest() throws IOException {
        Game mockGame = mock(Game.class);
        GameView mockGameView = mock(GameView.class);
        GameController gameController = new GameController(mockGame, mockGameView);

        gameController.beginGame();
        verify(mockGameView).showBegin();
    }

    @Test
    public void GameSuccessTest() throws IOException {
        Game mockGame = mock(Game.class);
        GameView mockGameView = mock(GameView.class);
        GuessInputCommand mockCommand = mock(GuessInputCommand.class);

        GameController gameController = new GameController(mockGame, mockGameView);

        when(mockGame.checkCoutinue()).thenReturn(false);
        when(mockGame.checkStatus()).thenReturn("SUCCESS");

        gameController.play(mockCommand);

        verify(mockGameView).showGameStatus("SUCCESS");
    }

    @Test
    public void GameFailTest() throws IOException {
        Game mockGame = mock(Game.class);
        GameView mockGameView = mock(GameView.class);
        GuessInputCommand mockCommand = mock(GuessInputCommand.class);

        GameController gameController = new GameController(mockGame, mockGameView);

        when(mockGame.checkCoutinue()).thenReturn(false);
        when(mockGame.checkStatus()).thenReturn("FAIL");

        gameController.play(mockCommand);

        verify(mockGameView).showGameStatus("FAIL");
    }

    @Test
    public void GameContinueTest() throws IOException {
        Game mockGame = mock(Game.class);
        GameView mockGameView = mock(GameView.class);
        GuessInputCommand mockCommand = mock(GuessInputCommand.class);

        GameController gameController = new GameController(mockGame, mockGameView);
        Answer testAnswer = new Answer();
        List<GuessResult> testGuessHistory = new ArrayList<>();
        GuessResult testGuessResult = new GuessResult("0A1B", testAnswer);

        when(mockGame.checkCoutinue()).thenReturn(true).thenReturn(false);
        when(mockGame.checkStatus()).thenReturn("CONTINUE");
        when(mockGame.guessHistory()).thenReturn(testGuessHistory);
        when(mockCommand.input()).thenReturn(testAnswer);
        when(mockGame.guess(testAnswer)).thenReturn(testGuessResult);

        gameController.play(mockCommand);

        verify(mockGameView, times(1)).showGuessResult(any(GuessResult.class));
        verify(mockGameView, times(1)).showGuessHistory(anyList());
    }
}