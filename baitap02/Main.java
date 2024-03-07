package baitap02;

import java.util.Random;
import java.util.Scanner;

/**
 * Bài tập 2: Viết chương trình tráo đổi ngẫu nhiên vị trí một dãy số cho trước
 * Để lấy một số int ngẫu nhiên từ 0 đến n-1 ta dùng lệnh:
 * int i = Random.nextInt(n);
 */
public class Main {
    public static void main(String[] args) {
        // Nhập số phần tử của mảng từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo và khởi tạo mảng số nguyên
        int[] numbers = new int[n];

        // Nhập các phần tử của mảng từ người dùng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Gọi hàm shuffle để tráo đổi ngẫu nhiên vị trí của mảng
        shuffleArray(numbers);

        // In ra mảng sau khi đã được tráo đổi
        System.out.println("Mảng sau khi tráo đổi:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Hàm để tráo đổi ngẫu nhiên vị trí của một mảng số nguyên
    private static void shuffleArray(int[] array) {
        int n = array.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            // Lấy một số ngẫu nhiên từ 0 đến i
            int randomIndex = rand.nextInt(i + 1);

            // Hoán đổi phần tử tại vị trí i và randomIndex
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
