package polymorphism;

public class PolymorphismDriver {

    public static void main(String[] args) {

        Ship[] shipArray = new Ship[3];

        shipArray[0] = new Ship("Nina", "1934");
        shipArray[1] = new CruiseShip("Pinta", "1955", 4368);
        shipArray[2] = new CargoShip("Santa Maria", "1934", 24738);

        for (Ship ship : shipArray) {
            ship.print();
        }
    }

}
