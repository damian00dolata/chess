package chess.piece;

import chess.Player;
import chess.board.Fields;
import chess.playerdata.PlayerTurn;
import chess.playerdata.PossibleMoves;
import chess.playerdata.SelectedPiece;

public class Knight extends Piece implements  IPiece {
    public Knight(String characterDisplay, String displayName, Player teamColor, String id) {
        super(characterDisplay, displayName, teamColor, id);
    }


    @Override
    public void getPossiblePaths() {
        var i = SelectedPiece.getSelectedPiece().getX();
        var j = SelectedPiece.getSelectedPiece().getY();
        var board = Fields.getFields();

        // -1, -2
        var x = i - 1;
        var y = j - 2;
        if(!PossibleMoves.checkColliders(x, y)) {
            PossibleMoves.addPossiblePosition(x, y);
        }
        else {
            if(PossibleMoves.checkCaptures(x, y)) {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
            }
        }

        // -2, -1
        x = i - 2;
        y = j - 1;
        if(!PossibleMoves.checkColliders(x, y)) {
            PossibleMoves.addPossiblePosition(x, y);
        }
        else {
            if(PossibleMoves.checkCaptures(x, y)) {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
            }
        }

        // -2, 1
        x = i - 2;
        y = j + 1;
        if(!PossibleMoves.checkColliders(x, y)) {
            PossibleMoves.addPossiblePosition(x, y);
        }
        else {
            if(PossibleMoves.checkCaptures(x, y)) {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
            }
        }

        // -1, 2
        x = i - 1;
        y = j + 2;
        if(!PossibleMoves.checkColliders(x, y)) {
            PossibleMoves.addPossiblePosition(x, y);
        }
        else {
            if(PossibleMoves.checkCaptures(x, y)) {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
            }
        }

        // 1, 2
        x = i + 1;
        y = j + 2;
        if(!PossibleMoves.checkColliders(x, y)) {
            PossibleMoves.addPossiblePosition(x, y);
        }
        else {
            if(PossibleMoves.checkCaptures(x, y)) {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
            }
        }

        // 2, 1
        x = i + 2;
        y = j + 1;
        if(!PossibleMoves.checkColliders(x, y)) {
            PossibleMoves.addPossiblePosition(x, y);
        }
        else {
            if(PossibleMoves.checkCaptures(x, y)) {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
            }
        }

        // 2, -1
        x = i + 2;
        y = j - 1;
        if(!PossibleMoves.checkColliders(x, y)) {
            PossibleMoves.addPossiblePosition(x, y);
        }
        else {
            if(PossibleMoves.checkCaptures(x, y)) {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
            }
        }

        // 1, -2
        x = i + 1;
        y = j - 2;
        if(!PossibleMoves.checkColliders(x, y)) {
            PossibleMoves.addPossiblePosition(x, y);
        }
        else {
            if(PossibleMoves.checkCaptures(x, y)) {
                if(board[x][y].getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                    PossibleMoves.addPossibleCapture(x, y);
                }
            }
        }
    }

    @Override
    public void deleteSelf() {
        PieceData.RemovePieceFromListByItsId(this.getId());
    }
}
