public class MediaLib {
    private static int numBooks = 0;
    private static int numMovies = 0;
    private static int numSongs = 0;
    private static int numEntries = 0;

    public void addBook(String title, String author) {
        Book b = new Book(title, author);
        numBooks++;
        numEntries++;
    }
    public void addMovie(String title, double length) {
        Movie m = new Movie(title, length);
        numMovies++;
        numEntries++;
    }
    public void addSong(String title, String artist) {
        Song s = new Song(title, artist);
        numSongs++;
        numEntries++;
    }

    public static int getNumBooks() {
        return numBooks;
    }

    public static int getNumMovies() {
        return numMovies;
    }

    public static int getNumSongs() {
        return numSongs;
    }

    public static int getNumEntries() {
        return numEntries;
    }
}
