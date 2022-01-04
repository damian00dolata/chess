package chess;

public class Board {
    //Charset utf8Charset = Charset.forName("UTF-8");

    Piece [] [] board = new Piece[8][];

    Player current;

    public Board(Player current) {
        this.current = current;
        for(int i=0; i<=7; i++) {
            board[i] = new Piece[8];
            for(int j=0; j<=7; j++) {
                if(i == 1) {
                    board[i][j] = new Piece(Player.white, i, j, TypeOfPiece.pawn);
                }
                if(i == 6) {
                    board[i][j] = new Piece(Player.black, i, j, TypeOfPiece.pawn);
                }
                if(i == 0 || i == 7) {
                    switch(j) {
                        case 0:
                        case 7:
                            board[i][j] = new Piece(i == 0?Player.white:Player.black, i, j, TypeOfPiece.rook);
                            break;
                        case 1:
                        case 6:
                            board[i][j] = new Piece(i == 0?Player.white:Player.black, i, j, TypeOfPiece.knight);
                            break;
                        case 2:
                        case 5:
                            board[i][j] = new Piece(i == 0?Player.white:Player.black, i, j, TypeOfPiece.bishop);
                            break;
                        case 3:
                            board[i][j] = new Piece(i == 0?Player.white:Player.black, i, j, TypeOfPiece.queen);
                            break;
                        case 4:
                            board[i][j] = new Piece(i == 0?Player.white:Player.black, i, j, TypeOfPiece.king);
                            break;
                    }
                }
            }
        }
        for(int i=0;i<=7;i++) {
            for(int j=0;j<=7;j++) {
                if(board[i][j] != null) {
                    switch (board[i][j].type) {
                        case king:
                            System.out.print(board[i][j].colour == Player.white ? "\u2654" : "\u265A");
                            break;
                        case queen:
                            System.out.print(board[i][j].colour == Player.white ? "\u2655" : "\u265B");
                            break;
                        case rook:
                            System.out.print(board[i][j].colour == Player.white ? "\u2656" : "\u265C");
                            break;
                        case bishop:
                            System.out.print(board[i][j].colour == Player.white ? "\u2657" : "\u265D");
                            break;
                        case knight:
                            System.out.print(board[i][j].colour == Player.white ? "\u2658" : "\u265E");
                            break;
                        case pawn:
                            System.out.print(board[i][j].colour == Player.white ? "\u2659" : "\u265F");
                            break;
                        default:
                            break;
                    }
                }
                if(j == 7) System.out.println("");
            }
        }
    }
}
