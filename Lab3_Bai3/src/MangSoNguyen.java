import java.util.Arrays;
import java.util.Scanner;

public class MangSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng với kích thước n
        int[] mang = new int[n];

        // Nhập các phần tử vào mảng
        System.out.println("Nhập các phần tử trong mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(mang);

        // Xuất mảng đã sắp xếp
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();

        // Tìm phần tử có giá trị nhỏ nhất trong mảng
        int min = mang[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, mang[i]);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);

        // Tính trung bình cộng các phần tử chia hết cho 3
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 3 == 0) {
                tong += mang[i];
                dem++;
            }
        }

        if (dem > 0) {
            double trungBinhCong = (double) tong / dem;
            System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: " + trungBinhCong);
        } else {
            System.out.println("Không có phần tử nào chia hết cho 3.");
        }

        // Đóng scanner
        scanner.close();
    }
}
