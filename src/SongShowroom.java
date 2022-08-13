public class SongShowroom {
    public  void show() {
        SongFinder finder = new SongFinder();
        System.out.println("Поиск песни");
        SongInfo song = finder.findSong();
        System.out.println("Песня найдена: ");
        SongDownloader downloader = new SongDownloader();
        downloader.downloader(song);
    }
}
