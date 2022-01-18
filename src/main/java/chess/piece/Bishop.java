package chess.piece;

import chess.Player;
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

        // check top left
        for(int x = i-1, y = j-1; x >= 0 && y >= 0; x--, y--) {
            if(!PossibleMoves.checkColliders(x, y)) {
                PossibleMoves.addPossiblePosition(x, y);
            }
            else break;
        }

        // check top right
        for(int x = i-1, y = j+1; x >= 0 && y <= 7; x--, y++) {
            if(!PossibleMoves.checkColliders(x, y)) {
                PossibleMoves.addPossiblePosition(x, y);
            }
            else break;
        }

        // check bottom right
        for(int x = i+1, y = j+1; x <= 7 && y <= 7; x++, y++) {
            if(!PossibleMoves.checkColliders(x, y)) {
                PossibleMoves.addPossiblePosition(x, y);
            }
            else break;
        }

        // check bottom left
        for(int x = i+1, y = j-1; x <= 7 && y >= 0; x++, y--) {
            if(!PossibleMoves.checkColliders(x, y)) {
                PossibleMoves.addPossiblePosition(x, y);
            }
            else break;
        }
    }

    public void getPossibleCaptures() {
        var i = SelectedPiece.getSelectedPiece().getX();
        var j = SelectedPiece.getSelectedPiece().getY();

        // check top left
        for(int x = i-1, y = j-1; x >= 0 && y >= 0; x--, y--) {
            if(PossibleMoves.checkCaptures(x, y)) {
                PossibleMoves.addPossibleCapture(x, y);
            }
            else break;
        }

        // check top right
        for(int x = i-1, y = j+1; x >= 0 && y <= 7; x--, y++) {
            if(PossibleMoves.checkCaptures(x, y)) {
                PossibleMoves.addPossibleCapture(x, y);
            }
            else break;
        }

        // check bottom right
        for(int x = i+1, y = j+1; x <= 7 && y <= 7; x++, y++) {
            if(PossibleMoves.checkCaptures(x, y)) {
                PossibleMoves.addPossibleCapture(x, y);
            }
            else break;
        }

        // check bottom left
        for(int x = i+1, y = j-1; x <= 7 && y >= 0; x++, y--) {
            if(PossibleMoves.checkCaptures(x, y)) {
                PossibleMoves.addPossibleCapture(x, y);
            }
            else break;
        }
    }

    @Override
    public void deleteSelf() {
        PieceData.RemovePieceFromListByItsId(this.getId());
    }
}
