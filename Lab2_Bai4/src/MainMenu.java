import java.util.Scanner;

public class MainMenu {
    
    // Phương thức giải phương trình bậc nhất
    public static void giaiPTB1() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }

    // Phương thức giải phương trình bậc 2
    public static void giaiPTB2() {
        // Mã bài giải phương trình bậc hai
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình bậc nhất là: x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }

    // Phương thức tính tiền điện
    public static void tinhTienDien() {
        // Mã bài tính tiền điện
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();
        
        long tien;
        
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        
        System.out.println("Tiền điện phải trả là: " + tien + " VND");
    }

    // Phương thức hiển thị menu và điều khiển chọn chức năng
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Hiển thị menu
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            
            // Xử lý lựa chọn của người dùng
            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc ứng dụng.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        // Gọi phương thức menu để bắt đầu chương trình
        menu();
    }
}
