import org.junit.Test;

import static org.junit.Assert.*;

public class PayBookTest {

    @Test
    public void print() {
        Book book1 = new Book("laojiantg",1.000000000,1);
        PayBook payBook1 = new PayBook();
        payBook1.getPrice(book1);;
        assertTrue(1==payBook1.print());
        //assertTrue(2==payBook1.print());
    }
}