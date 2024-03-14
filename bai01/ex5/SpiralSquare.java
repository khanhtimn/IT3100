package bai01.ex5;

import java.util.Scanner;
/** Bài tập 4: Nhập vào kích thước ô vuông n*n, kiểm tra 3<=n<= 8. Hiển thị ra màn hình kết quả như ví dụ sau.
 * 1   2   3   4
 * 12  13  14  5
 * 11  16  15  6
 * 10  9   8   7
 */
public class SpiralSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước ô vuông
        int n;
        do {
            System.out.print("Nhập kích thước ô vuông (3 <= n <= 8): ");
            n = scanner.nextInt();
        } while (n < 3 || n > 8);

        // Tạo và hiển thị ma trận
        int[][] matrix = createSquareMatrix(n);
        displayMatrix(matrix);
    }

    private static int[][] createSquareMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;

        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;

        while (count <= n * n) {
            // Đi từ trái sang phải ở hàng đầu
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = count++;
            }

            // Đi từ trên xuống ở cột phải
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                matrix[i][colEnd] = count++;
            }

            // Đi từ phải sang trái ở hàng dưới
            for (int i = colEnd - 1; i >= colStart; i--) {
                matrix[rowEnd][i] = count++;
            }

            // Đi từ dưới lên ở cột trái
            for (int i = rowEnd - 1; i > rowStart; i--) {
                matrix[i][colStart] = count++;
            }

            // Cập nhật phạm vi con của ma trận
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }

        return matrix;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%-4d", anInt);
            }
            System.out.println();
        }
    }
}
