package chess.renderer;

import chess.Player;
import chess.board.Fields;
import chess.piece.*;
import chess.playerdata.CursorPosition;
import chess.playerdata.PlayerTurn;
import chess.playerdata.PossibleMoves;
import chess.playerdata.SelectedPiece;

import java.awt.*;

public class Renderer {
    private String cursorImg = "\u2654";

    public Renderer() {
        CursorPosition.getInstance();
        var board = Fields.getFields();

        board[0][0].setCursorAtField(true);
        setup();
    }

    public void setup() {
        PieceData.getPieceList().add(new King("\u2654", "White King", Player.white, "WK0"));
        PieceData.getPieceList().add(new Queen("\u2655", "White Queen", Player.white, "WQ0"));
        PieceData.getPieceList().add(new Rook("\u2656", "White Rook", Player.white, "WR0"));
        PieceData.getPieceList().add(new Rook("\u2656", "White Rook", Player.white, "WR1"));
        PieceData.getPieceList().add(new Bishop("\u2657", "White Bishop", Player.white, "WB0"));
        PieceData.getPieceList().add(new Bishop("\u2657", "White Bishop", Player.white, "WB1"));
        PieceData.getPieceList().add(new Knight("\u2658", "White Knight", Player.white, "WN0"));
        PieceData.getPieceList().add(new Knight("\u2658", "White Knight", Player.white, "WN1"));
        PieceData.getPieceList().add(new Pawn("\u2659", "White Pawn", Player.white, "WP0"));
        PieceData.getPieceList().add(new Pawn("\u2659", "White Pawn", Player.white, "WP1"));
        PieceData.getPieceList().add(new Pawn("\u2659", "White Pawn", Player.white, "WP2"));
        PieceData.getPieceList().add(new Pawn("\u2659", "White Pawn", Player.white, "WP3"));
        PieceData.getPieceList().add(new Pawn("\u2659", "White Pawn", Player.white, "WP4"));
        PieceData.getPieceList().add(new Pawn("\u2659", "White Pawn", Player.white, "WP5"));
        PieceData.getPieceList().add(new Pawn("\u2659", "White Pawn", Player.white, "WP6"));
        PieceData.getPieceList().add(new Pawn("\u2659", "White Pawn", Player.white, "WP7"));

        PieceData.getPieceList().add(new King("\u265A", "Black King", Player.black, "BK0"));
        PieceData.getPieceList().add(new Queen("\u265B", "Black Queen", Player.black, "BQ0"));
        PieceData.getPieceList().add(new Rook("\u265C", "Black Rook", Player.black, "BR0"));
        PieceData.getPieceList().add(new Rook("\u265C", "Black Rook", Player.black, "BR1"));
        PieceData.getPieceList().add(new Bishop("\u265D", "Black Bishop", Player.black, "BB0"));
        PieceData.getPieceList().add(new Bishop("\u265D", "Black Bishop", Player.black, "BB1"));
        PieceData.getPieceList().add(new Knight("\u265E", "Black Knight", Player.black, "BN0"));
        PieceData.getPieceList().add(new Knight("\u265E", "Black Knight", Player.black, "BN1"));
        PieceData.getPieceList().add(new Pawn("\u265F", "Black Pawn", Player.black, "BP0"));
        PieceData.getPieceList().add(new Pawn("\u265F", "Black Pawn", Player.black, "BP1"));
        PieceData.getPieceList().add(new Pawn("\u265F", "Black Pawn", Player.black, "BP2"));
        PieceData.getPieceList().add(new Pawn("\u265F", "Black Pawn", Player.black, "BP3"));
        PieceData.getPieceList().add(new Pawn("\u265F", "Black Pawn", Player.black, "BP4"));
        PieceData.getPieceList().add(new Pawn("\u265F", "Black Pawn", Player.black, "BP5"));
        PieceData.getPieceList().add(new Pawn("\u265F", "Black Pawn", Player.black, "BP6"));
        PieceData.getPieceList().add(new Pawn("\u265F", "Black Pawn", Player.black, "BP7"));

        var board = Fields.getFields();
        try {
            board[0][0].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WR0"));
            board[0][0].getOccupiedPieceReference().setX(0);
            board[0][0].getOccupiedPieceReference().setY(0);
            board[0][0].setOccupied(true);

            board[0][1].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WN0"));
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

            board[0][6].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("WN1"));
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

            board[7][1].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("BN0"));
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

            board[7][6].setOccupiedPieceReference(PieceData.getPieceFromListByItsID("BN1"));
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
                if(PossibleMoves.canICapThis(i,j)) {
                    System.out.print("\033[0;101m" + "C" + "\033[0m");
                } else {
                    if (PossibleMoves.isPositionMatchWithDraw(i, j)) {
                        // draw possible movements
                        System.out.print("\033[0;102m" + "P" + "\033[0m");
                    } else {
                        if (board[i][j].isOccupied()) {
                            System.out.print(
                                    board[i][j].isCursorAtField() ?
                                            "\033[0;104m" + board[i][j].getOccupiedPieceReference().getCharacterDisplay() + "\033[0m" :
                                            board[i][j].getOccupiedPieceReference().getCharacterDisplay()
                            );
                        } else {
                            System.out.print(board[i][j].isCursorAtField() ?
                                    "\033[0;104m" + board[i][j].getDisplayCharacter() + "\033[0m" :
                                    board[i][j].getDisplayCharacter()
                            );
                        }
                    }
                }

                }
            System.out.println("");
        }
        System.out.println("Current player: " + PlayerTurn.getCurrentPlayer());
        if(SelectedPiece.getSelectedPiece() != null) System.out.println("Current class: " + SelectedPiece.getSelectedPiece().getClass());
        System.out.println("Possible moves: " + PossibleMoves.getPossiblePositions().size());
        System.out.println("Possible captures: " + PossibleMoves.getPossibleCaptures().size());
    }

    public void drawList() {
        for(short i=0; i<PieceData.getPieceList().size(); i++) {
            var piece = PieceData.getPieceList().get(i);
            System.out.print(piece.getId());
            System.out.print(", ");
            System.out.print(piece.getCharacterDisplay());
            System.out.print(", ");
            System.out.print(piece.getTeamColor());
            System.out.print(", ");
            System.out.print(piece.getX());
            System.out.print(", ");
            System.out.print(piece.getY());
            System.out.print(", ");
            System.out.print(piece.getClass());
            System.out.print(", ");
            System.out.print(i);
            System.out.print(", ");
            System.out.print(PieceData.getPieceList().size());
            System.out.println();
        }
    }

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
