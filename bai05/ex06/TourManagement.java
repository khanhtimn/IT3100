package bai05.ex06;

import java.util.ArrayList;
import java.util.List;

public class TourManagement {
    private final List<Tour> tours;

    public TourManagement(){
        this.tours = new ArrayList<>();
    }
    public void bookTour(Tourist tourist, Location location, Hotel hotel){
        Tour tour = new Tour(tourist, location, hotel);
        tour.book();
        this.tours.add(tour);
    }
    public void cancelTour(Tour tour){
        tour.cancel();
    }

    public int getTotalTours(){
        return this.tours.size();
    }
    public int getTotalBookedTours(){
        return (int) this.tours.stream().filter(Tour::isBooked).count();
    }
    public int getTotalCancelTours(){
        return (int) this.tours.stream().filter(tour -> !tour.isBooked()).count();
    }
}
