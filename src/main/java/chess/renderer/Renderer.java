package chess.renderer;

import chess.Piece;
import chess.playerdata.CursorPosition;

import java.io.IOException;

public class Renderer {
    private String cursorImg = "\u2654";
    private Piece[][] board = new Piece[8][];

    public Renderer() {
        for(int i=0; i<=7; i++) {
            board[i] = new Piece[8];
        }
        CursorPosition.getInstance();
    }

    public void draw() {
        for(int i=0; i<=7; i++) {
            for(int j=0; j<=7; j++) {
                if(board[i][j] != null) {
                    System.out.print("\u2657");
                }
            }
        }
    }

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
