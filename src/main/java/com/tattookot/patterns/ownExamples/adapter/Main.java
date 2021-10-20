package main.java.com.tattookot.patterns.ownExamples.adapter;

public class Main {
    public static void main(String[] args) {
        NikonCamera camera = new CanonToNikonLensAdapter();

        camera.connectToNikonCamera();
    }
}
