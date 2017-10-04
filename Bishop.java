public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color);
    }
    @Override
    public String algebraicName() {
        return "B";
    }
    @Override
    public String fenName() {
        if (this.getColor() == Color.WHITE) {
            return "B";
        } else {
            return "b";
        }
    }
    @Override
    public Square[] movesFrom(Square square) {
        int rowTo = 8 - Integer.parseInt(square.toString().substring(1));
        int colTo = square.toString().charAt(0) - 97;
        int count = 0;

        for (int rowFrom = 0; rowFrom < 8; rowFrom++) {
            for (int colFrom = 0; colFrom < 8; colFrom++) {
                if (((Math.abs(rowFrom - rowTo)) == Math.abs(colFrom - colTo))
                    && !(rowTo == rowFrom && colFrom == colTo)) {
                    count++;
                }
            }
        }

        int x = 0;
        Square[] squares = new Square[count];
        for (int rowFrom = 0; rowFrom < 8; rowFrom++) {
            for (int colFrom = 0; colFrom < 8; colFrom++) {
                if (((Math.abs(rowFrom - rowTo)) == Math.abs(colFrom - colTo))
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