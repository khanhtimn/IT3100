package bai05.ex05;

public class StringComparision {
    public static void main(String[] args) {

        long stringDuration = testString();
        System.out.println("Thời gian sử dụng String: " + convertTime(stringDuration) + " s");

        long sbDuration = testStringBuffer();
        System.out.println("Thời gian sử dụng StringBuffer: " + convertTime(sbDuration) + " s");

        if (stringDuration < sbDuration) {
            System.out.println("Sử dụng String nhanh hơn sử dụng StringBuffer.");
        } else {
            System.out.println("Sử dụng StringBuffer nhanh hơn sử dụng String.");
        }
    }

    public static long testString() {
        long startTime = System.nanoTime();
        String testString = "";
        for (int i = 0; i < 10000; i++) {
            testString += "test";
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long testStringBuffer() {
        long startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sb.append("test");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static double convertTime(long ns) {
        return ns / 1_000_000_000.0;
    }
}