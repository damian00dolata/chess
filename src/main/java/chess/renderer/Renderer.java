package chess.renderer;

import chess.Player;
import chess.board.Fields;
import chess.piece.Piece;
import chess.piece.PieceData;
import chess.playerdata.CursorPosition;
import chess.playerdata.PlayerTurn;

public class Renderer {
    private String cursorImg = "\u2654";

    public Renderer() {
        CursorPosition.getInstance();
        var board = Fields.getFields();

        board[0][0].setCursorAtField(true);
        setup();
    }

    public void setup() {
        PieceData.getPieceList().add(new Piece("\u2654", "White King", Player.white, "WK0"));
        PieceData.getPieceList().add(new Piece("\u2655", "White Queen", Player.white, "WQ0"));
        PieceData.getPieceList().add(new Piece("\u2656", "White Rook", Player.white, "WR0"));
        PieceData.getPieceList().add(new Piece("\u2656", "White Rook", Player.white, "WR1"));
        PieceData.getPieceList().add(new Piece("\u2657", "White Bishop", Player.white, "WB0"));
        PieceData.getPieceList().add(new Piece("\u2657", "White Bishop", Player.white, "WB1"));
        PieceData.getPieceList().add(new Piece("\u2658", "White Knight", Player.white, "WK0"));
        PieceData.getPieceList().add(new Piece("\u2658", "White Knight", Player.white, "WK1"));
        PieceData.getPieceList().add(new Piece("\u2659", "White Pawn", Player.white, "WP0"));
        PieceData.getPieceList().add(new Piece("\u2659", "White Pawn", Player.white, "WP1"));
        PieceData.getPieceList().add(new Piece("\u2659", "White Pawn", Player.white, "WP2"));
        PieceData.getPieceList().add(new Piece("\u2659", "White Pawn", Player.white, "WP3"));
        PieceData.getPieceList().add(new Piece("\u2659", "White Pawn", Player.white, "WP4"));
        PieceData.getPieceList().add(new Piece("\u2659", "White Pawn", Player.white, "WP5"));
        PieceData.getPieceList().add(new Piece("\u2659", "White Pawn", Player.white, "WP6"));
        PieceData.getPieceList().add(new Piece("\u2659", "White Pawn", Player.white, "WP7"));

        PieceData.getPieceList().add(new Piece("\u265A", "Black King", Player.white, "BK0"));
        PieceData.getPieceList().add(new Piece("\u265B", "Black Queen", Player.white, "BQ0"));
        PieceData.getPieceList().add(new Piece("\u265C", "Black Rook", Player.white, "BR0"));
        PieceData.getPieceList().add(new Piece("\u265C", "Black Rook", Player.white, "BR1"));
        PieceData.getPieceList().add(new Piece("\u265D", "Black Bishop", Player.white, "BB0"));
        PieceData.getPieceList().add(new Piece("\u265D", "Black Bishop", Player.white, "BB1"));
        PieceData.getPieceList().add(new Piece("\u265E", "Black Knight", Player.white, "BK0"));
        PieceData.getPieceList().add(new Piece("\u265E", "Black Knight", Player.white, "BK1"));
        PieceData.getPieceList().add(new Piece("\u265F", "Black Pawn", Player.white, "BP0"));
        PieceData.getPieceList().add(new Piece("\u265F", "Black Pawn", Player.white, "BP1"));
        PieceData.getPieceList().add(new Piece("\u265F", "Black Pawn", Player.white, "BP2"));
        PieceData.getPieceList().add(new Piece("\u265F", "Black Pawn", Player.white, "BP3"));
        PieceData.getPieceList().add(new Piece("\u265F", "Black Pawn", Player.white, "BP4"));
        PieceData.getPieceList().add(new Piece("\u265F", "Black Pawn", Player.white, "BP5"));
        PieceData.getPieceList().add(new Piece("\u265F", "Black Pawn", Player.white, "BP6"));
        PieceData.getPieceList().add(new Piece("\u265F", "Black Pawn", Player.white, "BP7"));

        var board = Fields.getFields();
        try {
            board[0][0].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WR0"));
            board[0][0].getOccupiedPieceReference().setX(0);
            board[0][0].getOccupiedPieceReference().setY(0);
            board[0][0].setOccupied(true);

            board[0][1].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WK0"));
            board[0][1].getOccupiedPieceReference().setX(0);
            board[0][1].getOccupiedPieceReference().setY(1);
            board[0][1].setOccupied(true);

            board[0][2].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WB0"));
            board[0][2].getOccupiedPieceReference().setX(0);
            board[0][2].getOccupiedPieceReference().setY(2);
            board[0][2].setOccupied(true);

            board[0][3].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WQ0"));
            board[0][3].getOccupiedPieceReference().setX(0);
            board[0][3].getOccupiedPieceReference().setY(3);
            board[0][3].setOccupied(true);

            board[0][4].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WK0"));
            board[0][4].getOccupiedPieceReference().setX(0);
            board[0][4].getOccupiedPieceReference().setY(4);
            board[0][4].setOccupied(true);

            board[0][5].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WB1"));
            board[0][5].getOccupiedPieceReference().setX(0);
            board[0][5].getOccupiedPieceReference().setY(5);
            board[0][5].setOccupied(true);

            board[0][6].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WK1"));
            board[0][6].getOccupiedPieceReference().setX(0);
            board[0][6].getOccupiedPieceReference().setY(6);
            board[0][6].setOccupied(true);

            board[0][7].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WR1"));
            board[0][7].getOccupiedPieceReference().setX(0);
            board[0][7].getOccupiedPieceReference().setY(7);
            board[0][7].setOccupied(true);

            board[7][0].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("BR0"));
            board[7][0].getOccupiedPieceReference().setX(7);
            board[7][0].getOccupiedPieceReference().setY(0);
            board[7][0].setOccupied(true);

            board[7][1].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("BK0"));
            board[7][1].getOccupiedPieceReference().setX(7);
            board[7][1].getOccupiedPieceReference().setY(1);
            board[7][1].setOccupied(true);

