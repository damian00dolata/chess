package chess.renderer;

import chess.Piece;
import chess.TypeOfPiece;
import chess.board.Field;
import chess.board.Fields;
import chess.piece.PieceData;
import chess.playerdata.CursorPosition;

import java.io.IOException;

public class Renderer {
    private String cursorImg = "\u2654";

    public Renderer() {
        CursorPosition.getInstance();
        var board = Fields.getFields();

        board[0][0].setCursorAtField(true);
        setup();
    }

    public void setup() {
        var board = Fields.getFields();
        try {

            board[0][0].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Rook"));
            board[0][0].setOccupied(true);

            board[0][1].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Knight"));
            board[0][1].setOccupied(true);

            board[0][2].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Bishop"));
            board[0][2].setOccupied(true);

            board[0][3].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Queen"));
            board[0][3].setOccupied(true);

            board[0][4].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White King"));
            board[0][4].setOccupied(true);

            board[0][5].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Bishop"));
            board[0][5].setOccupied(true);

            board[0][6].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Knight"));
            board[0][6].setOccupied(true);

            board[0][7].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Rook"));
            board[0][7].setOccupied(true);


            for(int i=0; i<=7; i++) {
                board[1][i].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Pawn"));
                board[1][i].setOccupied(true);
                System.out.print((board[1][i].getOccupiedPieceReference().getDisplayName()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void draw() {
        var board = Fields.getFields();
        for(int i=0; i<=7; i++) {
            for(int j=0; j<=7; j++) {
                if(board[i][j].isCursorAtField()) {
                    System.out.print("\u2656");
                } else {
                    if(board[i][j].isOccupied()) {
                        System.out.print(board[i][j].getOccupiedPieceReference().getCharacterDisplay());
                    } else {
                        System.out.print(board[i][j].getDisplayCharacter());
                    }
                }

            }
            System.out.println("");
        }
    }

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
