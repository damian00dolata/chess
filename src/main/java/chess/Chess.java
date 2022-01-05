package chess;

import chess.events.Mouse;
import chess.piece.Piece;
import chess.piece.PieceData;
import chess.renderer.Renderer;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import chess.events.Key;

public class Chess {

    public static void main(String[] args) throws InterruptedException {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());
            System.exit(1);
        }
        GlobalScreen.addNativeKeyListener(new Key());
        GlobalScreen.addNativeMouseListener(new Mouse());

        // Board board = new Board(Player.white)

        PieceData.getPieceList().add(new Piece("\u2654", "White King", Player.white));
        PieceData.getPieceList().add(new Piece("\u2655", "White Queen", Player.white));
        PieceData.getPieceList().add(new Piece("\u2656", "White Rook", Player.white));
        PieceData.getPieceList().add(new Piece("\u2657", "White Bishop", Player.white));
        PieceData.getPieceList().add(new Piece("\u2658", "White Knight", Player.white));
        PieceData.getPieceList().add(new Piece("\u2659", "White Pawn", Player.white));

        PieceData.getPieceList().add(new Piece("\u265A", "Black King", Player.black));
        PieceData.getPieceList().add(new Piece("\u265B", "Black Queen", Player.black));
        PieceData.getPieceList().add(new Piece("\u265C", "Black Rook", Player.black));
        PieceData.getPieceList().add(new Piece("\u265D", "Black Bishop", Player.black));
        PieceData.getPieceList().add(new Piece("\u265E", "Black Knight", Player.black));
        PieceData.getPieceList().add(new Piece("\u265F", "Black Pawn", Player.black));

        Renderer renderer = new Renderer();

        //for(int i=0; i<=PieceData.getPieceList().size(); i++) {
           // System.out.println(PieceData.getPieceList().get(i).getDisplayName());
        //}
        while(true) {
            renderer.clear();
            renderer.draw();
            Thread.sleep(1000);
        }
        // Board board = new Board(Player.white);
    }
}
