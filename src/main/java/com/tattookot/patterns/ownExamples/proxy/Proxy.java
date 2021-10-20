package main.java.com.tattookot.patterns.ownExamples.proxy;

public class Proxy implements VideoStreaming {
    private String url;
    private YouTubeVideo video;

    public Proxy(String url) {
        this.url = url;
    }

    @Override
    public void download() {
        video.download();
    }

    @Override
    public void playVideo() {
        if(video == null){
            video = new YouTubeVideo(url);
        }
        video.playVideo();
    }
}
