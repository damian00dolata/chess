package chess.playerdata;

import chess.board.Fields;
import math.Vector2i;

import java.util.ArrayList;
import java.util.List;

public final class PossibleMoves {
    private static List<Vector2i> possiblePositions = new ArrayList<Vector2i>();

    public static void addPossiblePosition(int i, int j) {
        boolean newPos = true;
        for(int x=0; x<possiblePositions.size(); x++) {
            if(possiblePositions.get(x).getX() == i && possiblePositions.get(x).getY() == j) {
                newPos = false;
            }
        }
        if(newPos) {
            possiblePositions.add(new Vector2i(i,j));
        }
    }

    public static List<Vector2i> getPossiblePositions() {
        return  possiblePositions;
    }

    public static void clearPossiblePositions() {
        possiblePositions.clear();
    }

    public static boolean checkColliders(int i, int j) {
        var board = Fields.getFields();

        // check if figure is not in corner for example
        if(j > 7 || i > 7 || j < 0 || i < 0) {
            return true;
        }

        if(board[i][j] != null) {
            if(board[i][j].isOccupied()) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public static boolean isPositionMatchWithDraw(int i, int j) {
        if(PossibleMoves.getPossiblePositions().size() > 0) {
            // get the match position on board according to i j
            for(int x=0; x<possiblePositions.size(); x++) {
                if(possiblePositions.get(x).getX() == i && possiblePositions.get(x).getY() == j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean canIGoThere(int x, int y) {
        // mimo ze jest to duplikacja powyzszej funkcji lepiej zostawic ta implementacje osobna
        // gdbyby trzeba bylo zmienic cos tylko przy rendererze albo przy movemencie
        for(int i=0; i<possiblePositions.size(); i++) {
            if(x == possiblePositions.get(i).getX() && y == possiblePositions.get(i).getY()) {
                return true;
            }
        }
        return false;
    }
}
