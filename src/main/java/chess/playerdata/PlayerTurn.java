package chess.playerdata;

import chess.Player;

public final class PlayerTurn {
    private static PlayerTurn instance;
    private static Player currentPlayer = Player.white;

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(Player player) {
        currentPlayer = player;
    }

    public static PlayerTurn getInstance() {
        if(instance == null) {
            instance = new PlayerTurn();
        }
        return instance;
    }

    public static void endTurn() {
        if(currentPlayer == Player.white) {
            currentPlayer = Player.black;
        }
        else {
            currentPlayer = Player.white;
        }
    }
}
