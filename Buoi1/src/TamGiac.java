public class TamGiac {
    private Diem A, B, C;

    public TamGiac(Diem A, Diem B, Diem C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double tinhChuVi() {
        return A.tinhKhoangCach(B) + B.tinhKhoangCach(C) + C.tinhKhoangCach(A);
    }

    public double tinhDienTich() {
        double a = A.tinhKhoangCach(B), b = B.tinhKhoangCach(C), c = C.tinhKhoangCach(A);
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
