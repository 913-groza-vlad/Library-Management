import Model.Factory.*;

public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = LibraryManager.getInstance();
        libraryManager.initializeLibrary();
    }
}