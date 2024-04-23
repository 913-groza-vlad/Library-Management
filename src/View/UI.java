package View;

import Controller.Controller;
import Model.Customer.Customer;
import Model.Item.ILibraryItem;

import java.time.LocalDate;
import java.util.Scanner;

public class UI {
    private Controller controller;

    public UI(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System!\n");
        System.out.println("Please select an option:");
        System.out.println("1. Display all items");
        System.out.println("2. Add an item to wishlist");
        System.out.println("3. Borrow an item");
        System.out.println("4. Return an item");
        System.out.println("5. Display your wishlist");
        System.out.println("6. Display your borrowed items");
        System.out.println("0. Exit\n");

        while (true) {
            System.out.print("\nOption: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    displayItems();
                    break;
                case 2:
                    addItemToWishlist();
                    break;
                case 3:
                    borrowItem();
                    break;
                case 4:
                    returnItem();
                    break;
                case 5:
                    displayWishlist();
                    break;
                case 6:
                    displayBorrowedItems();
                    break;
                case 0:
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

    void borrowItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your customer ID: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter the id of the item you want to borrow: ");
        int itemId = scanner.nextInt();
        System.out.print("Enter the start date (yyyy-mm-dd): ");
        String startDateStr = scanner.next();
        System.out.print("Enter the return date (yyyy-mm-dd): ");
        String returnDateStr = scanner.next();
        LocalDate startDate = LocalDate.parse(startDateStr);
        LocalDate returnDate = LocalDate.parse(returnDateStr);
        try {
            ILibraryItem item = controller.getItem(itemId);
            Customer customer = controller.getCustomer(customerId);
            controller.borrowItem(item, customer, startDate, returnDate);
            System.out.println("\nItem '" + item.getTitle() + "' borrowed successfully by " + customer.getName() + "!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    void addItemToWishlist() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your customer ID: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter the id of the item you want to add to wishlist: ");
        int itemId = scanner.nextInt();
        try {
            ILibraryItem item = controller.getItem(itemId);
            Customer customer = controller.getCustomer(customerId);
            controller.addItemToWishlist(customer, item);
            System.out.println("Item '" + item.getTitle() + "' added to wishlist successfully by " + customer.getName() + "!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    void displayWishlist() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your customer ID: ");
        int customerId = scanner.nextInt();
        Customer customer = controller.getCustomer(customerId);
        for (ILibraryItem item : customer.getWishlist()) {
            System.out.println(item);
        }
    }

    void displayBorrowedItems() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your customer ID: ");
        int customerId = scanner.nextInt();
        Customer customer = controller.getCustomer(customerId);
        for (ILibraryItem item : customer.getBorrowedItems()) {
            System.out.println(item);
        }
    }

    void returnItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your customer ID: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter the id of the item you want to return: ");
        int itemId = scanner.nextInt();
        try {
            ILibraryItem item = controller.getItem(itemId);
            Customer customer = controller.getCustomer(customerId);
            controller.returnItem(item, customer);
            System.out.println("\nItem '" + item.getTitle() + "' returned successfully by " + customer.getName() + "!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
