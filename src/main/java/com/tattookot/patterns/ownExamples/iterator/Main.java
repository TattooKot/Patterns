package main.java.com.tattookot.patterns.ownExamples.iterator;

public class Main {
    public static void main(String[] args) {
        String[] dishes = {"breakfast", "dinner", "supper"};
        Chef chef = new Chef("Gordon Ramsey", dishes);

        System.out.println("Chef name: " + chef.getName());
        System.out.println("Known dishes:");

        Iterator iterator = chef.getIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
