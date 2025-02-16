import java.util.Scanner;
public class KhoiLapPhuong {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Nhập cạnh của khối lập phương
	        System.out.print("Nhập cạnh của khối lập phương: ");
	        double a = scanner.nextDouble();  // Nhập cạnh khối lập phương

	        // Tính thể tích khối lập phương
	        double theTich = Math.pow(a, 3);  // Thể tích = cạnh^3

	        // Xuất kết quả
	        System.out.println("\nThể tích của khối lập phương: " + theTich);

	        scanner.close();

	}

}
