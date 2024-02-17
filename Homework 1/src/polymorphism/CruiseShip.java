package polymorphism;

public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void print() {
        System.out.println(
                "Name: " + getName() + "\n" +
                "Passengers: " + maxPassengers + "\n");
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
