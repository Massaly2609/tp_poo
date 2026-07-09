package sn.uasz.tp.td.n2.exo2;

public class Segment {
    // Composite attributes of type Point
    private Point p1;
    private Point p2;

    // Constructor to initialize the segment extremities
    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Custom toString method returning format: [(1,4)..(2,5)]
    @Override
    public String toString() {
        return "[" + this.p1.toString() + ".." + this.p2.toString() + "]";
    }

    // Main method to test segment instantiation via command line inputs
    public static void main(String[] args) {
        // We need 4 arguments: x1, y1 for Point 1 and x2, y2 for Point 2
        if (args.length < 4) {
            System.out.println("Usage: java Segment <x1> <y1> <x2> <y2>");
            return;
        }

        // Parsing the command line coordinates
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);

        // Creating both Point objects
        Point pointStart = new Point(x1, y1);
        Point pointEnd = new Point(x2, y2);

        // Creating the Segment object using the points
        Segment segment = new Segment(pointStart, pointEnd);

        // Displaying the generated segment format
        System.out.println("The generated segment is: " + segment);
    }
}