public class Point
{
    private int x;
    private int y;

    public Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    // приемлимо
    public static double triangleArea(Point p1, Point p2, Point p3) {
        return Math.abs(
                (p1.getX() * (p2.getY() - p3.getY()) +
                        p2.getX() * (p3.getY() - p1.getY()) +
                        p3.getX() * (p1.getY() - p2.getY())) / 2.0
        );
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

    public int distanceFromOrigin()
    {
        return (int) Math.sqrt(x * x + y * y);
    }

    public boolean isInRectangle(Point top_left, Point bottom_right)
    {
        return (this.x >= top_left.getX() && this.x <= bottom_right.getX() &&
                this.y >= top_left.getY() && this.y <= bottom_right.getY());
    }

    public boolean isInCircle(Point center, int radius)
    {
        int dx = this.x - center.getX();
        int dy = this.y - center.getY();
        return (dx * dx + dy * dy) <= (radius * radius);
    }
}
