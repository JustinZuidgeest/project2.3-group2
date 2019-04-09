package Games.TicTacToe.TictactoeModels;

import Games.Tile;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class TictactoeRandomAI extends AbstractTictactoeModel {

    public TictactoeRandomAI(int boardSize) {
        super(boardSize);
    }

    @Override
    public Point nextMove(Tile player) {
        Random random = new Random();
        updateLegalMoves(player);
        ArrayList<Point> legalMoves = getLegalMoves(player);
        return legalMoves.get(random.nextInt(legalMoves.size()));
    }
}