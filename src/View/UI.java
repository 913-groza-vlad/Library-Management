package View;

import Controller.Controller;
import Model.Item.ILibraryItem;

import java.util.Scanner;

public class UI {
    private Controller controller;

    public UI(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System!");
        System.out.println("Please select an option:");
        System.out.println("1. Add a new item");
        System.out.println("2. Remove an item");
        System.out.println("3. Check out an item");
        System.out.println("4. Return an item");
        System.out.println("5. Pay fines");
        System.out.println("6. Display all items");
        System.out.println("7. Exit\n");

        while (true) {
            System.out.print("Option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // controller.addItem();
                    break;
                case 2:
                    // controller.removeItem();
                    break;
                case 3:
                    // controller.checkOutItem();
                    break;
                case 4:
                    // controller.returnItem();
                    break;
                case 5:
                    // controller.payFines();
                    break;
                case 6:
                    displayItems();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    void displayItems() {
        for (ILibraryItem item : controller.getItems()) {
            System.out.println(item);
        }
        System.out.println();
    }
}
