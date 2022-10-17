package structural.adapter.problem;

public class Main {
    
    public static void main(String[] args) {
    	Movable bugattiVeyron = new BugattiVeyron();
        System.out.println("Bugatti Veyron Super Sport's top speed is " + bugattiVeyron.getSpeed() + " mph.");

        Movable mcLaren = new McLaren();
        System.out.println("McLaren F1 top speed is " + mcLaren.getSpeed() + " mph.");

        Movable astonMartin = new AstonMartin();
        System.out.println("McLaren F1 top speed is " + astonMartin.getSpeed() + " mph.");
    }

    // Interface segregation principle.
}
