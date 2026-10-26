import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap1PhanSo {

    public static void chay(Scanner sc) {
        System.out.println("=== BÀI 1: PHÂN SỐ ===");

        System.out.print("Nhập số lượng phân số: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n (> 0): ");
            n = sc.nextInt();
        }

        List<PhanSo> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ds.add(PhanSo.nhap(sc, "PS" + (i + 1)));
        }
        System.out.println("-> DS phân số: " + ds);

        if (ds.size() >= 2) {
            PhanSo p1 = ds.get(0);
            PhanSo p2 = ds.get(1);
            System.out.println("\n[Demo PS1 & PS2]");
            System.out.println("Tổng: " + p1.cong(p2));
            System.out.println("Hiệu: " + p1.tru(p2));
            System.out.println("Tích: " + p1.nhan(p2));
            System.out.println("Thương: " + p1.chia(p2));
            int cmp = p1.soSanh(p2);
            System.out.println("So sánh: " + p1 + (cmp > 0 ? " > " : (cmp < 0 ? " < " : " == ")) + p2);
        }

        PhanSo max = ds.get(0);
        PhanSo tong = new PhanSo();
        List<PhanSo> dsKhongNguyen = new ArrayList<>();

        for (PhanSo p : ds) {
            if (p.soSanh(max) > 0) max = p;
            tong = tong.cong(p);
            if (!p.laSoNguyen()) dsKhongNguyen.add(p);
        }

        System.out.println("\n-> Lớn nhất: " + max);
        System.out.println("-> Tổng: " + tong);
        System.out.println("-> Số lượng PS không nguyên: " + dsKhongNguyen.size() + " " + dsKhongNguyen);
    }
}
