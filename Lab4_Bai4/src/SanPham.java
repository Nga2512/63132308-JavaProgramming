public class SanPham {
    // Các trường dữ liệu của lớp SanPham với đặc tả private
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

    // Getter và Setter cho tên sản phẩm
    public String getTenSp() {
        return this.tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    // Getter và Setter cho đơn giá
    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia > 0) {
            this.donGia = donGia; // Chỉ cho phép đặt đơn giá lớn hơn 0
        } else {
            System.out.println("Giá sản phẩm phải lớn hơn 0!");
        }
    }

    // Getter và Setter cho giảm giá
    public double getGiamGia() {
        return this.giamGia;
    }

    public void setGiamGia(double giamGia) {
        if (giamGia >= 0) {
            this.giamGia = giamGia; // Chỉ cho phép giảm giá không âm
        } else {
            System.out.println("Giảm giá phải là số không âm!");
        }
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



