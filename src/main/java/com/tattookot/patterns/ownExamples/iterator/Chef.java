package main.java.com.tattookot.patterns.ownExamples.iterator;

public class Chef implements Collection{

    private String name;
    private String[] dishes;

    public Chef(String name, String[] dishes) {
        this.name = name;
        this.dishes = dishes;
    }

    public String getName() {
        return name;
    }

    public String[] getDishes() {
        return dishes;
    }

    @Override
    public Iterator getIterator() {
        return new DishesIterator();
    }

    private class DishesIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index<dishes.length;
        }

        @Override
        public Object next() {
            return dishes[index++];
        }
    }
}
