package bai09.ex02;

import java.util.ArrayList;
import java.util.List;

public class Chapter extends Page {
    private String title;
    private final List<Page> pages;

    public Chapter(String title) {
        super(""); // Khởi tạo Page với nội dung rỗng
        this.title = title;
        this.pages = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addPage(Page page) {
        pages.add(page);
    }

    public List<Page> getPages() {
        return pages;
    }

    public int getPageCount() {
        return pages.size();
    }
}
