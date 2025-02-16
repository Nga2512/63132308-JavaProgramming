import java.util.Scanner;
public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		 // Khai báo các hệ số a, b, c
        double a, b, c;

        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị của a, b, c
        System.out.print("Nhập hệ số a: ");
        a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        c = scanner.nextDouble();
        
        // Kiểm tra nếu a == 0, phương trình sẽ trở thành phương trình bậc nhất
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                // Giải phương trình bậc nhất bx + c = 0
                double x = -c / b;
                System.out.println("Nghiệm của phương trình bậc nhất là: x = " + x);
            }
        } else {
            // Tính  (Delta)
            double delta = b * b - 4 * a * c;
            
            if (delta > 0) {
                // Nếu Delta > 0, phương trình có 2 nghiệm phân biệt
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                // Nếu Delta = 0, phương trình có 1 nghiệm kép
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                // Nếu Delta < 0, phương trình vô nghiệm
                System.out.println("Phương trình vô nghiệm.");
            }
        }
        scanner.close();

	}

}
