package Model.Customer;

import Model.Item.ILibraryItem;
import Model.Observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Subscriber {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;

    private List<ILibraryItem> wishlist;
    private List<ILibraryItem> borrowedItems;


    public Customer(int id, String name, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.wishlist = new ArrayList<>();
        this.borrowedItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public List<ILibraryItem> getWishlist() {
        return wishlist;
    }

    public List<ILibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    @Override
    public void update(ILibraryItem item) {
        if (item.getNumberOfCopies() > 0)
            System.out.println("Customer " + name + "! There are only " + item.getNumberOfCopies() + " copies of " + item.getTitle());
        else
            System.out.println("Customer " + name + "! " + item.getTitle() + " is not available");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void borrowItem(ILibraryItem item) {
        borrowedItems.add(item);
        item.decrementCopies();
    }

    public void returnItem(ILibraryItem item) {
        borrowedItems.remove(item);
        item.incrementCopies();
    }
}
