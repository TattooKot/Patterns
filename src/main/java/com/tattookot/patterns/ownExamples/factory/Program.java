package main.java.com.tattookot.patterns.ownExamples.factory;

public class Program {
    public static void main(String[] args) {
        VisitorFactory visitorFactory = createFactoryBySpeciality("mma");
        Visitor visitor = visitorFactory.createVisitor();

        visitor.train();
    }

    static VisitorFactory createFactoryBySpeciality(String speciality){
        if(speciality.equalsIgnoreCase("mma")){
            return new MmaVisitorFactory();
        } else if(speciality.equalsIgnoreCase("gym")){
            return new GymVisitorFactory();
        } else if(speciality.equalsIgnoreCase("pool")){
            return new PoolVisitorFactory();
        } else throw new RuntimeException(speciality + " is unknown speciality.");
    }
}
