package chess.playerdata;

import chess.enums.RendererDisplayType;

public class DisplayContent {
    private static RendererDisplayType rendererDisplayType = RendererDisplayType.Chess;

    public static void SetRendererDisplayType(RendererDisplayType displayType) {
        rendererDisplayType = displayType;
    }

    public static RendererDisplayType GetRendererDisplayType() {
        return rendererDisplayType;
    }
}
