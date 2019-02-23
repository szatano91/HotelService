package SDA.model;

public class Room {
    private int roomNumber;
    private int numberOfGuests;
    private boolean bathroom;
    private boolean available;




    public Room(int roomNumber, int numberOfGuests, boolean bathroom, boolean available) {
        this.roomNumber = roomNumber;
        this.numberOfGuests = numberOfGuests;
        this.bathroom = bathroom;
        this.available = available;
    }
    @Override
    public String toString() {
        return
                " roomNumber= " + roomNumber +
                        " numberOfGuests= " + numberOfGuests +
                        " bathroom= " + bathroom +
                        " available= " + available + '\n';}

    public boolean isAvailable() {
        return available;
    }
}
