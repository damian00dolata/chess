package chess.playerdata;

import chess.enums.Directions;

public final class CursorPosition {
    private static CursorPosition instance;
    private static int [] [] currentPos = new int[8][];

    public static int[][] getCurrentPos() {
        return currentPos;
    }

    public static void setCurrentPos(int[][] position) {
        currentPos = position;
    }

    public static void moveCursor(Directions direction) {

    }

    public static CursorPosition getInstance() {
        if(instance == null) {
            instance = new CursorPosition();
        }
        return instance;
    }
}
