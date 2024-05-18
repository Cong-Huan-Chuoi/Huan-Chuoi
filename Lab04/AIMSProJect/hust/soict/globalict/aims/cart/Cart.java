package Lab03;

import java.util.ArrayList;
import java.util.List;

import Lab03.media.Media;

public class Cart {

    private static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<Media>();

    

    public List<Media> getItemsOrdered() {
        return itemsOrdered;
    }
    


   public List<Media> addMedia(Media item){
    itemsOrdered.add(item);
    return itemsOrdered;
   }
   public List<Media> removeMedia(Media media) {
    itemsOrdered.remove(media);
    return itemsOrdered;
}


    public float totalCost(){
        float totalCost = 0;
        for (Media item : itemsOrdered) totalCost += item.getCost();
        return totalCost;
    }
    public void printList(){
        System.out.println("***********************CART***********************");
        System.out.println("Items ordered: ");
        for (Media item: itemsOrdered){
            System.out.println(item.toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void SearchbyTitle(String itemneeded){
        boolean NNN = false;
        for (Media item : itemsOrdered){
            if(item.getTitle() == itemneeded ){
                item.toString();
                NNN = true;
            }
        }
        if (NNN == false) System.out.println("Item not found.");
    }
    public void SearchbyId(int Idneeded){
        boolean NNN = false;
        for (Media item: itemsOrdered){
            if (item.getId() == Idneeded){
                item.toString();
                NNN = true;
            }
        }
        if (NNN = false) System.out.println("Item not found.");
    }
    
}
