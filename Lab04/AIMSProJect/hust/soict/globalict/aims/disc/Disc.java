package Lab03.media;

public class Disc extends Media{

    
    private String director;
    private int length;
    
    

    
    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }
    

    public void setTitle(String title){
        this.title = title;    
    }

    public Disc(String title){
        
        this.title = title;
    }
    public Disc(String title, String category, float cost){
       
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Disc(String title, String category, String director, float cost){
       
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
        
    public Disc(String title, String category, String director, int length, float cost){
       
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.length = length;
    }
    
    public Disc(int id, String title, String category, String director, int length, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.length = length;
    }
    public String toString(){
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getLength() + ": " + this.getCost() + "$";
    }
    public boolean isMatch(String titletoCompare){
        return this.getTitle().equalsIgnoreCase(titletoCompare);
    }
    public Disc(){}

}
