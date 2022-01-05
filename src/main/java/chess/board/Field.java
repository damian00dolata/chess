package chess.board;

import chess.Player;
import chess.TypeOfPiece;
import chess.piece.Piece;

public class Field {
    private boolean occupied;
    private Player occupiedPlayerColor;
    private TypeOfPiece occupiedTypeOfPiece;
    private Piece occupiedPieceReference;
    private boolean isCursorAtField;
    private String displayCharacter;

    public String getDisplayCharacter() {
        return displayCharacter;
    }

    public void setDisplayCharacter(String displayCharacter) {
        this.displayCharacter = displayCharacter;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public Player getOccupiedPlayerColor() {
        return occupiedPlayerColor;
    }

    public void setOccupiedPlayerColor(Player occupiedPlayerColor) {
        this.occupiedPlayerColor = occupiedPlayerColor;
    }

    public TypeOfPiece getOccupiedTypeOfPiece() {
        return occupiedTypeOfPiece;
    }

    public void setOccupiedTypeOfPiece(TypeOfPiece occupiedTypeOfPiece) {
        this.occupiedTypeOfPiece = occupiedTypeOfPiece;
    }

    public boolean isCursorAtField() {
        return isCursorAtField;
    }

    public void setCursorAtField(boolean cursorAtField) {
        isCursorAtField = cursorAtField;
    }

    public Piece getOccupiedPieceReference() {
        return  occupiedPieceReference;
    }

    public void setOccupiedPieceReference(Piece occupiedPieceReference) {
        this.occupiedPieceReference = occupiedPieceReference;
    }

    public Field() {
        occupied = false;
        occupiedPlayerColor = Player.none;
        occupiedTypeOfPiece = TypeOfPiece.none;
        isCursorAtField = false;
    }
}
