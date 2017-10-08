
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
        int rowFrom = 8 - Integer.parseInt(square.toString().substring(1));
        int colFrom = square.toString().charAt(0) - 97;
        int count = 0;

        for (int rowTo = 0; rowTo < 8; rowTo++) {
            for (int colTo = 0; colTo < 8; colTo++) {
                if (this.getColor() == Color.WHITE
                    && !(rowFrom == 7 || rowFrom == 0)) {
                    if (rowFrom == 6) {
                        if (((rowFrom - rowTo == 2
                            && !(rowFrom == 7 || rowFrom == 0))
                                || (rowFrom - rowTo == 1))
                                && (colFrom == colTo)) {
                            count++;
                        }
                    } else {
                        if ((rowFrom - rowTo == 1
                            && !(rowFrom == 7 || rowFrom == 0))
                                && (colFrom == colTo)) {
                            count++;
                        }
                    }
                } else {
                    if (rowFrom == 1) {
                        if (((rowTo - rowFrom == 2) || (rowTo - rowFrom == 1)
                            && !(rowFrom == 7 || rowFrom == 0))
                                && (colFrom == colTo)) {
                            count++;
                        }
                    } else {
                        if ((rowTo - rowFrom == 1) && (colFrom == colTo)
                            && !(rowFrom == 7 || rowFrom == 0)) {
                            count++;
                        }
                    }
                }
            }
        }
        int x = 0;
        Square[] squares = new Square[count];

        for (int rowTo = 0; rowTo < 8; rowTo++) {
            for (int colTo = 0; colTo < 8; colTo++) {
                if (this.getColor() == Color.WHITE
                    && !(rowFrom == 7 || rowFrom == 0)) {
                    if (rowFrom == 6) {
                        if (((rowFrom - rowTo == 2)
                                || (rowFrom - rowTo == 1))
                                && (colFrom == colTo)) {
                            char row = Integer.toString(8 - rowTo).charAt(0);
                            char col = (char) (colTo + 'a');
                            Square temp = new Square(col, row);
                            squares[x] = temp;
                            x++;
                        }
                    } else {
                        if ((rowFrom - rowTo == 1)
                                && (colFrom == colTo)
                                && !(rowFrom == 7 || rowFrom == 0)) {
                            char row = Integer.toString(8 - rowTo).charAt(0);
                            char col = (char) (colTo + 'a');
                            Square temp = new Square(col, row);
                            squares[x] = temp;
                            x++;
                        }
                    }
                } else {
                    if (rowFrom == 1) {
                        if (((rowTo - rowFrom == 2) || (rowTo - rowFrom == 1)
                            && !(rowFrom == 7 || rowFrom == 0))
                                && (colFrom == colTo)) {
                            char row = Integer.toString(8 - rowTo).charAt(0);
                            char col = (char) (colTo + 'a');
                            Square temp = new Square(col, row);
                            squares[x] = temp;
                            x++;
                        }
                    } else {
                        if ((rowTo - rowFrom == 1) && (colFrom == colTo)
                            && !(rowFrom == 7 || rowFrom == 0)) {
                            char row = Integer.toString(8 - rowTo).charAt(0);
                            char col = (char) (colTo + 'a');
                            Square temp = new Square(col, row);
                            squares[x] = temp;
                            x++;
                        }
                    }
                }
            }
        }
        return squares;
    }
}