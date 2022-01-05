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
        boolean moved = false;
        var board = Fields.getFields();
        for(int i=0; i<=7; i++) {
            for(int j=0; j<=7; j++) {
                if(board[i][j].isCursorAtField()) {
                    if(moved) {
                        break;
                    }
                    switch(direction) {
                        case Right:
                            if(board[i][j+1] != null) {
                                board[i][j+1].setCursorAtField(true);
                                board[i][j].setCursorAtField(false);
                                moved = true;
                            }
                            break;
                        case Left:
                            if(board[i][j-1] != null) {
                                board[i][j-1].setCursorAtField(true);
                                board[i][j].setCursorAtField(false);
                                moved = true;
                            }
                            break;
                        case Up:
                            if(board[i-1][j] != null) {
                                board[i-1][j].setCursorAtField(true);
                                board[i][j].setCursorAtField(false);
                                moved = true;
                            }
                            break;
                        case Down:
                            if(board[i+1][j] != null) {
                                board[i+1][j].setCursorAtField(true);
                                board[i][j].setCursorAtField(false);
                                moved = true;
                            }
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
