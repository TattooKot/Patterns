package main.java.com.tattookot.patterns.ownExamples.mediator;

public class AirportRunner {
    public static void main(String[] args) {
        Boryspil boryspil = new Boryspil();

        Plane boeing1 = new Boeing(boryspil,"Boeing 1");
        Plane boeing2 = new Boeing(boryspil,"Boeing 2");
        Plane boeing3 = new Boeing(boryspil,"Boeing 3");

        boryspil.addPlaneToPlaneList(boeing1);
        boryspil.addPlaneToPlaneList(boeing2);
        boryspil.addPlaneToPlaneList(boeing3);

        boeing1.giveInformationToAirport("Hello from boeing 1");
        System.out.println();
        boeing2.giveInformationToAirport("Hello from boeing 2");
    }
}
