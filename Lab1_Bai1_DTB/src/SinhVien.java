import java.util.Scanner;
public class SinhVien {

	public static void main(String[] args) {
		 // Tạo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sinh viên
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();  // Nhập họ và tên sinh viên

        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();  // Nhập điểm trung bình

        // Xuất thông tin sinh viên ra màn hình
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTrungBinh);

        // Đóng đối tượng Scanner
        scanner.close();
    

	}

}
