package Model.Observer;

import Model.Item.ILibraryItem;

public interface Subscriber {
    void update(ILibraryItem item);  // Model.Observer pattern
}
