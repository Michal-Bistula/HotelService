import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Room> rooms = new ArrayList<>();

    public Hotel() {
        rooms.add(new Room(101, 1, true, true));
        rooms.add(new Room(102, 1, false, true));
        rooms.add(new Room(103, 2, true, true));
        rooms.add(new Room(104, 2, true, true));
        rooms.add(new Room(105, 2, true, true));
        rooms.add(new Room(106, 3, true, false));
        rooms.add(new Room(107, 3, true, false));
        rooms.add(new Room(108, 3, false, false));
        rooms.add(new Room(109, 4, true, false));
        rooms.add(new Room(110, 4, true, false));
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void getFreeRooms() {

        for (Room room : rooms) {
            if (!room.isBook()) {
                rooms.contains(room.isBook());
                System.out.print(room);
            }
        }
    }

    public boolean setRoomStatus(int number, boolean newStatus) {
        for (Room room : rooms) {
            if (room.getNumber() == number && !room.isBook() == newStatus) {
                room.setBook(newStatus);
                return true;
            }
        }
        return false;
    }
}