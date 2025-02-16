import java.util.Scanner; 
import java.lang.Math;
public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số của phương trình bậc 2
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();  // Hệ số a

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();  // Hệ số b

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();  // Hệ số c

        // Tính delta
        double delta = b * b - 4 * a * c; // Công thức tính delta

        // In giá trị của delta
        System.out.println("Delta = " + delta);

        // Kiểm tra và tính căn bậc 2 của delta
        if (delta >= 0) {
            // Nếu delta không âm, tính căn bậc 2
            double canDelta = Math.sqrt(delta); // Căn bậc 2 của delta
            System.out.println("Căn bậc hai của Delta = " + canDelta);
        } else {
            // Nếu delta âm, thông báo không có căn bậc hai thực
            System.out.println("Delta âm, không có căn bậc hai .");
        }

        scanner.close();

	}

}
