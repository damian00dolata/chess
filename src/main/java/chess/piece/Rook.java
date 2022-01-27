package chess.piece;

import chess.Player;
import chess.board.Fields;
import chess.playerdata.PlayerTurn;
import chess.playerdata.PossibleMoves;
import chess.playerdata.SelectedPiece;

public class Rook extends Piece implements IPiece{
    public Rook(String characterDisplay, String displayName, Player teamColor, String id) {
        super(characterDisplay, displayName, teamColor, id);
    }

    @Override
    public void getPossiblePaths() {
        var i = SelectedPiece.getSelectedPiece().getX();
        var j = SelectedPiece.getSelectedPiece().getY();
        var board = Fields.getFields();

        // w dol
        for(int x=i+1; x<=7; x++) {
            if(!PossibleMoves.checkColliders(x, j)) {
                PossibleMoves.addPossiblePosition(x,j);
            }
            else {
                if(board[x][j].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, j);
                }
                break;
            }
        }

        // w gore
        for(int x=i-1; x>=0; x--) {
            if(!PossibleMoves.checkColliders(x, j)) {
                PossibleMoves.addPossiblePosition(x,j);
            }
            else {
                if(board[x][j].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, j);
                }
                break;
            }
        }

        // w prawo
        for(int y=j+1; y<=7; y++) {
            if(!PossibleMoves.checkColliders(i, y)) {
                PossibleMoves.addPossiblePosition(i,y);
            }
            else {
                if(board[i][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(i, y);
                }
                break;
            }
        }

        // w lewo
        for(int y=j-1; y>=0; y--) {
            if(!PossibleMoves.checkColliders(i, y)) {
                PossibleMoves.addPossiblePosition(i,y);
            }
            else {
                if(board[i][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(i, y);
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
