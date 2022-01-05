package chess.playerdata;

import chess.piece.Piece;

public class SelectedPiece {
    private static Piece selectedPiece;

    public static Piece getSelectedPiece() {
        return selectedPiece;
    }

    public static void setSelectedPiece(Piece selectedPiece) {
        SelectedPiece.selectedPiece = selectedPiece;
    }
}
