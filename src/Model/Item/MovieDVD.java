package Model.Item;

import Model.Item.LibraryItem;

public class MovieDVD extends LibraryItem {
    private String title;
    private String director;
    private int year;
    private String genre;
    private int runtime;

    public MovieDVD(String title, String director, int year, String genre, int runtime, int numberOfCopies, int itemValue) {
        super(title, numberOfCopies, itemValue);
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.runtime = runtime;
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

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public int getRuntime() {
        return runtime;
    }

    @Override
    public String toString() {
        return "MovieDVD{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", runtime=" + runtime +
                '}';
    }
}
