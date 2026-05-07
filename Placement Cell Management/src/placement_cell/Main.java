package placement_cell;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("👤 Username: ");
        String username = sc.nextLine();
        System.out.print("🔒 Password: ");
        String password = sc.nextLine();

        if (!LoginService.login(username, password)) {
            System.out.println("❌ Login failed. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\nPLACEMENT CELL MANAGEMENT SYSTEM");
            System.out.println("1. Register Students");
            System.out.println("2. View Student Details");
            System.out.println("3. Enter company details");
            System.out.println("4. View Companies");
            System.out.println("5. Enter placed student");
            System.out.println("6. View placed students");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> StudentDetails.registerStudent(sc);
                case 2 -> StudentDetails.viewStudents();
                case 3-> Companies.companies(sc);
                case 4-> Companies.viewCompany();
                case 5 -> PlacedStatus.placements(sc);
                case 6 -> PlacedStatus.viewPlacedStudents();
                case 7 -> {
                    System.out.println("🔚 Goodbye!");
                    return;
                }
                default -> System.out.println("❓ Invalid option");
            }
        }
		// TODO Auto-generated method stub

	}

}
