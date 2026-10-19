public class ChuNhat {
    private double dai, rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double tinhChuVi() {
        return 2 * (dai + rong);
    }

    public double tinhDienTich() {
        return dai * rong;
    }
}
