package chess.movement;

import chess.board.Fields;
import chess.piece.PieceData;
import chess.playerdata.CursorPosition;
import chess.playerdata.PlayerTurn;
import chess.playerdata.SelectedPiece;

public class Movement {
    public static void move(int x, int y) {
        try {
            var board = Fields.getFields();
            var originalPosX = SelectedPiece.getSelectedPiece().getX();
            var originalPosY = SelectedPiece.getSelectedPiece().getY();
            if (!board[x][y].isOccupied()) {
                board[x][y].setOccupiedPieceReference(SelectedPiece.getSelectedPiece());
                board[x][y].setOccupied(true);
                SelectedPiece.getSelectedPiece().setX(x);
                SelectedPiece.getSelectedPiece().setY(y);

                board[originalPosX][originalPosY].setOccupied(false);
                board[originalPosX][originalPosY].setOccupiedPieceReference(null);
                SelectedPiece.setSelectedPiece(null);
            } else {
                System.out.println("The field is occupied");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectPiece() {
        var curPos = CursorPosition.getCurrentPos();
        var board = Fields.getFields();
        var testedCase = board[curPos.getX()][curPos.getY()];

        if(testedCase.isOccupied()) {
            if(testedCase.getOccupiedPieceReference().getTeamColor() == PlayerTurn.getCurrentPlayer()) {
                SelectedPiece.setSelectedPiece(testedCase.getOccupiedPieceReference());
            }
        }
    }
}
