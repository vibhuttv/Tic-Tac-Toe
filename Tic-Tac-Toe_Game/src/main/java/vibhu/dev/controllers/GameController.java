package vibhu.dev.controllers;

import vibhu.dev.exceptions.InvalidMoveException;
import vibhu.dev.models.Game;
import vibhu.dev.models.GameState;
import vibhu.dev.models.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
        //TODO
        //Validate if 2 players have the same symbol or not ?
        //If 2 players have same symbol, throw some exception.
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}