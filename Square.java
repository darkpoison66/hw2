/**
 * Represents a square on a chess board
 *
 * @author mabdi3
 * @version 1.0
 */
public class Square {

    private String name;
    private char rank, file;

    /**
     * Creats a Square with all required paramters.
     *
     * @param file the file in which the square presides
     * @param rank the rank in which the square presides
     */
    public Square(char file, char rank) {
        this.file = file;
        this.rank = rank;
        name = file + "" + rank;
    }

    /**
    * Creates a Square with a rank and file with all required parameters.
    *
    * @param name the name of the square written as file and rank
    */
    public Square(String name) {
        this(name.charAt(0) , name.charAt(1));
        this.name = name;
    }

    /**
     * @return this square's rank and file
     */
    public String toString() {
        return String.format("%c%c", file, rank);
    }

    @Override
    /**
     * Evaluates whether or not other has the same name or rank and file
     * as the Square that is invoking the method.
     *
     * @param other other object to be used in comparison to Square object
     *        invoking the method.
     *
     * @return true if the Object other has the same rank and file as the
     *         Square invoking the method, and false otherwise.
     */
    public boolean equals(Object other) {
        if (null == other) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof Square)) {
            return false;
        }
        Square that = (Square) other;
        return this.name.equals(that.name);
    }
}

