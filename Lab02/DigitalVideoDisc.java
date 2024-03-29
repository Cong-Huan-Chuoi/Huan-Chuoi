package week2.Lab2;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public boolean equals(DigitalVideoDisc b) {
        return (this.title == b.title && this.category == b.category && this.director == b.director && this.length == b.length && this.cost == b.cost);
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }
    
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    
    public String getTitle () {
        return title;
    }

    public String getCategory () {
        return category;
    }

    public String getDirector () {
        return director;
    }

    public int getLength () {
        return length;
    }

    public float getCost () {
        return cost;
    }

    public void displayDVD() {
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Director: " + director);
        System.out.println("Length: " + length);
        System.out.println("Cost: " + cost);
    }
}
