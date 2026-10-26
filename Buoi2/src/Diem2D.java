import java.util.Scanner;

public class Diem2D {
    protected double x;
    protected double y;

    public Diem2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Diem2D nhap(Scanner sc, String ten) {
        System.out.print("Nhập x (" + ten + "): ");
        double x = sc.nextDouble();
        System.out.print("Nhập y (" + ten + "): ");
        double y = sc.nextDouble();
        return new Diem2D(x, y);
    }

    public double tinhKhoangCach(Diem2D d) {
        return Math.hypot(this.x - d.x, this.y - d.y);
    }

    public Diem2D diemDoiXung() {
        return new Diem2D(-this.x, -this.y);
    }

    public void tinhTien(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
