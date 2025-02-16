public class BangCuuChuong {
    public static void main(String[] args) {
       
        for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng cửu chương " + i);
            // Vòng lặp trong: chạy từ 1 đến 10 để xuất bảng nhân của i
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();  // Xuất một dòng trống giữa các bảng
        }
    }
}
