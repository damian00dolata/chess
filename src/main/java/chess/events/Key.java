package chess.events;

import chess.board.Fields;
import chess.enums.Directions;
import chess.enums.RendererDisplayType;
import chess.movement.Movement;
import chess.piece.PieceData;
import chess.playerdata.*;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.NativeInputEvent;
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
        // 57419 - lewo
        // 57416 - góra
        // 57424 - dól
        // 57421 - prawo



        if(DisplayContent.getRendererDisplayType() == RendererDisplayType.Search) {
            if(nativeEvent.getKeyCode() == NativeKeyEvent.VC_CONTROL) {
                DisplayContent.setRendererDisplayType(RendererDisplayType.Chess);
            }
            return;
        }


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
                    var board = Fields.getFields();
                    var cursorPos = CursorPosition.getCurrentPos();
                    var testedCase = board[cursorPos.getX()][cursorPos.getY()];
                    if(testedCase.isOccupied() && testedCase.getOccupiedPieceReference().getTeamColor() != PlayerTurn.getCurrentPlayer()) {
                        Movement.capture(CursorPosition.getCurrentPos().getX(), CursorPosition.getCurrentPos().getY());
                    } else {
                        Movement.move(CursorPosition.getCurrentPos().getX(), CursorPosition.getCurrentPos().getY());
                    }

                }
                break;
            case NativeKeyEvent.VC_SHIFT:
                SelectedPiece.setSelectedPiece(null);
                PossibleMoves.clearPossiblePositions();
                PossibleMoves.clearPossibleCaptures();
                break;
            case NativeKeyEvent.VC_L:
                DisplayContent.setRendererDisplayType(RendererDisplayType.List);
                break;
            case NativeKeyEvent.VC_P:
                DisplayContent.setRendererDisplayType(RendererDisplayType.Chess);
                break;
            case NativeKeyEvent.VC_CONTROL:
                DisplayContent.setRendererDisplayType(RendererDisplayType.Search);
                break;
        }
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeEvent) {
        NativeKeyListener.super.nativeKeyTyped(nativeEvent);
    }
}
