package Model.Item;

import Model.Item.LibraryItem;

public class Magazine extends LibraryItem {
    private String title;
    private String publisher;
    private int year;
    private int issueNumber;

    public Magazine(String title, String publisher, int year, int issueNumber, int numberOfCopies, int itemValue) {
        super(title, numberOfCopies, itemValue);
        this.title = title;
        this.publisher = publisher;
        this.year = year;
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

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", issueNumber=" + issueNumber +
                '}';
    }
}
