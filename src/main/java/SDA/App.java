package SDA;

import SDA.Service.HotelService;
import SDA.model.Hotel;

public class App {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        HotelService sdaHotelService = new HotelService(hotel);


    }
}
