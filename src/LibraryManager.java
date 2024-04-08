import Controller.Controller;
import Model.Customer.Customer;
import Model.Factory.*;
import Model.Item.ILibraryItem;
import Model.ItemBorrow;
import Model.Observer.BorrowingManager;
import Model.Observer.Manager;
import Repository.BorrowItemRepository;
import Repository.CustomerRepository;
import Repository.IRepository;
import Repository.ItemRepository;
import View.UI;

public class LibraryManager {
    private static LibraryManager instance;

    private LibraryManager() {
    }

    public static LibraryManager getInstance() {
        if (instance == null) {
            instance = new LibraryManager();
        }
        return instance;
    }

    public void initializeLibrary() {
        IRepository<ILibraryItem> itemRepository = new ItemRepository();
        IRepository<Customer> customerRepository = new CustomerRepository();
        BorrowItemRepository borrowItemRepository = new BorrowItemRepository();

        BorrowingManager borrowingManager = new BorrowingManager();
        Manager manager = new Manager(borrowingManager);

        Controller controller = new Controller(itemRepository, customerRepository, borrowItemRepository, manager);
        UI view = new UI(controller);

        addItems(itemRepository);
        addCustomers(customerRepository);

        view.start();
    }

    private void addItems(IRepository<ILibraryItem> itemRepository) {
        Factory bookFactory = new BookFactory();
        ILibraryItem book1 = bookFactory.createLibraryItem("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction", "Charles Scribner's Sons", 180, 5, 15);
        ILibraryItem book2 = bookFactory.createLibraryItem("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction", "J.B. Lippincott & Co.", 281, 3, 19);
        ILibraryItem book3 = bookFactory.createLibraryItem("1984", "George Orwell", 1949, "Dystopian", "Secker & Warburg", 328, 4, 10);
        ILibraryItem book4 = bookFactory.createLibraryItem("Pride and Prejudice", "Jane Austen", 1813, "Romance", "T. Egerton", 279, 2, 20);
        ILibraryItem book5 = bookFactory.createLibraryItem("The Catcher in the Rye", "J.D. Salinger", 1951, "Fiction", "Little, Brown and Company", 234, 1, 32);
        ILibraryItem book6 = bookFactory.createLibraryItem("The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy", "George Allen & Unwin", 310, 6, 8);

        Factory magazineFactory = new MagazineFactory();
        ILibraryItem magazine1 = magazineFactory.createLibraryItem("National Geographic", "National Geographic Society", 1888, 1, 1, 17);
        ILibraryItem magazine2 = magazineFactory.createLibraryItem("Time", "Time Inc.", 1923, 2, 2, 15);
        ILibraryItem magazine3 = magazineFactory.createLibraryItem("The New Yorker", "Advance Publications", 1925, 3, 3, 30);

        Factory comicFactory = new ComicFactory();
        ILibraryItem comic1 = comicFactory.createLibraryItem("The Amazing of SpiderMan", "Stan Lee", 1961, "Marvel", 123, 1, 49);
        ILibraryItem comic2 = comicFactory.createLibraryItem("Batman", "Bob Kane", 1939, "DC", 456, 2, 25);
        ILibraryItem comic3 = comicFactory.createLibraryItem("Superman", "Jerry Siegel", 1938, "DC", 789, 3, 18);

        Factory movieFactory = new MovieFactory();
        ILibraryItem movie1 = movieFactory.createLibraryItem("The Shawshank Redemption", "Frank Darabont", 1994, "Drama", 142, 1, 40);
        ILibraryItem movie2 = movieFactory.createLibraryItem("The Godfather", "Francis Ford Coppola", 1972, "Crime", 175, 2, 27);
        ILibraryItem movie3 = movieFactory.createLibraryItem("The Dark Knight", "Christopher Nolan", 2008, "Action", 152, 3, 18);
        ILibraryItem movie4 = movieFactory.createLibraryItem("The Lord of the Rings: The Return of the King", "Peter Jackson", 2003, "Fantasy", 201, 4, 17);

        itemRepository.addElem(book1);
        itemRepository.addElem(book2);
        itemRepository.addElem(book3);
        itemRepository.addElem(book4);
        itemRepository.addElem(book5);
        itemRepository.addElem(book6);
        itemRepository.addElem(magazine1);
        itemRepository.addElem(magazine2);
        itemRepository.addElem(magazine3);
        itemRepository.addElem(comic1);
        itemRepository.addElem(comic2);
        itemRepository.addElem(comic3);
        itemRepository.addElem(movie1);
        itemRepository.addElem(movie2);
        itemRepository.addElem(movie3);
        itemRepository.addElem(movie4);
    }

    private void addCustomers(IRepository<Customer> customerRepository) {
        Customer customer1 = new Customer(1, "John Doe", "", "", "");
        Customer customer2 = new Customer(2, "Max", "", "", "");
        Customer customer3 = new Customer(3, "Alice", "", "", "");
        Customer customer4 = new Customer(4, "Bob", "", "", "");

        customerRepository.addElem(customer1);
        customerRepository.addElem(customer2);
        customerRepository.addElem(customer3);
        customerRepository.addElem(customer4);
    }
}
