package main.java.com.tattookot.patterns.youtube.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
