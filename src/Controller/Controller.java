package Controller;

import Model.Customer.Customer;
import Model.Item.ILibraryItem;
import Model.ItemBorrow;
import Model.Observer.Manager;
import Repository.BorrowItemRepository;
import Repository.IRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Controller {
    IRepository<ILibraryItem> itemRepository;
    IRepository<Customer> customerRepository;
    BorrowItemRepository borrowItemRepository;
    Manager manager;

    public Controller(IRepository<ILibraryItem> itemRepository, IRepository<Customer> customerRepository, BorrowItemRepository borrowItemRepository, Manager manager) {
        this.itemRepository = itemRepository;
        this.customerRepository = customerRepository;
        this.borrowItemRepository = borrowItemRepository;
        this.manager = manager;
    }

    public List<ILibraryItem> getItems() {
        return itemRepository.getElems();
    }

    public void addItem(ILibraryItem item) {
        itemRepository.addElem(item);
    }

    public void removeItem(ILibraryItem item) {
        itemRepository.removeElem(item);
    }

    public ILibraryItem getItem(int id) {
        return itemRepository.getElem(id);
    }

    public void addCustomer(Customer customer) {
        customerRepository.addElem(customer);
    }

    public void removeCustomer(Customer customer) {
        customerRepository.removeElem(customer);
    }

    public Customer getCustomer(int id) {
        return customerRepository.getElem(id);
    }

    public void borrowItem(ILibraryItem item, Customer customer, LocalDate startDate, LocalDate returnDate) {
        if (!item.isAvailable())
            throw new IllegalArgumentException("There are no copies of " + item.getTitle());
        manager.borrowItem(item, customer);
        borrowItemRepository.addElem(new ItemBorrow(customer, item, startDate, returnDate));
    }

    public void returnItem(ILibraryItem item, Customer customer) {
        manager.returnItem(item, customer);
        borrowItemRepository.removeElem(borrowItemRepository.getBorrowedItem(customer, item));
    }
}
