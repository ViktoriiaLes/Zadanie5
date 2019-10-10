public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isInQuarter1() {
        if (x > 0 && y > 0)
            return true;
        return false;
    }

    public boolean isInQuarter2() {
        if (x < 0 && y > 0)
            return true;
        return false;
    }

    public boolean isInQuarter3() {
        if (x < 0 && y < 0)
            return true;
        return false;
    }

    public boolean isInQuarter4() {
        if (x > 0 && y < 0)
            return true;
        return false;
    }

    public boolean isOnX() {
        if (y == 0)
            return true;
        return false;
    }

    public boolean isOnY() {
        if (x == 0)
            return true;
        return false;
    }

    public boolean isZero() {
        if (isOnY() && isOnX())
            return true;
        return false;
    }
}