package Lab03.media;

public class Track implements Playable {
    
    private String title;
    private int length;
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    public boolean equals(Object obj){
        if (obj instanceof Track){
            Track track = (Track) obj;
            return (track.getTitle() == this. getTitle() && track.getLength() == this.getLength());
        }
        return false;
    }
    
    
}
