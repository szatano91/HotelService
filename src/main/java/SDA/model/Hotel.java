package SDA.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
  private int roomsCount;

private List<Room> rooms = new ArrayList<>();

    public Hotel() {
        rooms.add(new Room(10, 2,true,true));
        rooms.add(new Room(11, 2,true,true));
        rooms.add(new Room(12, 5,false,true));
        rooms.add(new Room(13, 1,true,true));
        rooms.add(new Room(14, 4,true,false));
        rooms.add(new Room(15, 2,false,false));
        rooms.add(new Room(16, 5,false,true));
        rooms.add(new Room(17, 7,true,true));
        rooms.add(new Room(18, 3,true,true));
        rooms.add(new Room(19, 2,false,true));
    }



    public List<Room> getRooms() {
        return rooms;
    }
}