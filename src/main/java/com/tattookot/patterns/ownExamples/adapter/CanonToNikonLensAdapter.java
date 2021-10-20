package main.java.com.tattookot.patterns.ownExamples.adapter;

public class CanonToNikonLensAdapter extends CanonLens implements NikonCamera{
    @Override
    public void connectToNikonCamera() {
        connectToCannonCamera();
    }
}
