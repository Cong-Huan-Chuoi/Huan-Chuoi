package Lab03.media;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Media {
    protected int id;
    protected String category;
    protected String title;
    protected float cost;

    List<Media> mediae = new ArrayList<Media>();
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByCostTitle();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    
}
