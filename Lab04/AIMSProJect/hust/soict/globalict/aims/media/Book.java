package Lab03;

import java.util.ArrayList;
import java.util.List;

import Lab03.media.Media;

public class Book extends Media {
   
    private List<String> authors = new ArrayList<String>();

    
    public Book(){
    }
    public Book(int id, String title, String category, float cost, List<String> authors){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = authors;
    }
    public Book(int id, String title, String category, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Book(String title, String category, float cost){
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public void addAuthor(String authorName){
        if(authors.contains(authorName)) System.out.println("The author is already existed.");
        else {
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName){
        if(authors.contains(authorName)) authors.remove(authorName);
    }
    public String toString(){
        return "Book" + "-" + this.getTitle() +" - " + this.getCategory() + " - " + this.getCost();
    }
}
