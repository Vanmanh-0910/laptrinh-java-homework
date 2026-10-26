import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        BaiTap1PhanSo.chay(sc);
        System.out.println("\n");
        BaiTap2Diem.chay(sc);

        sc.close();
    }
}