            board[7][2].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("BB0"));
            board[7][2].getOccupiedPieceReference().setX(7);
            board[7][2].getOccupiedPieceReference().setY(2);
            board[7][2].setOccupied(true);

            board[7][3].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("BQ0"));
            board[7][3].getOccupiedPieceReference().setX(7);
            board[7][3].getOccupiedPieceReference().setY(3);
            board[7][3].setOccupied(true);

            board[7][4].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("BK0"));
            board[7][4].getOccupiedPieceReference().setX(7);
            board[7][4].getOccupiedPieceReference().setY(4);
            board[7][4].setOccupied(true);

            board[7][5].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("BB1"));
            board[7][5].getOccupiedPieceReference().setX(7);
            board[7][5].getOccupiedPieceReference().setY(5);
            board[7][5].setOccupied(true);

            board[7][6].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("BK1"));
            board[7][6].getOccupiedPieceReference().setX(7);
            board[7][6].getOccupiedPieceReference().setY(6);
            board[7][6].setOccupied(true);

            board[7][7].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("BR1"));
            board[7][7].getOccupiedPieceReference().setX(7);
            board[7][7].getOccupiedPieceReference().setY(7);
            board[7][7].setOccupied(true);

            for(int i=0; i<=7; i++) {
                board[1][i].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WP"+i));
                board[1][i].getOccupiedPieceReference().setX(1);
                board[1][i].getOccupiedPieceReference().setY(i);
                board[1][i].setOccupied(true);

                board[6][i].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("BP"+i));
                board[6][i].getOccupiedPieceReference().setX(6);
                board[6][i].getOccupiedPieceReference().setY(i);
                board[6][i].setOccupied(true);
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
        System.out.println("Current player: " + PlayerTurn.getCurrentPlayer());
    }

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
