import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap2Diem {

    public static double tinhTongKhoangCach(List<? extends Diem2D> ds) {
        double tong = 0;
        for (int i = 0; i < ds.size() - 1; i++) {
            tong += ds.get(i).tinhKhoangCach(ds.get(i + 1));
        }
        return tong;
    }

    public static void chay(Scanner sc) {
        System.out.println("\n=== BÀI 2: ĐIỂM 2D & 3D ===");

        List<Diem2D> dsTong = new ArrayList<>();

        System.out.print("Nhập số điểm 2D: ");
        int n2D = sc.nextInt();
        List<Diem2D> ds2D = new ArrayList<>();
        for (int i = 0; i < n2D; i++) {
            ds2D.add(Diem2D.nhap(sc, "2D_" + (i + 1)));
        }
        dsTong.addAll(ds2D);

        System.out.print("\nNhập số điểm 3D: ");
        int n3D = sc.nextInt();
        List<Diem3D> ds3D = new ArrayList<>();
        for (int i = 0; i < n3D; i++) {
            ds3D.add(Diem3D.nhap(sc, "3D_" + (i + 1)));
        }
        dsTong.addAll(ds3D);

        System.out.println("\n-> Tổng khoảng cách 2D: " + String.format("%.4f", tinhTongKhoangCach(ds2D)));
        System.out.println("-> Tổng khoảng cách 3D: " + String.format("%.4f", tinhTongKhoangCach(ds3D)));

        int sizeGoc = dsTong.size();
        for (int i = 0; i < sizeGoc; i++) {
            dsTong.add(dsTong.get(i).diemDoiXung());
        }

        System.out.println("\nDS điểm sau khi thêm đối xứng:");
        for (int i = 0; i < dsTong.size(); i++) {
            String tag = (i < sizeGoc) ? "Gốc" : "Đối xứng";
            System.out.println("  " + (i + 1) + ". [" + tag + "] " + dsTong.get(i));
        }
    }
}
