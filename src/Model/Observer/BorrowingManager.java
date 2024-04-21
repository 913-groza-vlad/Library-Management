package Model.Observer;

import Model.Customer.Customer;
import Model.Item.ILibraryItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BorrowingManager {
    private Map<ILibraryItem, List<Customer>> subscribers;

    public BorrowingManager() {
        this.subscribers = new HashMap<>();
    }

    public void subscribe(ILibraryItem item, Customer customer) {
        if (subscribers.containsKey(item)) {
            subscribers.get(item).add(customer);
        } else {
            List<Customer> customers = new ArrayList<>();
            customers.add(customer);
            subscribers.put(item, customers);
        }
    }

    public void unsubscribe(ILibraryItem item, Customer customer) {
        if (subscribers.containsKey(item)) {
            subscribers.get(item).remove(customer);
        }
    }

    public void notifySubscribers(ILibraryItem item) {
        if (subscribers.containsKey(item)) {
            for (Customer customer : subscribers.get(item)) {
                customer.update(item);
            }
        }
    }
}
