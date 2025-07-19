package org.example.Model;

public class PlayingPieceX extends PlayingPiece{

    public PlayingPieceX(){
        super(PieceType.X);
    }

    @Override
    public String toString() {
        return  pieceType.toString();
    }
}
