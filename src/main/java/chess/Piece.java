package chess;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public class Piece implements Movement {
    Player colour;

    int pos_x;

    int pos_y;

    public List<Pair<Integer, Integer>> move(Board b) {
        return null;
    }

    TypeOfPiece type;

    public Piece(Player colour, int pos_x, int pos_y, TypeOfPiece type) {
        this.colour = colour;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.type = type;
    }
}
