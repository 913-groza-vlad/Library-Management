package Model.Item;

public class Comic extends LibraryItem {
    private String title;
    private String author;
    private int year;
    private String genre;
    private int issueNumber;

    public Comic(String title, String author, int year, String genre, int issueNumber, int numberOfCopies, int itemValue) {
        super(title, numberOfCopies, itemValue);
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.issueNumber = issueNumber;
    }

    @Override
    public boolean isAvailable() {
        return getNumberOfCopies() > 0;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    @Override
    public int getId() {
        return id;
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

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", issueNumber=" + issueNumber +
                '}';
    }
}
