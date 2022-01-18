package chess.piece;

public interface IPiece {
    public void getPossiblePaths();
    public void getPossibleCaptures();
    public void deleteSelf();
}
