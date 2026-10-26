import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        this(0, 1);
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = (mau != 0) ? mau : 1;
        this.rutGon();
    }

    public static PhanSo nhap(Scanner sc, String ten) {
        System.out.print("Nhập tử " + ten + ": ");
        int tu = sc.nextInt();
        System.out.print("Nhập mẫu " + ten + ": ");
        int mau = sc.nextInt();
        while (mau == 0) {
            System.out.print("Mẫu != 0. Nhập lại: ");
            mau = sc.nextInt();
        }
        return new PhanSo(tu, mau);
    }

    private int ucln(int a, int b) {
        return (b == 0) ? Math.abs(a) : ucln(b, a % b);
    }

    public void rutGon() {
        int u = ucln(this.tu, this.mau);
        this.tu /= u;
        this.mau /= u;
        if (this.mau < 0) {
            this.tu = -this.tu;
            this.mau = -this.mau;
        }
    }

    public PhanSo cong(PhanSo ps) {
        return new PhanSo(this.tu * ps.mau + ps.tu * this.mau, this.mau * ps.mau);
    }

    public PhanSo tru(PhanSo ps) {
        return new PhanSo(this.tu * ps.mau - ps.tu * this.mau, this.mau * ps.mau);
    }

    public PhanSo nhan(PhanSo ps) {
        return new PhanSo(this.tu * ps.tu, this.mau * ps.mau);
    }

    public PhanSo chia(PhanSo ps) {
        return new PhanSo(this.tu * ps.mau, this.mau * ps.tu);
    }

    public int soSanh(PhanSo ps) {
        return Long.compare((long) this.tu * ps.mau, (long) ps.tu * this.mau);
    }

    public boolean laSoNguyen() {
        return this.mau == 1;
    }

    @Override
    public String toString() {
        return (mau == 1) ? String.valueOf(tu) : tu + "/" + mau;
    }
}