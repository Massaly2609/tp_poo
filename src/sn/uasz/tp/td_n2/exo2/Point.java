package sn.uasz.tp.td_n2.exo2;

public class Point {
    // Private attributes for coordinates
    private int x;
    private int y;

    // Public constructor to initialize the coordinates
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // Custom toString method returning format: (1,4)
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    // Built-in test main method to instantiate two points
    public static void main(String[] args) {
        Point p1 = new Point(1, 4);
        Point p2 = new Point(2, 5);

        System.out.println("Point 1 coordinates: " + p1);
        System.out.println("Point 2 coordinates: " + p2);
    }
}
