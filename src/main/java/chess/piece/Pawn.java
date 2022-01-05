package chess.piece;

import chess.Player;
import chess.board.Fields;
import chess.playerdata.PlayerTurn;
import chess.playerdata.SelectedPiece;

public class Pawn extends Piece {
    public Pawn(String characterDisplay, String displayName, Player teamColor, String id) {
        super(characterDisplay, displayName, teamColor, id);
    }

    public void getPossiblePaths() {
        if(PlayerTurn.getCurrentPlayer() == Player.white) {
            var i = SelectedPiece.getSelectedPiece().getX();
            var board = Fields.getFields();
            if (!board[i + 1][SelectedPiece.getSelectedPiece().getY()].isOccupied()) {

            }
        }
    }

    // getPossibleCaptures()
}
