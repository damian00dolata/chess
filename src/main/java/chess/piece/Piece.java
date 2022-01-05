package chess.piece;

import chess.Player;

public class Piece {
    private String characterDisplay;
    private Player teamColor;
    private String displayName;
    private int x;
    private int y;

    public Piece(String characterDisplay, String displayName, Player teamColor) {
        this.characterDisplay = characterDisplay;
        this.displayName = displayName;
        this.teamColor = teamColor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCharacterDisplay() {
        return characterDisplay;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Player getTeamColor() {
        return teamColor;
    }

    public void setCharacterDisplay(String characterDisplay) {
        this.characterDisplay = characterDisplay;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setTeamColor(Player teamColor) {
        this.teamColor = teamColor;
    }
}
