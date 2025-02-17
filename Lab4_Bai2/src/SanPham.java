import java.util.Scanner;

// Lớp SanPham
class SanPham {
    String tenSanPham;
    double giaSanPham;

    // Phương thức nhập thông tin sản phẩm
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSanPham = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        giaSanPham = scanner.nextDouble();
    }

    // Phương thức xuất thông tin sản phẩm
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá sản phẩm: " + giaSanPham);
    }
}


