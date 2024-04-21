package Model.Item;

public class Book extends LibraryItem {
    private String author;
    private int year;
    private String genre;
    private String publisher;
    private int pageCount;

    public Book(String title, String author, int year, String genre, String publisher, int pageCount, int numberOfCopies, int itemValue) {
        super(title, numberOfCopies, itemValue);
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isAvailable() {
        return numberOfCopies > 0;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pageCount=" + pageCount +
                ", available copies=" + numberOfCopies +
                '}';
    }
}
