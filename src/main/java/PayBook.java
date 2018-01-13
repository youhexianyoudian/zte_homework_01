import java.util.ArrayList;
import java.util.List;

public class PayBook {
    List<Item> items = new ArrayList<Item>();
    public static void main(String[] args){

        Book book = new Book("Maven1",34.76, 1);
        Book book1 = new Book("Maven2",10, 1);
        Book book2 = new Book("Maven3",20, 0);
        Book book3 = new Book("Maven",45, 2);

    }

public  double getPrice (Book book){
    double sum = 0;
    Item item = new Item();
    item.bookName = book.bookName;
    if (book.bookType == 1){
        sum = book.price*1.0;
    }
    if (book.bookType == 0){
        sum = book.price*0.6;
    }
    if (book.bookType == 2){
        sum = book.price*1.2;
    }
    item.price = sum;
    items.add(item);
    return sum;
}

public  double print(){
    double sum = 0;
    System.out.println("书名\t价格");
    for (Item item:items) {
        System.out.println(item.bookName+item.price);
        sum += item.price;
    }
    System.out.println("总价：  "+sum);
    return sum;
}


}
class Item{
    String bookName;
    double price;
}