package bai05.ex06;

public class Tour {
    private final Tourist  tourist;
    private final Location location;
    private final Hotel hotel;
    private boolean isBooked;

    public Tour(Tourist tourist, Location location, Hotel hotel){
        this.tourist = tourist;
        this.location = location;
        this.hotel = hotel;
        this.isBooked = false;
    }

    public void cancel(){
        this.isBooked = false;
    }

    public void book(){
        this.isBooked = true;
    }

    public boolean isBooked(){
        return this.isBooked;
    }
    public Tourist getTourist(){
        return this.tourist;
    }
    public Location getLocation(){
        return this.location;
    }
    public Hotel getHotel(){
        return this.hotel;
    }
}
