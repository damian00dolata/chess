package chess.renderer;

import chess.board.Fields;
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
        var board = Fields.getFields();
        try {
            board[0][0].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Rook"));
            board[0][0].getOccupiedPieceReference().setX(0);
            board[0][0].getOccupiedPieceReference().setY(0);
            board[0][0].setOccupied(true);

            board[0][1].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Knight"));
            board[0][1].getOccupiedPieceReference().setX(0);
            board[0][1].getOccupiedPieceReference().setY(1);
            board[0][1].setOccupied(true);

            board[0][2].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Bishop"));
            board[0][2].getOccupiedPieceReference().setX(0);
            board[0][2].getOccupiedPieceReference().setY(2);
            board[0][2].setOccupied(true);

            board[0][3].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Queen"));
            board[0][3].getOccupiedPieceReference().setX(0);
            board[0][3].getOccupiedPieceReference().setY(3);
            board[0][3].setOccupied(true);

            board[0][4].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White King"));
            board[0][4].getOccupiedPieceReference().setX(0);
            board[0][4].getOccupiedPieceReference().setY(4);
            board[0][4].setOccupied(true);

            board[0][5].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Bishop"));
            board[0][5].getOccupiedPieceReference().setX(0);
            board[0][5].getOccupiedPieceReference().setY(5);
            board[0][5].setOccupied(true);

            board[0][6].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Knight"));
            board[0][6].getOccupiedPieceReference().setX(0);
            board[0][6].getOccupiedPieceReference().setY(6);
            board[0][6].setOccupied(true);

            board[0][7].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Rook"));
            board[0][7].getOccupiedPieceReference().setX(0);
            board[0][7].getOccupiedPieceReference().setY(7);
            board[0][7].setOccupied(true);

            board[7][0].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("Black Rook"));
            board[7][0].getOccupiedPieceReference().setX(7);
            board[7][0].getOccupiedPieceReference().setY(0);
            board[7][0].setOccupied(true);

            board[7][1].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("Black Knight"));
            board[7][1].getOccupiedPieceReference().setX(7);
            board[7][1].getOccupiedPieceReference().setY(1);
            board[7][1].setOccupied(true);

            board[7][2].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("Black Bishop"));
            board[7][2].getOccupiedPieceReference().setX(7);
            board[7][2].getOccupiedPieceReference().setY(2);
            board[7][2].setOccupied(true);

            board[7][3].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("Black Queen"));
            board[7][3].getOccupiedPieceReference().setX(7);
            board[7][3].getOccupiedPieceReference().setY(3);
            board[7][3].setOccupied(true);

            board[7][4].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("Black King"));
            board[7][4].getOccupiedPieceReference().setX(7);
            board[7][4].getOccupiedPieceReference().setY(4);
            board[7][4].setOccupied(true);

            board[7][5].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("Black Bishop"));
            board[7][5].getOccupiedPieceReference().setX(7);
            board[7][5].getOccupiedPieceReference().setY(5);
            board[7][5].setOccupied(true);

            board[7][6].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("Black Knight"));
            board[7][6].getOccupiedPieceReference().setX(7);
            board[7][6].getOccupiedPieceReference().setY(6);
            board[7][6].setOccupied(true);

            board[7][7].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("Black Rook"));
            board[7][7].getOccupiedPieceReference().setX(7);
            board[7][7].getOccupiedPieceReference().setY(7);
            board[7][7].setOccupied(true);

            for(int i=0; i<=7; i++) {
                board[1][i].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("White Pawn"));
                board[1][i].getOccupiedPieceReference().setX(1);
                board[1][i].getOccupiedPieceReference().setY(i);
                board[1][i].setOccupied(true);

                board[6][i].setOccupiedPieceReference(PieceData.getPieceFromListByItsName("Black Pawn"));
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
