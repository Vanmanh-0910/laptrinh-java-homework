import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static Diem nhapDiem(Scanner sc, String ten) {
        System.out.print("Nhập x của " + ten + ": ");
        double x = sc.nextDouble();
        System.out.print("Nhập y của " + ten + ": ");
        double y = sc.nextDouble();
        return new Diem(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // --- BÀI TẬP 1 ---
        System.out.println("=== BÀI TẬP 1: ĐƯỜNG THẲNG ===");
        DuongThang dt = new DuongThang(nhapDiem(sc, "điểm A"), nhapDiem(sc, "điểm B"));
        System.out.println("=> Độ dài đường thẳng AB: " + dt.tinhDoDai());

        // --- BÀI TẬP 2 ---
        System.out.println("\n=== BÀI TẬP 2 ===");

        // 1. Nhập 2 Tam giác
        for (int i = 1; i <= 2; i++) {
            System.out.println("\n[Nhập Tam giác " + i + "]");
            TamGiac tg = new TamGiac(nhapDiem(sc, "A"), nhapDiem(sc, "B"), nhapDiem(sc, "C"));
            System.out.println("-> Chu vi: " + tg.tinhChuVi() + ", Diện tích: " + tg.tinhDienTich());
        }

        // 2. Nhập 2 Hình chữ nhật
        for (int i = 1; i <= 2; i++) {
            System.out.println("\n[Nhập Hình chữ nhật " + i + "]");
            System.out.print("Nhập chiều dài: ");
            double cd = sc.nextDouble();
            System.out.print("Nhập chiều rộng: ");
            double cr = sc.nextDouble();
            ChuNhat cn = new ChuNhat(cd, cr);
            System.out.println("-> Chu vi: " + cn.tinhChuVi() + ", Diện tích: " + cn.tinhDienTich());
        }

        // 3. Nhập 2 Hình tròn
        for (int i = 1; i <= 2; i++) {
            System.out.println("\n[Nhập Hình tròn " + i + "]");
            Diem o = nhapDiem(sc, "tâm O");
            System.out.print("Nhập bán kính: ");
            HinhTron ht = new HinhTron(o, sc.nextDouble());
            System.out.println("-> Chu vi: " + ht.tinhChuVi() + ", Diện tích: " + ht.tinhDienTich());
        }
        sc.close();
    }
}
