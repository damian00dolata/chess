package chess.events;

import chess.board.Fields;
import chess.enums.Directions;
import chess.movement.Movement;
import chess.playerdata.CursorPosition;
import chess.playerdata.SelectedPiece;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class Key implements NativeKeyListener {
    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeEvent) {
        NativeKeyListener.super.nativeKeyPressed(nativeEvent);
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeEvent) {
        NativeKeyListener.super.nativeKeyReleased(nativeEvent);
        System.out.println(nativeEvent.getKeyCode());
        // 57419 - lewo
        // 57416 - góra
        // 57424 - dól
        // 57421 - prawo
        switch (nativeEvent.getKeyCode()) {
            case NativeKeyEvent.VC_ESCAPE:
                System.exit(0);
                break;
            case 57419:
                CursorPosition.moveCursor(Directions.Left);
                break;
            case 57416:
                CursorPosition.moveCursor(Directions.Up);
                break;
            case 57424:
                CursorPosition.moveCursor(Directions.Down);
                break;
            case 57421:
                CursorPosition.moveCursor(Directions.Right);
                break;
            case NativeKeyEvent.VC_ENTER:
                if(SelectedPiece.getSelectedPiece() == null) {
                    Movement.selectPiece();
                } else {
                    Movement.move(CursorPosition.getCurrentPos().getX(), CursorPosition.getCurrentPos().getY());
                }
                break;
        }
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeEvent) {
        NativeKeyListener.super.nativeKeyTyped(nativeEvent);
    }
}
