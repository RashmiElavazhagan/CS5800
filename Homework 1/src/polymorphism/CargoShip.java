package polymorphism;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void print() {
        System.out.println(
                "Name: " + getName() + "\n" +
                "Cargo Capacity: " + cargoCapacity + "\n");
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}
