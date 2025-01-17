package Lectures.lecture9.part13;

public class Movie {

    private MovieType movieType;
    private String title;

    public Movie(String title, MovieType movieType) {
        this.title = title;
        this.movieType = movieType;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public String getTitle() {
        return title;
    }

    public double getSubTotal(int daysRented) {
        return movieType.getSubTotal(daysRented);
    }

    public int getCustomerPoints(int daysRented) {
        return movieType.getCustomerPoints(daysRented);
    }
}
