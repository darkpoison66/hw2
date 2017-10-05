public class Square {

    private String name;
    private char rank, file;

    public Square(char file, char rank) {
        this.file = file;
        this.rank = rank;
        name = file + "" + rank;
    }

    public Square(String name) {
        this(name.charAt(0) , name.charAt(1));
        this.name = name;
    }

    public String toString() {
        return String.format("%c%c", file, rank);
    }
    @Override
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

