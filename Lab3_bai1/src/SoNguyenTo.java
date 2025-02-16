import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int N;
        
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên từ bàn phím
        System.out.print("Nhập một số nguyên: ");
        N = scanner.nextInt();

        // Kiểm tra nếu số N nhỏ hơn 2, thì không phải là số nguyên tố
        if (N <= 1) {
            System.out.println(N + " không phải là số nguyên tố.");
        } else {
            // Biến flag để kiểm tra số nguyên tố
            boolean ok = true;

            // Vòng lặp từ 2 đến N-1 (hoặc đến √N để tối ưu hóa)
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    ok = false;  // Nếu có số nào chia hết, N không phải là số nguyên tố
                    break;
                }
            }

            // Kiểm tra kết quả
            if (ok) {
                System.out.println(N + " là số nguyên tố.");
            } else {
                System.out.println(N + " không phải là số nguyên tố.");
            }
        }

        scanner.close();
    }
}
