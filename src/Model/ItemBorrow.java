package Model;

import Model.Customer.Customer;
import Model.Item.ILibraryItem;

import java.time.LocalDate;

public class ItemBorrow {
    private Customer customer;
    private ILibraryItem item;
    private LocalDate startDate;
    private LocalDate returnDate;

    public ItemBorrow(Customer customer, ILibraryItem item, LocalDate startDate, LocalDate returnDate) {
        this.customer = customer;
        this.item = item;
        this.startDate = startDate;
        this.returnDate = returnDate;
    }

    // Getters and setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ILibraryItem getItem() {
        return item;
    }

    public void setItem(ILibraryItem item) {
        this.item = item;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getExpectedReturnDate() {
        return returnDate;
    }

    public void setExpectedReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
