package yorku.eecs3311.manager;

import java.util.Scanner;

public class ManagerCLI {

    public static void startCLI(ManagerAccount manager) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nManager Menu:");
            System.out.println("---1. Add Lot");
            System.out.println("---2. Enable Lot");
            System.out.println("---3. Disable Lot");
            System.out.println("---4. Enable Space");
            System.out.println("---5. Disable Space");
            System.out.println("---6. View Available Spaces");
            System.out.println("---7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter lot name: ");
                    String lotName = scanner.nextLine();
                    manager.addLot(lotName);
                    break;
                case 2:
                    System.out.print("Enter lot name: ");
                    String enableLotName = scanner.nextLine();
                    manager.enableLot(enableLotName);
                    break;
                case 3:
                    System.out.print("Enter lot name: ");
                    String disableLotName = scanner.nextLine();
                    manager.disableLot(disableLotName);
                    break;
                case 4:
                    System.out.print("Enter lot name: ");
                    String enableSpaceLot = scanner.nextLine();
                    System.out.print("Enter space ID: ");
                    int enableSpaceID = scanner.nextInt();
                    manager.enableSpace(enableSpaceLot, enableSpaceID);
                    break;
                case 5:
                    System.out.print("Enter lot name: ");
                    String disableSpaceLot = scanner.nextLine();
                    System.out.print("Enter space ID: ");
                    int disableSpaceID = scanner.nextInt();
                    manager.disableSpace(disableSpaceLot, disableSpaceID);
                    break;
                case 6:
                    manager.showAvailableSpaces();
                    break;
                case 7:
                    System.out.println("\n[*] Exiting Manager CLI.");
                    return;
                default:
                    System.out.println("\n[-] Invalid choice. Please try again.");
            }
        }
    }
}
