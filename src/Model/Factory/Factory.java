package Model.Factory;

import Model.Item.ILibraryItem;

public abstract class Factory {
    public abstract ILibraryItem createLibraryItem(Object ...args);

    public void displayLibraryItem(Object ...args) {
        ILibraryItem item = createLibraryItem(args);
        System.out.println(item);
    }
}
