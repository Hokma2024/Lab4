public class Point3D extends Point
{
    private int z;

    public Point3D()
    {
        super(0, 0);
        this.z = 0;
    }

    public Point3D(int x, int y, int z)
    {
        super(x, y);
        this.z = z;
    }

    public void setLocation(int x, int y, int z)
    {
        super.setLocation(x, y);
        this.z = z;
    }

    @Override
    public void setLocation(int x, int y)
    {
        super.setLocation(x, y);
        this.z = 0;
    }
    public static double tetrahedronVolume(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        // За что?
        double volume = Math.abs(
                (p1.getX() - p4.getX()) * ((p2.getY() - p4.getY()) * (p3.getZ() - p4.getZ()) - (p3.getY() - p4.getY()) * (p2.getZ() - p4.getZ())) -
                        (p1.getY() - p4.getY()) * ((p2.getX() - p4.getX()) * (p3.getZ() - p4.getZ()) - (p3.getX() - p4.getX()) * (p2.getZ() - p4.getZ())) +
                        (p1.getZ() - p4.getZ()) * ((p2.getX() - p4.getX()) * (p3.getY() - p4.getY()) - (p3.getX() - p4.getX()) * (p2.getY() - p4.getY()))
        ) / 6.0;
        return volume;
    }
    public int getZ()
    {
        return this.z;
    }

    @Override
    public String toString()
    {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }

    @Override
    public int distanceFromOrigin()
    {
        int x = getX();
        int y = getY();
        return (int) Math.sqrt(x * x + y * y + z * z);
    }

    public boolean isInBox(Point3D corner1, Point3D corner2)
    {
        return (this.getX() >= Math.min(corner1.getX(), corner2.getX()) &&
                this.getX() <= Math.max(corner1.getX(), corner2.getX()) &&
                this.getY() >= Math.min(corner1.getY(), corner2.getY()) &&
                this.getY() <= Math.max(corner1.getY(), corner2.getY()) &&
                this.getZ() >= Math.min(corner1.getZ(), corner2.getZ()) &&
                this.getZ() <= Math.max(corner1.getZ(), corner2.getZ()));
    }

    public boolean isInSphere(Point3D center, int radius)
    {
        int dx = this.getX() - center.getX();
        int dy = this.getY() - center.getY();
        int dz = this.z - center.getZ();
        return (dx * dx + dy * dy + dz * dz) <= (radius * radius);
    }
}
