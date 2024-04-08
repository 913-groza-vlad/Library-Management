package Repository;

import Model.Customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements IRepository<Customer> {
    private List<Customer> customers;

    public CustomerRepository() {
        customers = new ArrayList<>();
    }

    @Override
    public void addElem(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void removeElem(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public Customer getElem(int id) {
        return customers.stream().filter(customer -> customer.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Customer> getElems() {
        return null;
    }
}
