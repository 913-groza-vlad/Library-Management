package Model.Observer;

import Model.Customer.Customer;
import Model.Item.ILibraryItem;

public class Manager {
    private BorrowingManager borrowingManager;

    public Manager(BorrowingManager borrowingManager) {
        this.borrowingManager = borrowingManager;
    }

    public void borrowItem(ILibraryItem item, Customer customer) {
        customer.borrowItem(item);
        borrowingManager.notifySubscribers(item);
    }

    public void returnItem(ILibraryItem item, Customer customer) {
        customer.returnItem(item);
        borrowingManager.notifySubscribers(item);
    }
}
