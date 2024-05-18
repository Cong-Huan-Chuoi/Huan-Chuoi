package Lab03;

import java.util.ArrayList;
import java.util.List;

import Lab03.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
            "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
            "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
            "Animation", 18.99f);
        cart.addMedia(dvd3);

        List<String> authors = new ArrayList<String>();
        authors.add("LTK");
        Book book1 = new Book(1, "Sherlock Holmes", "Thriller", 20.99f, authors);
        cart.addMedia(book1);

        cart.toString();
        cart.printList();
    }
    
}
