import java.util.InputMismatchException;
import java.util.Scanner;

public class UserService {

    private Hotel hotel = new Hotel();

    public void getListRooms() {
        System.out.println("\nAktualna lista pokoi");
        System.out.println(hotel.getRooms());
    }

    public void getListAvailableRooms() {
        System.out.println("\nLista wolnych pokoi");
        hotel.getFreeRooms();
    }

    public void bookReleaseRoom(boolean booking) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nr pokoju (0-anuluj): ");
        try {
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("anulowano ");
            } else if (hotel.setRoomStatus(number, booking)) {
                System.out.println("--> Zmieniono status pokoju ");
            } else {
                System.out.print("--> Nieprawidłowy numer. ");
                bookReleaseRoom(booking);
            }
        } catch (InputMismatchException e){
           bookReleaseRoom(booking);
        }
    }

}
