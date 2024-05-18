package Lab03.media;

import java.util.ArrayList;


public class CompactDisc extends Disc implements Playable {

    String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
 

    public CompactDisc(int id, String title, String category, String director, int length, float cost, String artist,
            ArrayList<Track> tracks) {
        super(id, title, category, director, length, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(int id, String title, String category, String director, int length, float cost, String artist){
        super(id, title, category, director, length, cost);
        this.artist = artist;
    }

    public CompactDisc(String artist, ArrayList<Track> tracks) {
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, String artist, float cost){
        this.title = title;
        this.category = category;
        this.artist = artist;
        this.cost = cost;
    }
    
    public CompactDisc(int id2, String title2, String category2, float cost2, String artist2) {
    }


    public void addTrack(Track trackcanthem){
        if(!tracks.contains(trackcanthem)) tracks.add(trackcanthem);
    }

    public void removeTrack(Track trackcanxoa){
        if(tracks.contains(trackcanxoa)) tracks.add(trackcanxoa);
    }



    public int getTrackLength(){
        int count = 0;
        for (Track track : tracks){
            count += track.getLength();
        }
        return count;
    }


    public String toString() {
        return "CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getArtist() + " - " + this.getLength() + " - " + this.getCost();
    }


    public void play(){
        for (Track track : tracks){
            track.play();
        }
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    
}
