package bai09.ex02;

import java.util.ArrayList;
import java.util.List;

public class Book extends Chapter {
    private final List<Chapter> chapters;

    public Book(String title) {
        super(title); // Khởi tạo Chapter với tiêu đề đã cho
        this.chapters = new ArrayList<>();
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public int getChapterCount() {
        return chapters.size();
    }
    public List<Chapter> getChapters() {
        return chapters;
    }

    @Override
    public int getPageCount() {
        int pageCount = 0;
        for (Chapter chapter : chapters) {
            pageCount += chapter.getPageCount();
        }
        return pageCount;
    }
}
