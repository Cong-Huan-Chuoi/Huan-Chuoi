package Lab03.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>  {

    public int compare(Media o1, Media o2){
        int i = Float.compare(o1.getCost(), o2.getCost());
        if (i == 0){
            return o1.getTitle().compareTo(o2.getTitle());
        }
        else{
            return 1;
        }
    }
}
