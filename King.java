import java.util.Arrays;

public class King extends Piece {

    public King(Color color) {
        super(color);
    }
    @Override
    public String algebraicName() {
       return "K";
    }
    @Override
    public String fenName() {
        if ((this.getColor()) == Color.WHITE) {
            return "K";
        } else {
            return "k";
        }
    }
    @Override
    public Square[] movesFrom(Square square) {
        int rowTo = 8 - Integer.parseInt(square.toString().substring(1));
        int colTo = square.toString().charAt(0) - 97;
        int count = 0;

        for (int rowFrom = 0; rowFrom < 8; rowFrom++) {
            for (int colFrom = 0; colFrom < 8; colFrom++) {
                if (((colTo == colFrom) && (Math.abs(rowTo - rowFrom) == 1))
                        || ((Math.abs(rowTo - rowFrom) == 1) && (Math.abs(colTo - colFrom) == 1))
                        || ((rowTo == rowFrom) && (Math.abs(colTo - colFrom) == 1))) {
                    count++;
                }
            }
        }

        int x = 0;
        Square[] squares = new Square[count];
        for (int rowFrom = 0; rowFrom < 8; rowFrom++) {
            for (int colFrom = 0; colFrom < 8; colFrom++) {
                if (((colTo == colFrom) && (Math.abs(rowTo - rowFrom) == 1))
                        || ((Math.abs(rowTo - rowFrom) == 1) && (Math.abs(colTo - colFrom) == 1))
                        || ((rowTo == rowFrom) && (Math.abs(colTo - colFrom) == 1))) {
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
