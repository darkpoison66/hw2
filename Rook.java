/**
 * Represents the Rook piece in chess
 * @author mabdi3
 * @version 1.0
 */
public class Rook extends Piece {
    /**
     * Creates a Rook chess piece of a given color
     *
     * @param color the color of the piece
     *
     * @see Color
     */
    public Rook(Color color) {
        super(color);
    }

    @Override
    public String algebraicName() {
        return "R";
    }

    @Override
    public String fenName() {
        if (this.getColor() == Color.WHITE) {
            return "R";
        } else {
            return "r";
        }
    }

    @Override
    public Square[] movesFrom(Square square) {
        int rowTo = 8 - Integer.parseInt(square.toString().substring(1));
        int colTo = square.toString().charAt(0) - 97;
        int count = 0;

        for (int rowFrom = 0; rowFrom < 8; rowFrom++) {
            for (int colFrom = 0; colFrom < 8; colFrom++) {
                if ((rowTo == rowFrom || colTo == colFrom)
                    && !(rowTo == rowFrom && colFrom == colTo)) {
                    count++;
                }
            }
        }

        int x = 0;
        Square[] squares = new Square[count];
        for (int rowFrom = 0; rowFrom < 8; rowFrom++) {
            for (int colFrom = 0; colFrom < 8; colFrom++) {
                if ((rowTo == rowFrom || colTo == colFrom)
                    && !(rowTo == rowFrom && colFrom == colTo)) {
                    char row = Integer.toString(8 - rowFrom).charAt(0);
                    char col = (char) (colFrom + 'a');
                    Square temp = new Square(col, row);
                    squares[x] = temp;
                    x++;
                }
            }
        }
        return squares;
    }
}
