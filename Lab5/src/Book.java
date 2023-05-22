public class Book extends Item {
    private long isbn_number;
    private String author;

    public long getIsbn_number() {
        return isbn_number;
    }
    public void setIsbn_number(long i) {
        isbn_number = i;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String s) {
        author = s;
    }
    public Book(){

    }
    public Book(long n, String a, String t) {
        isbn_number = n;
        author = a;
        setTitle(t);
    }
    public String getListing() {
        return "\nBook Name - " + getTitle() + "\nAuthor - " + author + "\nISBN# - " + isbn_number;
    }
}
