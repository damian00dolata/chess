package chess.board;

import chess.piece.Piece;

public class Field {
    private boolean occupied;
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
        isCursorAtField = false;
    }
}
