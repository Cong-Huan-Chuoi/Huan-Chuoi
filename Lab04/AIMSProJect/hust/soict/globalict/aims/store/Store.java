package Lab03.hust.soict.globalict.aims.store;

import java.util.ArrayList;

import Lab03.media.Media;

public class Store {
    private ArrayList<Media> itemsInStores = new ArrayList<>();
      

  public ArrayList<Media> getItemsInStores() {
        return itemsInStores;
    }
    
    public void addMedia(Media media) {
        for (int i = 0; i < itemsInStores.size(); i++) {
            if (itemsInStores.get(i).equals(media)) {
                System.out.println("This media is already in store");
                return;
            }
        }
        itemsInStores.add(media);
        System.out.println("Media added to store successfully");
    }
    public void removeMedia(Media media) {
        for (int i = 0; i < itemsInStores.size(); i++) {
            if (itemsInStores.get(i).equals(media)) {
                itemsInStores.remove(i);
                System.out.println("Media removed successfully");
                return;
            }
        }
        System.out.println("This media isn't in the store");
    }
   public Media searchByTitle(String title){
    for (Media media : itemsInStores){
        if ((media.getTitle()).equals(title)){
            return media;
        }
    }
    return null;
}
   public void printMedia(Media e){
       e.toString();
   }
}
