package org.example.Model;

public class PlayingPieceO extends PlayingPiece {

    public PlayingPieceO(){
        super(PieceType.O);
    }

    @Override
    public String toString() {
        return pieceType.toString();
    }
}
