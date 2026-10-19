public class DuongThang {
    private Diem A, B;

    public DuongThang(Diem A, Diem B) {
        this.A = A;
        this.B = B;
    }

    public double tinhDoDai() {
        return A.tinhKhoangCach(B);
    }
}
