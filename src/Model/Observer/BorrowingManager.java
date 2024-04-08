package Model.Observer;

import Model.Customer.Customer;
import Model.Item.ILibraryItem;

import java.util.List;
import java.util.Map;

public class BorrowingManager {
    private Map<ILibraryItem, List<Customer>> subscribers;

    void subscribe(ILibraryItem item, Customer customer) {
        if (subscribers.containsKey(item)) {
            subscribers.get(item).add(customer);
        } else {
            subscribers.put(item, List.of(customer));
        }
    }

    void unsubscribe(ILibraryItem item, Customer customer) {
        if (subscribers.containsKey(item)) {
            subscribers.get(item).remove(customer);
        }
    }

    void notifySubscribers(ILibraryItem item) {
        if (subscribers.containsKey(item)) {
            for (Customer customer : subscribers.get(item)) {
                customer.update(item);
            }
        }
    }
}
