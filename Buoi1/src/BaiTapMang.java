import java.util.Scanner;

public class BaiTapMang {
    public static int tinhTong(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void inMangTong(int[] a, int[] b) {
        int maxLength = Math.max(a.length, b.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int valA = (i < a.length) ? a[i] : 0;
            int valB = (i < b.length) ? b[i] : 0;
            result[i] = valA + valB;
        }

        System.out.print("Mảng tổng của 2 mảng là: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i == result.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }

    public static void xuLyChuoiMang(String inputStr) {
        if (inputStr == null || inputStr.trim().isEmpty()) {
            System.out.println("Số phần tử: 0; Tổng: 0");
            return;
        }

        String[] tokens = inputStr.trim().split("\\s+");
        int count = tokens.length;
        int sumStr = 0;

        for (String token : tokens) {
            sumStr += Integer.parseInt(token);
        }

        System.out.println("Số phần tử: " + count + "; Tổng: " + sumStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CÂU 1: NHẬP MẢNG N PHẦN TỬ VÀ TÍNH TỔNG ===");
        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Nhập " + n + " phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Tổng các phần tử trong mảng vừa nhập là: " + tinhTong(arr1));

        // --- CÂU 2: Demo hàm tính tổng 2 mảng ---
        System.out.println("\n=== CÂU 2: IN MẢNG TỔNG CỦA 2 MẢNG ===");
        int[] sample1 = {1, 2, 3, 4, 5};
        int[] sample2 = {10, 20, 30}; // Mảng ngắn hơn để minh họa
        System.out.print("Mảng 1: [1, 2, 3, 4, 5] + Mảng 2: [10, 20, 30] -> ");
        inMangTong(sample1, sample2);

        // --- CÂU 3: Nhập mảng từ chuỗi duy nhất cách nhau bởi dấu cách ---
        System.out.println("\n=== CÂU 3: NHẬP MẢNG TỪ CHUỖI DUY NHẤT ===");
        scanner.nextLine();

        System.out.print("Nhập mảng số nguyên (ví dụ: 3 4 5 33 554 67 23 6 8 5): ");
        String inputStr = scanner.nextLine();
        xuLyChuoiMang(inputStr);

        scanner.close();
    }
}
