package Model.Observer;

import Model.Customer.Customer;
import Model.Item.ILibraryItem;

public class Manager {
    private BorrowingManager borrowingManager;

    public Manager(BorrowingManager borrowingManager) {
        this.borrowingManager = borrowingManager;
    }

    public BorrowingManager getBorrowingManager() {
        return borrowingManager;
    }

    public void borrowItem(ILibraryItem item, Customer customer) {
        customer.borrowItem(item);
        borrowingManager.notifySubscribers(item);
    }

    public void returnItem(ILibraryItem item, Customer customer) {
        if (!customer.getBorrowedItems().contains(item))
            throw new IllegalArgumentException("\nHey, " + customer.getName()  + ", you do not have '" + item.getTitle() + "'!");

        customer.returnItem(item);
        borrowingManager.notifySubscribers(item);
    }

    public void addItemToWishlist(Customer customer, ILibraryItem item) {
        customer.addItemToWishlist(item);
    }

    public void deleteItemFromWishlist(Customer customer, ILibraryItem item) {
        customer.removeItemFromWishlist(item);
    }
}
