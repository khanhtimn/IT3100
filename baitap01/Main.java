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
        if (month < 1 || month > 12) {
            return -1; // Tháng không hợp lệ
        }

        int[] daysInMonthArray = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Xử lý năm nhuận
        if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            return 29; // Năm nhuận, tháng 2 có 29 ngày
        } else {
            return daysInMonthArray[month]; // Trả về số ngày trong tháng
        }
    }
}