package week2.Lab2;

public class AIMSproject {

    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animation", "roger aller", 84, 19.97f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The lion prince", "Cnimation", "roger cller", 83, 19.97f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The lion queen", "documentary", "roger bller", 84, 19.97f);

        Cart Hoang_cart = new Cart();

        Hoang_cart.addDigitalVideoDisc(dvd1);
        Hoang_cart.addDigitalVideoDisc(dvd2);
        Hoang_cart.addDigitalVideoDisc(dvd3);

        
        System.out.println(Hoang_cart.totalCost());        
        Hoang_cart.removeDigitalVideoDisc(dvd3);
        System.out.println(Hoang_cart.totalCost());        
    }
}