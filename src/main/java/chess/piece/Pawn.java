package chess.piece;

import chess.Player;
import chess.board.Fields;
import chess.playerdata.PlayerTurn;
import chess.playerdata.PossibleMoves;
import chess.playerdata.SelectedPiece;

public class Pawn extends Piece implements IPiece {
    public Pawn(String characterDisplay, String displayName, Player teamColor, String id) {
        super(characterDisplay, displayName, teamColor, id);
    }

    @Override
    public void getPossiblePaths() {
        var i = SelectedPiece.getSelectedPiece().getX();
        var j = SelectedPiece.getSelectedPiece().getY();

        if(PlayerTurn.getCurrentPlayer() == Player.white) {
            // sprawdzam tylko pole przed pionem
            if(!PossibleMoves.checkColliders(i+1, j)) {
                PossibleMoves.addPossiblePosition(i+1, j);
            }

        } else {
            if(!PossibleMoves.checkColliders(i-1, j)) {
                PossibleMoves.addPossiblePosition(i-1, j);
            }
        }
    }

    @Override
    public void getPossibleCaptures() {

    }

    // getPossibleCaptures()
}
