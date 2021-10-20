package main.java.com.tattookot.patterns.ownExamples.proxy;

public class Main {
    public static void main(String[] args) {
        VideoStreaming videoStreaming = new Proxy("https://www.youtube.com/");

        videoStreaming.playVideo();
        System.out.println();
        videoStreaming.playVideo();
    }
}
