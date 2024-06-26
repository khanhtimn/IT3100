package bai05.ex06;

public class Test {
    public static void main(String[] args) {
        Tourist tourist = new Tourist(InfoGenerator.generateRandomName());
        Location location = new Location(InfoGenerator.generateRandomLocation());
        Hotel hotel = new Hotel(InfoGenerator.generateRandomHotel());
        Tour tour = new Tour(tourist, location, hotel);
        tour.book();
        System.out.println(tour.getTourist().getTouristName());
        System.out.println(tour.getLocation().getLocation());
        System.out.println(tour.getHotel().getHotelName());
        TourManagement tourManagement = new TourManagement();
        tourManagement.bookTour(tourist, location, hotel);
        System.out.println(tourManagement.getTotalBookedTours());
    }
}
