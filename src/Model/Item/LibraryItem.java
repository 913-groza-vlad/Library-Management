package Model.Item;

import Model.Item.ILibraryItem;

public abstract class LibraryItem implements ILibraryItem {
    protected int id;
    protected int numberOfCopies;
    protected String title;
    protected int itemValue;

    private static int idCounter = 1;

    public LibraryItem(String title, int numberOfCopies, int itemValue) {
        this.numberOfCopies = numberOfCopies;
        this.title = title;
        this.itemValue = itemValue;
        this.id = idCounter++;
    }

    public abstract boolean isAvailable();
    public abstract String getTitle();
    public abstract int getNumberOfCopies();
    public abstract int getId();

    public void decrementCopies() {
        numberOfCopies--;
    }

    public void incrementCopies() {
        numberOfCopies++;
    }
}
