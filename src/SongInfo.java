public class SongInfo {
    public String artist;
    public String song;
    public String text;

    public SongInfo(String artist, String song, String text){
        this.artist = artist;
        this.song = song;
        this.text = text;
    }
    @Override
    public String toString(){
        return "Испольнитель: " + this.artist + "\n" + "Песня: " + this.song;
    }
    public String getPrettyExplanation(){
        return this.text.replaceAll("[.?!,]", "\n");
    }
}
