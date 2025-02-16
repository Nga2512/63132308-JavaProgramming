import java.util.Scanner;
public class PhuongTrinhBacNhat {

	public static void main(String[] args) {
		// Khai bao bien a,b
		double a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap he so a: ");
		a = scanner.nextDouble();
		System.out.println("Nhap he so b: ");
		b = scanner.nextDouble();
		 if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình có vô số nghiệm.");
	            } else {
	                System.out.println("Phương trình vô nghiệm.");
	            }
	        } else {
	            // Tính nghiệm x = -b / a
	            double x = -b / a;
	            System.out.println("Nghiệm của phương trình là: x = " + x);
	        }

	        scanner.close();

	}

}
