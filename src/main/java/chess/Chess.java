package chess;

import chess.events.Mouse;
import chess.movement.Movement;
import chess.piece.Piece;
import chess.piece.PieceData;
import chess.playerdata.DisplayContent;
import chess.playerdata.SelectedPiece;
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
        Renderer renderer = new Renderer();

        //for(int i=0; i<=PieceData.getPieceList().size(); i++) {
           // System.out.println(PieceData.getPieceList().get(i).getDisplayName());
        //}

        while(true) {
            renderer.clear();
            switch (DisplayContent.GetRendererDisplayType()) {
                case Chess:
                    renderer.draw();
                    break;
                case List:
                    renderer.drawList();
                    break;
            }
            Thread.sleep(1000);
        }

        // Board board = new Board(Player.white);
    }
}
