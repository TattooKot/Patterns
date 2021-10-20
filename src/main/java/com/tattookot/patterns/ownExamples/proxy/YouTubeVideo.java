package main.java.com.tattookot.patterns.ownExamples.proxy;

public class YouTubeVideo implements VideoStreaming{

    private String url;

    public YouTubeVideo(String url) {
        this.url = url;
        download();
    }

    @Override
    public void download() {
        System.out.println("Downloading video from server...");
    }

    @Override
    public void playVideo() {
        System.out.println("Video is playing...");
    }
}
