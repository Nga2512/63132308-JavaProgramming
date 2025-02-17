public class Main {
    public static void main(String[] args) {
        // Tạo 2 sản phẩm, một có giảm giá, một không có giảm giá
        SanPham sp1 = new SanPham("Bún", 500000, 50000);  // Sản phẩm có giảm giá
        SanPham sp2 = new SanPham("Cơm", 300000);          // Sản phẩm không giảm giá

        // Xuất thông tin sản phẩm
        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();
        System.out.println();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();
    }
}