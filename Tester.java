import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
      /*  Square pawn = new Square("a1");
        Square pawns = new Square("a1");
        Square pawnss = new Square('a', '1');
        System.out.println(pawn.equals(pawns));
        System.out.println(pawns.equals(pawnss));
        System.out.println(pawnss.equals(pawns)); */

        Piece knight = new Knight(Color.BLACK);
        assert knight.algebraicName().equals("N");
        assert knight.fenName().equals("n");
        //System.out.println(knight.fenName().equals("n"));
        //System.out.println(knight.algebraicName().equals("N"));
        Square[] attackedSquares = knight.movesFrom(new Square("f6"));
        //System.out.println(Arrays.toString(attackedSquares));
        // test that attackedSquares contains e8, g8, etc.
        Square a1 = new Square("a1");
        Square otherA1 = new Square('a', '1');
        Square h8 = new Square("h8");
        // System.out.println(a1.equals(otherA1))
        // System.out.println(!a1.equals(h8));
        assert a1.equals(otherA1);
        assert !a1.equals(h8);


        ///* PAWN
        Piece pawn = new Pawn(Color.WHITE);
        //System.out.println(pawn.algebraicName().equals(""));
        //System.out.println(pawn.fenName().equals("P"));
        Square[] attackedPawns = pawn.movesFrom(new Square("a2"));
        System.out.println(Arrays.toString(attackedPawns));

        /* KING
        Piece king = new King(Color.WHITE);
        System.out.println(king.algebraicName().equals("K"));
        System.out.println(king.fenName().equals("K"));
        Square[] attackedKings = king.movesFrom(new Square("f8"));
        System.out.println(Arrays.toString(attackedKings)); */



    }
}