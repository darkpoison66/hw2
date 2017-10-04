import java.util.Arrays;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color);
    }

    @Override

    public String algebraicName() {
        return "";
    }
    @Override
    public String fenName() {
        if ((this.getColor()) == Color.WHITE) {
            return "P";
        } else {
            return "p";
        }
    }
    @Override
    public Square[] movesFrom(Square square) {
        int rowTo = 8 - Integer.parseInt(square.toString().substring(1));
        int colTo = square.toString().charAt(0) - 97;
        int count = 0;

        for (int rowFrom = 0; rowFrom < 8; rowFrom++) {
            for (int colFrom = 0; colFrom < 8; colFrom++) {
                if (this.getColor() == Color.WHITE) {
                    if (rowTo == 4) {
                        if (((rowFrom - rowTo == 2) && (colFrom == colTo)) || ((rowFrom - rowTo == 1)
                                && (colFrom == colTo))
                                || (((rowFrom - rowTo) == 1)
                                && (Math.abs(colFrom - colTo) == 1))) {
                            count++;
                        }
                    } else {
                        if (((rowFrom - rowTo == 1) && (colFrom == colTo))
                                || (((rowFrom - rowTo) == 1)
                                && (Math.abs(colFrom - colTo) == 1))) {
                            count++;
                        }
                    }
                } else {
                    if (rowTo == 3) {
                        if (((rowTo - rowFrom == 1) && (colFrom == colTo))
                                || ((rowTo - rowFrom == 2) && (colFrom == colTo))
                                || (((rowTo - rowFrom) == 1)
                                && (Math.abs(colTo - colFrom) == 1))) {
                            count++;
                        } else {
                            if (((rowTo - rowFrom == 1) && (colFrom == colTo))
                                    || (((rowTo - rowFrom) == 1)
                                    && (Math.abs(colTo - colFrom) == 1))) {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        int x = 0;
        Square[] squares = new Square[count];
        for (int rowFrom = 0; rowFrom < 8; rowFrom++) {
            for (int colFrom = 0; colFrom < 8; colFrom++) {
                if (this.getColor() == Color.WHITE) {
                    if (rowTo == 4) {
                        if (((rowFrom - rowTo == 2) && (colFrom == colTo)) || ((rowFrom - rowTo == 1)
                                && (colFrom == colTo))
                                || (((rowFrom - rowTo) == 1)
                                && (Math.abs(colFrom - colTo) == 1))) {
                            char row = Integer.toString(8 - rowFrom).charAt(0);
                            char col = (char) (colFrom + 'a');
                            Square temp = new Square(col, row);
                            squares[x] = temp;
                            x++;
                        }
                    } else {
                        if (((rowFrom - rowTo == 1) && (colFrom == colTo))
                                || (((rowFrom - rowTo) == 1)
                                && (Math.abs(colFrom - colTo) == 1))) {
                            char row = Integer.toString(8 - rowFrom).charAt(0);
                            char col = (char) (colFrom + 'a');
                            Square temp = new Square(col, row);
                            squares[x] = temp;
                            x++;
                        }
                    }
                } else {
                    if (rowTo == 3) {
                        if (((rowTo - rowFrom == 1) && (colFrom == colTo))
                                || ((rowTo - rowFrom == 2) && (colFrom == colTo))
                                || (((rowTo - rowFrom) == 1)
                                && (Math.abs(colTo - colFrom) == 1))) {
                            char row = Integer.toString(8 - rowFrom).charAt(0);
                            char col = (char) (colFrom + 'a');
                            Square temp = new Square(col, row);
                            squares[x] = temp;
                            x++;
                        } else {
                            if (((rowTo - rowFrom == 1) && (colFrom == colTo))
                                    || (((rowTo - rowFrom) == 1)
                                    && (Math.abs(colTo - colFrom) == 1))) {
                                char row = Integer.toString(8 - rowFrom).charAt(0);
                                char col = (char) (colFrom + 'a');
                                Square temp = new Square(col, row);
                                squares[x] = temp;
                                x++;
                            }
                        }
                    }
                }
            }
        }
        return squares;
    }
}

