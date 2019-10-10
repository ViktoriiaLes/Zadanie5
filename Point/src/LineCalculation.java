public class LineCalculation {
    public double length(Line line) {
        return Math.sqrt(Math.pow(line.point1.x - line.point2.x, 2) + Math.pow(line.point1.y - line.point2.y, 2));
    }

    public boolean isTriangle(Point point1, Point point2, Point point3) {
        Line line1=new Line(point1, point2);
        Line line2=new Line(point2, point3);
        Line line3=new Line(point3, point1);
        if (length(line1) == length(line2) + length(line3)
                || (length(line2) == length(line1) + length(line3))
                || (length(line3) == length(line1) + length(line2)))
            return false;
        return true;
    }
}

