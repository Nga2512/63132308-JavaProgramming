public class Main {
    public static void main(String[] args) {
        // Tạo 2 sản phẩm, một có giảm giá, một không có giảm giá
        SanPham sp1 = new SanPham("Sting", 500000, 50000);  // Sản phẩm có giảm giá
        SanPham sp2 = new SanPham("cocacola", 300000);          // Sản phẩm không giảm giá

        // Xuất thông tin sản phẩm
        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();
        System.out.println();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();

        // Sử dụng setter để thay đổi thông tin sản phẩm
        System.out.println("\nCập nhật thông tin sản phẩm 1:");
        sp1.setDonGia(550000);  // Cập nhật đơn giá
        sp1.setGiamGia(60000);  // Cập nhật giảm giá
        sp1.xuat();  // Xuất lại thông tin sau khi thay đổi
    }
}