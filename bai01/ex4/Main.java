package bai01.ex4;

import java.util.Scanner;

/**
 * Viết chương trình nhập chiều cao h từ bàn phím, sau đó hiển thị các tam giác hình sao có chiều cao h.
 * Chú ý có kiểm tra điều kiện của h: 2<=h<=10. Nếu h nằm ngoài đoạn trên, yêu cầu người dùng nhập lại.
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập chiều cao tam giác: (2-10)");
            int h = scanner.nextInt();

            if (h < 2 || h > 10) {
                System.out.println("Chiều cao không hợp lệ. Vui lòng nhập lại.");
                continue;
            }

            printTriangle(h);

            System.out.println("Bạn muốn tiếp tục? (y/n): ");
            String continueInput = scanner.next().toLowerCase();

            if (!continueInput.equals("y")) {
                System.out.println("Chương trình kết thúc");
                break;
            }
        }

        scanner.close();
    }

    public static void printTriangle(int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
