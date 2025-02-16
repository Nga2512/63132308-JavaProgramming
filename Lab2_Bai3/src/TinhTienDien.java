import java.util.Scanner;
public class TinhTienDien {

	public static void main(String[] args) {
		 int soDien;
	     long tien;

	        Scanner scanner = new Scanner(System.in);

	        // Nhập số điện sử dụng trong tháng
	        System.out.print("Nhập số điện sử dụng trong tháng: ");
	        soDien = scanner.nextInt();

	        // Tính tiền điện theo phương pháp lũy tiến
	        if (soDien <= 50) {
	            tien = soDien * 1000;
	        } else {
	            tien = 50 * 1000 + (soDien - 50) * 1200;
	        }

	        System.out.println("Tiền điện phải trả là: " + tien + " VND");

	        scanner.close();

	}

}
