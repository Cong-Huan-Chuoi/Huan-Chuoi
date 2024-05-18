package Lab03.media;

public class DigitalVideoDisc extends Disc implements Playable{

    private int length;
    private String director;
    
    private static int nbDVD = 0;
    


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }



    public DigitalVideoDisc(String title) {
        super(title);
        nbDVD++;
        this.setId(nbDVD);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nbDVD++;
        this.setId(nbDVD);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
        nbDVD++;
        this.setId(nbDVD);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        nbDVD++;
        this.setId(nbDVD);
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, director, length, cost);
        nbDVD++;
        this.setId(nbDVD);
    }


    
    public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getLength() + ": " + this.getCost() + "$"; 
    }



    public boolean isMatch(String titleToCompare) {
        return this.getTitle().equalsIgnoreCase(titleToCompare);
    }



    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
        }
        
    public void print(){
        System.out.println("- DVD - "+this.getTitle() + " - "+ getCategory() + " - "+ this.getDirector() + " - "+this.getLength() + ": " + this.getCost() + " $");
    }
}
