import utils.PageDownloader;

import java.util.Scanner;

public class SongFinder {
    public SongInfo findSong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите исполнителя: ");
        String artist = sc.nextLine();
        System.out.println();
        System.out.print("Введите название песни: ");
        String song = sc.nextLine();
        String newSong = song.replace(" ", "%20");
        System.out.println("Идет скачивание...");
        String url = "https://api.lyrics.ovh/v1/" + artist + "/" + newSong;
        PageDownloader downloader = new PageDownloader();
        String page = downloader.downloadWebPage(url);
        String lyrics = getTagValue(page, "lyrics");
        return new SongInfo(artist, song, lyrics);
    }

    private String getTagValue (String page, String tagName){
        int begin =   page.indexOf('"' + tagName + '"') + 4 + tagName.length();
        int end = page.indexOf('"'  , begin);
        return page.substring(begin, end);
    }
}
