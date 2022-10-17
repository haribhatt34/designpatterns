package structural.adapter.solution;

public class Main {
    
    public static void main(String[] args) {
        Movable bugattiVeyron = new BugattiVeyron();
        System.out.println("Bugatti Veyron Super Sport's top speed is " + bugattiVeyron.getSpeed() + " mph.");

        MovableAdapter bugattiVeyronIndia = new MovableAdapterImpl(bugattiVeyron);
        System.out.println("Bugatti Veyron Super Sport's top speed is " + bugattiVeyronIndia.getSpeed() + " kph.");

        // Use Cases:
        // 1.
        // InsideView acquired by DemandBase, now  suppose we chose DB code as a base code,
        // all the APIs for InsideView, can be passed to a say DemandBaseAdapter, which convert & hit the Demandbase API server
        // and same for response, we can have an adapter to convert it InsideView suitable response,
        // so user experience is not affected.

        // 2.
        // our db was in mysql, we migrated to mongodb, all calls going to mysql should now go to mongodb as well.
        // so instead of tweaking the code of service/DAO layer to hit the mongodb server.
        // we wanted to DB calls to go to both, as want to test mongodb, till we see everything working fine at
        // mongodb side.
        // write adapter that converts the insert/update for mysql in terms of mongodb => forward write.
        }
}
