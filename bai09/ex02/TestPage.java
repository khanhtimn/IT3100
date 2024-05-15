package bai09.ex02;

public class TestPage {
    public static void main(String[] args) {
        // Tạo các trang
        Page page1 = new Page("1. Giới thiệu về Java");
        Page page2 = new Page("1.1. Lịch sử phát triển");
        Page page3 = new Page("");
        page3.setContent("2. Cài đặt Java");

        // Tạo các chương và thêm trang vào chương
        Chapter chapter1 = new Chapter("Phần");
        chapter1.setTitle("Phần 1");
        chapter1.addPage(page1);
        chapter1.addPage(page2);

        Chapter chapter2 = new Chapter("Phần 2");
        chapter2.addPage(page3);

        // Tạo sách và thêm các chương vào sách
        Book book = new Book("Lập trình Java");
        book.addChapter(chapter1);
        book.addChapter(chapter2);

        // Kiểm tra số lượng chương và trang của sách
        System.out.println("\nSách: " + book.getTitle());
        System.out.println("Số chương: " + book.getChapterCount());
        System.out.println("Số trang: " + book.getPageCount());
        System.out.println("\n-----------------------\n");

        // In ra tiêu đề và nội dung của từng trang trong từng chương
        for (Chapter chapter : book.getChapters()) {
            System.out.println("Chương: " + chapter.getTitle());
            for (Page page : chapter.getPages()) {
                System.out.println("Nội dung: \n" + page.getContent());
            }
        }
    }
}


