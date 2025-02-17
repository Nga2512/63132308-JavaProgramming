import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Tạo 2 đối tượng sản phẩm
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        // Nhập thông tin cho sản phẩm sp1 và sp2
        System.out.println("Nhập thông tin cho sản phẩm 1:");
        sp1.nhap();
        System.out.println("Nhập thông tin cho sản phẩm 2:");
        sp2.nhap();

        // Xuất thông tin của sản phẩm sp1 và sp2
        System.out.println("\nThông tin sản phẩm 1:");
        sp1.xuat();
        System.out.println("\nThông tin sản phẩm 2:");
        sp2.xuat();
    }
}