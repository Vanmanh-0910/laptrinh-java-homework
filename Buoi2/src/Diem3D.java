import java.util.Scanner;

public class Diem3D extends Diem2D {
    protected double z;

    public Diem3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public static Diem3D nhap(Scanner sc, String ten) {
        System.out.print("Nhập x (" + ten + "): ");
        double x = sc.nextDouble();
        System.out.print("Nhập y (" + ten + "): ");
        double y = sc.nextDouble();
        System.out.print("Nhập z (" + ten + "): ");
        double z = sc.nextDouble();
        return new Diem3D(x, y, z);
    }

    public double tinhKhoangCach(Diem3D d) {
        return Math.hypot(super.tinhKhoangCach(d), this.z - d.z);
    }

    @Override
    public double tinhKhoangCach(Diem2D d) {
        return (d instanceof Diem3D d3)
                ? tinhKhoangCach(d3)
                : Math.hypot(super.tinhKhoangCach(d), this.z);
    }

    @Override
    public Diem3D diemDoiXung() {
        return new Diem3D(-this.x, -this.y, -this.z);
    }

    public void tinhTien(double dx, double dy, double dz) {
        super.tinhTien(dx, dy);
        this.z += dz;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
