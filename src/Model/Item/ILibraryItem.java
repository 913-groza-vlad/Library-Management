package Model.Item;

public interface ILibraryItem {
    int getNumberOfCopies();
    String getTitle();
    int getId();

    boolean isAvailable();

    void decrementCopies();
    void incrementCopies();
}
