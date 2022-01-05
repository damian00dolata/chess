package chess.movement;

import chess.board.Fields;
import chess.piece.PieceData;
import chess.playerdata.SelectedPiece;

public class Movement {
    public static void move(int x, int y) {
        try {
            var board = Fields.getFields();
            System.out.println("Selected piece x: " + SelectedPiece.getSelectedPiece().getX());
            System.out.println("Selected piece y: " + SelectedPiece.getSelectedPiece().getY());
            System.out.println("Selected piece name: " + SelectedPiece.getSelectedPiece().getDisplayName());
            System.out.println("----------------");
            if (!board[x][y].isOccupied()) {
                board[x][y].setOccupiedPieceReference(PieceData.getPieceFromListByItsName(SelectedPiece.getSelectedPiece().getDisplayName()));
                board[x][y].getOccupiedPieceReference().setX(x);
                board[x][y].getOccupiedPieceReference().setY(y);
                board[x][y].setOccupied(true);
                board[SelectedPiece.getSelectedPiece().getX()][SelectedPiece.getSelectedPiece().getY()].setOccupied(false);
                board[SelectedPiece.getSelectedPiece().getX()][SelectedPiece.getSelectedPiece().getY()].setOccupiedPieceReference(null);
            } else {
                System.out.println("The field is occupied");
            }
            System.out.println("Selected piece x: " + SelectedPiece.getSelectedPiece().getX());
            System.out.println("Selected piece y: " + SelectedPiece.getSelectedPiece().getY());
            System.out.println("Selected piece name: " + SelectedPiece.getSelectedPiece().getDisplayName());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
