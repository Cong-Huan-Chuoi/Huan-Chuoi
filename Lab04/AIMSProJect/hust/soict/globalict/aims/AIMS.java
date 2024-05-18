package Lab03;

import Lab03.media.Disc;

public class AIMS{
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        Disc dvd1 = new Disc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);
        Disc dvd2 = new Disc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);
        Disc dvd3 = new Disc("Aladin", "Animation", 18.99f);
        anOrder.addMedia(dvd3);
        System.out.println("the total cost is: " + anOrder.totalCost());
        anOrder.removeMedia(dvd3);
        System.out.println("the total cost is: " + anOrder.totalCost()); 
    }
}
