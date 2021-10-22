package main.java.com.tattookot.patterns.ownExamples.mediator;

import java.util.ArrayList;
import java.util.List;

public class Boryspil implements Airport{
    List<Plane> planes = new ArrayList<>();

    public void addPlaneToPlaneList(Plane plane){
        planes.add(plane);
    }

    @Override
    public void tellInformationToAllPlanes(String information, Plane plane) {
        planes.stream()
                .filter(plane1 -> plane1 != plane)
                .forEach(plane1 -> plane1.listenInformationFromAirport(information));
    }
}
