package chess;

import chess.events.Mouse;
import chess.renderer.Renderer;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import chess.events.Key;

public class Chess {

    public static void main(String[] args) {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());
            System.exit(1);
        }
        GlobalScreen.addNativeKeyListener(new Key());
        GlobalScreen.addNativeMouseListener(new Mouse());

        // Board board = new Board(Player.white);
        Renderer renderer = new Renderer();

        while(true) {
            // renderer.clear();
            renderer.draw();
        }
        // Board board = new Board(Player.white);
    }
}
