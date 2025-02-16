import java.util.Scanner;
public class HinhChuNhat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng của hình chữ nhật
        System.out.print("Nhập cạnh dài của hình chữ nhật: ");
        double a = scanner.nextDouble();  // Nhập chiều dài

        System.out.print("Nhập cạnh rộng của hình chữ nhật: ");
        double b = scanner.nextDouble();  // Nhập chiều rộng

        // Tính chu vi và diện tích
        double chuVi = 2 * (a + b);  // Công thức tính chu vi
        double dienTich = a * b;    // Công thức tính diện tích

        // Tìm cạnh nhỏ
        double canhNho = Math.min(a, b); // Tìm cạnh nhỏ giữa a và b

        // Xuất kết quả
        System.out.println("\nThông tin hình chữ nhật:");
        System.out.println("Chu vi của hình chữ nhật: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật: " + dienTich);
        System.out.println("Cạnh nhỏ của hình chữ nhật: " + canhNho);

        
        scanner.close();

	}

}
