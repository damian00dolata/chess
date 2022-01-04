package chess;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public interface Movement {
    List<Pair<Integer, Integer>> move(Board b);
}