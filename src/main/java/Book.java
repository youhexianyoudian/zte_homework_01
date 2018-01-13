

public class Book {
    public  double price;
    public  String bookName;
    public  int bookType;

    public Book(){

    }
    public Book(String bookName,double price,  int bookType) {
        this.price = price;
        this.bookName = bookName;
        this.bookType = bookType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookType() {
        return bookType;
    }

    public void setBookType(int bookType) {
        this.bookType = bookType;
    }
}
