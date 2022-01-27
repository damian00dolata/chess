package chess.piece;

import chess.Player;
import chess.board.Fields;
import chess.playerdata.PlayerTurn;
import chess.playerdata.PossibleMoves;
import chess.playerdata.SelectedPiece;

public class King extends Piece implements IPiece {
    public King(String characterDisplay, String displayName, Player teamColor, String id) {
        super(characterDisplay, displayName, teamColor, id);
    }

    @Override
    public void getPossiblePaths() {
        var i = SelectedPiece.getSelectedPiece().getX();
        var j = SelectedPiece.getSelectedPiece().getY();
        var board = Fields.getFields();

        for(int x=i-1; x<=i+1; x++) {
            for(int y=j-1; y<=j+1; y++) {
                if(!PossibleMoves.checkColliders(x,y)) {
                    PossibleMoves.addPossiblePosition(x,y);
                }
                else {
                    if(PossibleMoves.checkCaptures(x, y)) {
                        if (board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer() && board[x][y].getOccupiedPieceReference().getClass() != King.class) {
                            PossibleMoves.addPossibleCapture(x, y);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void deleteSelf() {
        PieceData.RemovePieceFromListByItsId(this.getId());
    }
}
