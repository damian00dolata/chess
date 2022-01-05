package chess.playerdata;

import chess.board.Fields;
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
        var board = Fields.getFields();
        for(int i=0; i<=7; i++) {
            for(int j=0; j<=7; j++) {
                if(board[i][j].isCursorAtField()) {
                    if(direction == Directions.Right) {
                        board[i][j+1].setCursorAtField(true);
                        board[i][j].setCursorAtField(false);
                        break;
                    }
                }
            }
        }
    }

    public static CursorPosition getInstance() {
        if(instance == null) {
            instance = new CursorPosition();
        }
        return instance;
    }
}
