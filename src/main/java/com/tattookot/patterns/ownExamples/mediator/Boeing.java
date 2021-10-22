package main.java.com.tattookot.patterns.ownExamples.mediator;

public class Boeing implements Plane{
    public Boeing(Airport airport, String name) {
        this.airport = airport;
        this.name = name;
    }

    Airport airport;
    String name;

    @Override
    public void giveInformationToAirport(String information) {
        airport.tellInformationToAllPlanes(information, this);
    }

    @Override
    public void listenInformationFromAirport(String information) {
        System.out.println(this.name + " received: " + information);
    }
}
