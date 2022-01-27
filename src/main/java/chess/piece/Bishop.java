package chess.piece;

import chess.Player;
import chess.board.Field;
import chess.board.Fields;
import chess.playerdata.PlayerTurn;
import chess.playerdata.PossibleMoves;
import chess.playerdata.SelectedPiece;

public class Bishop extends Piece implements IPiece {
    public Bishop(String characterDisplay, String displayName, Player teamColor, String id) {
        super(characterDisplay, displayName, teamColor, id);
    }

    @Override
    public void getPossiblePaths() {
        var i = SelectedPiece.getSelectedPiece().getX();
        var j = SelectedPiece.getSelectedPiece().getY();
        var board = Fields.getFields();

        // check top left
        for(int x = i-1, y = j-1; x >= 0 && y >= 0; x--, y--) {
            if(!PossibleMoves.checkColliders(x, y)) {
                PossibleMoves.addPossiblePosition(x, y);
            }
            else {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
                break;
            }
        }

        // check top right
        for(int x = i-1, y = j+1; x >= 0 && y <= 7; x--, y++) {
            if(!PossibleMoves.checkColliders(x, y)) {
                PossibleMoves.addPossiblePosition(x, y);
            }
            else {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
                break;
            }
        }

        // check bottom right
        for(int x = i+1, y = j+1; x <= 7 && y <= 7; x++, y++) {
            if(!PossibleMoves.checkColliders(x, y)) {
                PossibleMoves.addPossiblePosition(x, y);
            }
            else {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
                break;
            }
        }

        // check bottom left
        for(int x = i+1, y = j-1; x <= 7 && y >= 0; x++, y--) {
            if(!PossibleMoves.checkColliders(x, y)) {
                PossibleMoves.addPossiblePosition(x, y);
            }
            else {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
                break;
            }
        }
    }

    @Override
    public void deleteSelf() {
        PieceData.RemovePieceFromListByItsId(this.getId());
    }
}
