
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            System.out.println("\n\n                Hotel Service");
            System.out.println("---------------------------------------------");
            System.out.println("1 - Wyświetl listę pokoi wraz z ich statusami");
            System.out.println("2 - Wyświetl listę dostępnych pokoi");
            System.out.println("3 - Zarezerwuj pokój");
            System.out.println("4 - Zwolnij pokój");
            System.out.println("0 - Wyjdź z programu");
            System.out.print("\nWybierz opcję: ");

            try {
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        userService.getListRooms();
                        break;
                    case 2:
                        userService.getListAvailableRooms();
                        break;
                    case 3:
                        System.out.println("Rezerwacja pokoju");
                        userService.bookReleaseRoom(true);
                        break;
                    case 4:
                        System.out.println("Zwalnianie pokoju");
                        userService.bookReleaseRoom(false);
                        break;
                    case 0:
                        System.out.println("Koniec");
                        System.exit(0);
                        break;
                    default:
                       // menu();
                        break;
                }
            } catch (InputMismatchException e) {
                menu();
            }
        }
        while (input != 0);
    }
}
