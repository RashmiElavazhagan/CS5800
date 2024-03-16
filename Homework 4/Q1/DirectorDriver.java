package Q1;

import HW4.Q1.Pizza;

public class DirectorDriver {
    public static void main(String[] args) {
        // Pizza Hut
        ConcreteBuilders.PizzaHutPizzaBuilder builder1_1 = new ConcreteBuilders.PizzaHutPizzaBuilder();
        builder1_1.setSize("Small");
        builder1_1.addPepperoni();
        builder1_1.addOlives();
        builder1_1.addOnions();
        Pizza pizza1_1 = builder1_1.build();
        pizza1_1.eat();

        ConcreteBuilders.PizzaHutPizzaBuilder builder1_2 = new ConcreteBuilders.PizzaHutPizzaBuilder();
        builder1_2.setSize("Medium");
        builder1_2.addPepperoni();
        builder1_2.addSausage();
        builder1_2.addOlives();
        builder1_2.addBeef();
        builder1_2.addHam();
        builder1_2.addExtraCheese();
        Pizza pizza1_2 = builder1_2.build();
        pizza1_2.eat();

        ConcreteBuilders.PizzaHutPizzaBuilder builder1_3 = new ConcreteBuilders.PizzaHutPizzaBuilder();
        builder1_3.setSize("Large");
        builder1_3.addPepperoni();
        builder1_3.addExtraCheese();
        builder1_3.addHam();
        builder1_3.addOlives();
        builder1_3.addBeef();
        builder1_3.addMushrooms();
        builder1_3.addSpinach();
        builder1_3.addTomatoAndBasil();
        builder1_3.addPesto();
        Pizza pizza1_3 = builder1_3.build();
        pizza1_3.eat();

        ConcreteBuilders.PizzaHutPizzaBuilder builder2_1_1= new ConcreteBuilders.PizzaHutPizzaBuilder();
        builder2_1_1.setSize("Large");
        builder2_1_1.addPepperoni();
        builder2_1_1.addSausage();
        builder2_1_1.addOlives();
        Pizza pizza2_1_1 = builder2_1_1.build();
        pizza2_1_1.eat();

        ConcreteBuilders.PizzaHutPizzaBuilder builder2_1_2= new ConcreteBuilders.PizzaHutPizzaBuilder();
        builder2_1_2.setSize("Small");
        builder2_1_2.addChicken();
        builder2_1_2.addPeppers();
        Pizza pizza2_1_2 = builder2_1_2.build();
        pizza2_1_2.eat();

        // Little Caesars
        ConcreteBuilders.LittleCaesarsPizzaBuilder builder2_2_1 = new ConcreteBuilders.LittleCaesarsPizzaBuilder();
        builder2_2_1.setSize("Medium");
        builder2_2_1.addExtraCheese();
        builder2_2_1.addMushrooms();
        builder2_2_1.addOlives();
        builder2_2_1.addOnions();
        builder2_2_1.addPeppers();
        builder2_2_1.addTomatoAndBasil();
        builder2_2_1.addBeef();
        builder2_2_1.addHam();
        Pizza pizza2_2_1 = builder2_2_1.build();
        pizza2_2_1.eat();

        ConcreteBuilders.LittleCaesarsPizzaBuilder builder2_2_2 = new ConcreteBuilders.LittleCaesarsPizzaBuilder();
        builder2_2_2.setSize("Small");
        builder2_2_2.addBacon();
        builder2_2_2.addChicken();
        builder2_2_2.addSpicyPork();
        builder2_2_2.addPeppers();
        builder2_2_2.addOnions();
        builder2_2_2.addHamAndPineapple();
        Pizza pizza2_2_2 = builder2_2_2.build();
        pizza2_2_2.eat();


        // Dominos
        ConcreteBuilders.DominosPizzaBuilder builder2_3_1 = new ConcreteBuilders.DominosPizzaBuilder();
        builder2_3_1.setSize("small");
        builder2_3_1.addHamAndPineapple();
        Pizza pizza2_3_1 = builder2_3_1.build();
        pizza2_3_1.eat();

        ConcreteBuilders.DominosPizzaBuilder builder2_3_2 = new ConcreteBuilders.DominosPizzaBuilder();
        builder2_3_2.setSize("Large");
        builder2_3_2.addSausage();
        builder2_3_2.addMushrooms();
        builder2_3_2.addOlives();
        Pizza pizza2_3_2 = builder2_3_2.build();
        pizza2_3_2.eat();
    }
}
