public class SanPham {
    // Các thuộc tính của lớp SanPham
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Phương thức tạo với 3 tham số (Tên, Giá, Giảm giá)
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Phương thức tạo với 2 tham số (Tên, Giá)
    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0); // Giảm giá mặc định là 0
    }

    // Getter và Setter cho các thuộc tính
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // Phương thức xuat() công khai
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Giá sau giảm: " + (donGia - giamGia));
        System.out.println("Thuế thu nhập: " + getThueThuNhap());
    }

    // Phương thức getThueThuNhap() bảo mật (private)
    private double getThueThuNhap() {
        // Giả sử thuế thu nhập tính theo 10% giá sau giảm
        return (donGia - giamGia) * 0.1;
    }
}