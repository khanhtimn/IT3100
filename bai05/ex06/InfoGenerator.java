package bai05.ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InfoGenerator {
    private static final List<String> FIRSTNAMES = new ArrayList<>(List.of("Nguyễn", "Trần", "Lê", "Phạm", "Hoàng", "Huỳnh", "Phan", "Vũ", "Võ", "Đặng", "Bùi", "Đỗ", "Hồ", "Ngô", "Dương", "Lý", "Trịnh", "Phùng", "Kiều", "Châu", "Đinh", "Lâm", "Quách", "Giang", "Vương", "Khổng", "Tạ", "Thân", "Hà", "Tôn", "Nhữ", "Lưu", "Trịnh", "Cao", "Ung", "Mai", "Khuất", "Huyền", "Đoàn", "Khương", "Lương", "Viên", "Mạc", "Đào", "Thái", "Lại", "Ninh", "Trương", "Thạch", "Cha", "La", "Đường", "Bạch", "Nông", "Liêu", "Trần", "Khấu"));

    private static final List<String> LASTNAMES = new ArrayList<>(List.of("An", "Bảo", "Châu", "Đạt", "Dũng", "Dương", "Giang", "Hiếu", "Hoàng", "Hùng", "Huyền", "Khang", "Khánh", "Khôi", "Khải", "Lâm", "Linh", "Long", "Lý", "Mai", "Minh", "Ngân", "Nghi", "Ngọc", "Nhân", "Nhật", "Phong", "Phúc", "Phương", "Quân", "Quỳnh", "Sơn", "Thảo", "Thành", "Thể", "Thiện", "Thông", "Thủy", "Tiến", "Trà", "Trâm", "Trí", "Trung", "Trường", "Tú", "Tường", "Uyên", "Vân", "Vinh", "Vũ", "Vy"));

    private static final List<String> MIDDLENAMES = new ArrayList<>(List.of("Văn", "Thị", "Thế", "Hồng", "Quốc", "Thanh", "Hải", "Xuân", "Minh", "Hữu", "Quang", "Bá", "Trọng", "Công", "Phúc", "Cẩm", "Gia", "Đức", "Hạnh", "Bích", "Phi", "Tuyết", "Mai", "Ngọc", "Yến", "Lệ", "Hà", "Diệp", "Khanh", "Thảo", "Dung", "Hương", "Lan", "Liên", "Vân", "Tú", "Phương", "Quyền", "Nhã", "Kỳ", "Lành", "Ân", "Tài", "Huy", "Đan", "Hạ", "Di", "Thiện", "Hiền", "Hồng", "Thuận", "Lạc", "Tín", "Thuý", "Phú", "Kiều", "Triều", "Kiệt", "Nhất"));

    private static final List<String> LOCATIONS = new ArrayList<>(List.of("Hanoi", "Paris", "New York", "London"));

    private static final List<String> HOTELS = new ArrayList<>(List.of("Hilton", "Marriott", "Hyatt", "Sheraton"));

    private static final Random random = new Random();

    public static String generateRandomName() {
        String firstName = FIRSTNAMES.get(random.nextInt(FIRSTNAMES.size()));
        String lastName = LASTNAMES.get(random.nextInt(LASTNAMES.size()));
        String middleName = MIDDLENAMES.get(random.nextInt(MIDDLENAMES.size()));
        return firstName + " " + middleName + " " + lastName;
    }

    public static String generateRandomLocation() {
        return LOCATIONS.get(random.nextInt(LOCATIONS.size()));
    }

    public static String generateRandomHotel() {
        return HOTELS.get(random.nextInt(HOTELS.size()));
    }
}
