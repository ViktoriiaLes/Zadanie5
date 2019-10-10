public class Program {
    public static void main(String[] args) {
        testLineCalculation(new Point(0, 0), new Point(0, 0), new Point(0, 0));
        testLineCalculation(new Point(0, 0), new Point(4, 4), new Point(5, 5));
        testLineCalculation(new Point(1, 0), new Point(4, 4), new Point(5, 5));

        testLine(new Line(new Point(0, 0), new Point(4, 4)));
        testLine(new Line(new Point(4, 4), new Point(5, 5)));
        testLine(new Line(new Point(5, 5), new Point(0, 0)));
        testPoint(new Point(1, 1));
        testPoint(new Point(-10, 1));
        testPoint(new Point(1, -11));
        testPoint(new Point(-31, -13));
        testPoint(new Point(8, 0));
        testPoint(new Point(0, 5));
        testPoint(new Point(0, 0));
    }

    public static void testPoint(Point point) {
        System.out.println("-----------------------------testPoint--------------------------------");
        System.out.printf("Tests for point with coordinate (%.2f, %.2f)\n", point.x, point.y);
        System.out.printf("is in quarter I: %s\n", point.isInQuarter1());
        System.out.printf("is in quarter II: %s\n", point.isInQuarter2());
        System.out.printf("is in quarter III: %s\n", point.isInQuarter3());
        System.out.printf("is in quarter IV: %s\n", point.isInQuarter4());
        System.out.printf("is on X: %s\n", point.isOnX());
        System.out.printf("is on Y: %s\n", point.isOnY());
        System.out.printf("is Zero: %s\n", point.isZero());
    }

    private static void testLine(Line line) {
        System.out.println("---------------Call of testLine- and testLineWithLineCalculation------------");
        System.out.printf("Line with point1 (%.2f, %.2f) point2 (%.2f, %.2f)\n", line.point1.x, line.point1.y, line.point2.x, line.point2.y);
        System.out.printf("has length from line.Length(): %.2f\n", line.length());
        System.out.printf("has length new LineCalculation().Length(line): %.2f\n", new LineCalculation().length(line));
    }

    private static void testLineCalculation(Point point1, Point point2, Point point3) {
        System.out.println("---------------Call of testLineCalculation-------------");
        System.out.printf("Points: (%.2f, %.2f),  (%.2f, %.2f),  (%.2f, %.2f)\n", point1.x,
                point1.y, point2.x, point2.y, point3.x, point3.y);
        System.out.printf("Is triangle: %s\n", new LineCalculation().isTriangle(point1, point2, point3));
    }
}
