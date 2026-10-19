public class Diem {
    private double x, y;

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double tinhKhoangCach(Diem d) {
        return Math.sqrt(Math.pow(this.x - d.x, 2) + Math.pow(this.y - d.y, 2));
    }
}
