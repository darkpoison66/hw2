/**
 * Represents the Knight piece in chess
 * @author mabdi3
 * @version 1.0
 */
public class Knight extends Piece {
    /**
     * Creates a King chess piece of a given color
     *
     * @param color the color of the piece
     *
     * @see Color
     */
    public Knight(Color color) {
        super(color);
    }
    @Override
    public String algebraicName() {
        return "N";
    }
    @Override
    public String fenName() {
        if ((this.getColor()) == Color.WHITE) {
            return "N";
        } else {
            return "n";
        }
    }
    @Override
    public Square[] movesFrom(Square square) {
        int rowTo = 8 - Integer.parseInt(square.toString().substring(1));
        int colTo = square.toString().charAt(0) - 97;
        int count = 0;

        for (int rowFrom = 0; rowFrom < 8; rowFrom++) {
            for (int colFrom = 0; colFrom < 8; colFrom++) {
                if ((Math.abs(rowTo - rowFrom) == 2
                    && Math.abs(colTo - colFrom) == 1)
                        || (Math.abs(rowTo - rowFrom) == 1
                            && Math.abs(colTo - colFrom) == 2)) {
                    count++;
                }
            }
        }
        int x = 0;
        Square[] squares = new Square[count];
        for (int rowFrom = 0; rowFrom < 8; rowFrom++) {
            for (int colFrom = 0; colFrom < 8; colFrom++) {
                if ((Math.abs(rowTo - rowFrom) == 2
                    && Math.abs(colTo - colFrom) == 1)
                    || (Math.abs(rowTo - rowFrom) == 1
                     && Math.abs(colTo - colFrom) == 2)) {
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