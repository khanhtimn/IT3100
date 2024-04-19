package bai05.ex06;
import java.util.Random;

public class RandomInfoGenerator {
        private static final String[] NAMES = {"John", "Jane", "Bob", "Alice"};
        private static final String[] LOCATIONS = {"Hanoi", "Paris", "New York", "London"};
        private static final String[] HOTELS = {"Hilton", "Marriott", "Hyatt", "Sheraton"};

        private final Random random;

        public RandomInfoGenerator() {
            this.random = new Random();
        }

        public Tourist randomTourist() {
            String name = NAMES[random.nextInt(NAMES.length)];
            return new Tourist(name);
        }

        public Location randomLocation() {
            String location = LOCATIONS[random.nextInt(LOCATIONS.length)];
            return new Location(location);
        }

        public Hotel randomHotel() {
            String hotel = HOTELS[random.nextInt(HOTELS.length)];
            return new Hotel(hotel);
        }
    }
}
