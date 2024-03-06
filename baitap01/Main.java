package baitap01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập tháng (1-12): ");
            int month = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
                continue;
            }

            System.out.println("Nhập năm: ");
            int year = scanner.nextInt();

            int daysInMonth = getDaysInMonth(month, year);

            System.out.println("Số ngày trong tháng " + month + " năm " + year + " là: " + daysInMonth);

            System.out.println("Bạn muốn tiếp tục? (y/n): ");
            String continueInput = scanner.next().toLowerCase();

            if (!continueInput.equals("y")) {
                System.out.println("Chương trình kết thúc");
                break;
            }
        }

        scanner.close();
    }
    public static int getDaysInMonth(int month, int year) {

        int a;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                a = 31;
                break;
            case 4, 6, 9 ,11:
                a = 30;
                break;
            case 2:
                // Kiểm tra năm nhuận
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    a = 29;
                } else {
                    a = 28;
                }
                break;
            default:
                a = -1; // Nếu người dùng nhập số tháng không hợp lệ
                break;
        }
        return a;
    }
}