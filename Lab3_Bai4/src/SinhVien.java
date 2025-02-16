import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trắng sau khi nhập số nguyên

        // Khai báo mảng họ tên và điểm
        String[] tenSinhVien = new String[n];
        double[] diemSinhVien = new double[n];

        // Nhập thông tin sinh viên
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sinh viên " + (i + 1) + ": ");
            tenSinhVien[i] = scanner.nextLine();
            System.out.print("Nhập điểm của " + tenSinhVien[i] + ": ");
            diemSinhVien[i] = scanner.nextDouble();
            scanner.nextLine(); // Đọc dòng trắng sau khi nhập số thực
        }

        // Sắp xếp danh sách sinh viên theo điểm (Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (diemSinhVien[j] > diemSinhVien[j + 1]) {
                    // Hoán đổi điểm
                    double tempDiem = diemSinhVien[j];
                    diemSinhVien[j] = diemSinhVien[j + 1];
                    diemSinhVien[j + 1] = tempDiem;
                    
                    // Hoán đổi tên sinh viên tương ứng
                    String tempTen = tenSinhVien[j];
                    tenSinhVien[j] = tenSinhVien[j + 1];
                    tenSinhVien[j + 1] = tempTen;
                }
            }
        }

        // In ra thông tin sinh viên đã sắp xếp theo điểm
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            String hocLuc = "";
            // Xác định học lực của sinh viên
            if (diemSinhVien[i] < 5) {
                hocLuc = "Yếu";
            } else if (diemSinhVien[i] >= 5 && diemSinhVien[i] < 6.5) {
                hocLuc = "Trung bình";
            } else if (diemSinhVien[i] >= 6.5 && diemSinhVien[i] < 7.5) {
                hocLuc = "Khá";
            } else if (diemSinhVien[i] >= 7.5 && diemSinhVien[i] < 9) {
                hocLuc = "Giỏi";
            } else {
                hocLuc = "Xuất sắc";
            }

            // In ra thông tin của từng sinh viên
            System.out.println("Họ tên: " + tenSinhVien[i]);
            System.out.println("Điểm: " + diemSinhVien[i]);
            System.out.println("Học lực: " + hocLuc);
            System.out.println();
        }

        // Đóng scanner
        scanner.close();
    }
}
