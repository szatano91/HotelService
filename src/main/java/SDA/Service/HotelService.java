package SDA.Service;

import SDA.model.Hotel;
import SDA.model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HotelService {

    private Hotel hotel;

    public HotelService(Hotel hotel) {
        this.hotel = Objects.requireNonNull(hotel, "Hotel must be defined. ");
    }

    public List<Room> getAllRooms() {
        return hotel.getRooms();
    }

    public List<Room> getAvailbleRooms() {
        List<Room> avalibleRooms = new ArrayList<>();

        for (Room room : hotel.getRooms()) {
            if (room.isAvailable()) {
                avalibleRooms.add(room);
            }
        }

        return avalibleRooms;
    }

}
