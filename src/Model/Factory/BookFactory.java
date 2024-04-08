package Model.Factory;

import Model.Item.Book;
import Model.Item.ILibraryItem;

public class BookFactory extends Factory {
    @Override
    public ILibraryItem createLibraryItem(Object... args) {
        return new Book((String) args[0], (String) args[1], (Integer) args[2], (String) args[3], (String) args[4], (Integer) args[5], (Integer) args[6], (Integer) args[7]);
    }
}
