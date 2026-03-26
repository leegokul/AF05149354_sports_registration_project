import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerDAO dao = new PlayerDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Sports Tournament Registration ---");
            System.out.println("1. Add Player");
            System.out.println("2. List All Players");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Player Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Sport: ");
                    String sport = sc.nextLine();
                    dao.addPlayer(new Player(0, name, sport));
                    break;
                case 2:
                    List<Player> players = dao.getAllPlayers();
                    System.out.println("\n--- Player List ---");
                    for (Player p : players) {
                        System.out.println(p.getId() + ". " + p.getName() + " - " + p.getSport());
                    }
                    break;
                case 3:
                    System.out.println("Exiting... Bye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}