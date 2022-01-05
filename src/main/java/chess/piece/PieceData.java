package chess.piece;

import java.util.ArrayList;
import java.util.List;

public class PieceData {
    private static List<Piece> pieceList = new ArrayList<>();

    public static List<Piece> getPieceList() {
        return pieceList;
    }

    public static Piece getPieceFromListByItsName(String name) throws Exception {
        for(short i=0; i<pieceList.size(); i++) {
            if(pieceList.get(i).getDisplayName().equals(name)) {
                return pieceList.get(i);
            }
        }
        throw new Exception("Piece not found!");
    }

    public static void setPieceList(List<Piece> newList) {
        pieceList = newList;
    }
}
