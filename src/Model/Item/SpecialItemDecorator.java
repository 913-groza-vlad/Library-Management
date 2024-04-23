package Model.Item;

public class SpecialItemDecorator implements LibraryItemDecorator {
    private ILibraryItem wrappee;
    private String description;
    private int editionNumber;

    public SpecialItemDecorator(ILibraryItem libraryItem, String description, int editionNumber) {
        this.wrappee = libraryItem;
        this.description = description;
        this.editionNumber = editionNumber;
    }

    @Override
    public int getNumberOfCopies() {
        return 1;
    }

    @Override
    public String getTitle() {
        return wrappee.getTitle();
    }

    @Override
    public int getId() {
        return wrappee.getId();
    }

    @Override
    public boolean isAvailable() {
        return wrappee.isAvailable();
    }

    @Override
    public void decrementCopies() {
        wrappee.decrementCopies();
    }

    @Override
    public void incrementCopies() {
        wrappee.incrementCopies();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getEditionNumber() {
        return editionNumber;
    }

    @Override
    public String toString() {
        return "SpecialItem{" + wrappee.getClass().getName().substring(wrappee.getClass().getName().lastIndexOf(".") + 1) + ": " +
                wrappee.getTitle() +
                ", description='" + getDescription() + '\'' +
                ", editionNumber=" + getEditionNumber() +
                '}';
    }
}
