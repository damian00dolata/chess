package chess.events;

import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseInputListener;

public class Mouse implements NativeMouseInputListener {
    @Override
    public void nativeMouseClicked(NativeMouseEvent nativeEvent) {
        NativeMouseInputListener.super.nativeMouseClicked(nativeEvent);
    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent nativeEvent) {
        NativeMouseInputListener.super.nativeMouseReleased(nativeEvent);
    }
}
