package chess.piece;

import chess.Player;
import chess.playerdata.PossibleMoves;
import chess.playerdata.SelectedPiece;

public class Queen extends Piece implements IPiece {
    public Queen(String characterDisplay, String displayName, Player teamColor, String id) {
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

        // w dol
        for(int x=i+1; x<=7; x++) {
            if(!PossibleMoves.checkColliders(x, j)) {
                PossibleMoves.addPossiblePosition(x,j);
            } else {
                break;
            }
        }

        // w gore
        for(int x=i-1; x>=0; x--) {
            if(!PossibleMoves.checkColliders(x, j)) {
                PossibleMoves.addPossiblePosition(x,j);
            } else {
                break;
            }
        }

        // w prawo
        for(int y=j+1; y<=7; y++) {
            if(!PossibleMoves.checkColliders(i, y)) {
                PossibleMoves.addPossiblePosition(i,y);
            } else {
                break;
            }
        }

        // w lewo
        for(int y=j-1; y>=0; y--) {
            if(!PossibleMoves.checkColliders(i, y)) {
                PossibleMoves.addPossiblePosition(i,y);
            } else {
                break;
            }
        }
    }

    @Override
    public void getPossibleCaptures() {

    }
}
