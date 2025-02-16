import java.util.Scanner;

public class SanPham {
    // Thuộc tính của lớp
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Phương thức tính thuế nhập khẩu (10% giá sản phẩm)
    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    // Phương thức nhập thông tin sản phẩm
    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();

        System.out.print("Nhập đơn giá sản phẩm: ");
        donGia = scanner.nextDouble();

        System.out.print("Nhập mức giảm giá sản phẩm (ví dụ 0.2 cho 20%): ");
        giamGia = scanner.nextDouble();
    }

    // Phương thức xuất thông tin sản phẩm ra màn hình
    public void xuat() {
        double thueNhapKhau = getThueNhapKhau();
        System.out.println("Thông tin sản phẩm:");
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + (giamGia * 100) + "%");
        System.out.println("Thuế nhập khẩu: " + thueNhapKhau);
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        // Tạo đối tượng sản phẩm
        SanPham sp = new SanPham();

        // Nhập thông tin sản phẩm
        sp.nhap();

        // Xuất thông tin sản phẩm
        sp.xuat();
    }
}
