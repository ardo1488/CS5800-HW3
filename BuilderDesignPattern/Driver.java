public class Driver {
    public static void main(String[] args) {
        PizzaBuilder pizza1 = new PizzaHutPizzaBuilder();
        pizza1.setSize(PizzaBuilder.Size.SMALL)
                .addPepperoni()
                .addMushrooms()
                .addExtraCheese();
        Pizza myPizza1 = pizza1.build();
        myPizza1.eat();

        PizzaBuilder pizza2 = new PizzaHutPizzaBuilder();
        pizza2.setSize(PizzaBuilder.Size.MEDIUM)
                .addSausage()
                .addOnions()
                .addPeppers()
                .addChicken()
                .addBacon()
                .addTomatoAndBasil();
        Pizza myPizza2 = pizza2.build();
        myPizza2.eat();

        PizzaBuilder pizza3 = new PizzaHutPizzaBuilder();
        pizza3.setSize(PizzaBuilder.Size.LARGE)
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .addPeppers()
                .addChicken()                
                .addPesto();
        Pizza myPizza3 = pizza3.build();
        myPizza3.eat();


        System.out.println("\n");

        PizzaBuilder pizzaHutPizza1 = new PizzaHutPizzaBuilder();
        pizzaHutPizza1.setSize(PizzaBuilder.Size.LARGE)
                .addPepperoni()
                .addMushrooms()
                .addExtraCheese();
        Pizza myPHPizza1 = pizzaHutPizza1.build();
        myPHPizza1.eat();

        PizzaBuilder pizzaHutPizza2 = new PizzaHutPizzaBuilder();
        pizzaHutPizza2.setSize(PizzaBuilder.Size.SMALL)
                .addSausage()
                .addOnions();
        Pizza myPHPizza2 = pizzaHutPizza2.build();
        myPHPizza2.eat();

        PizzaBuilder littleCaesarsPizza1 = new LittleCaesarsPizzaBuilder();
        littleCaesarsPizza1.setSize(PizzaBuilder.Size.MEDIUM) 
                .addPepperoni()
                .addBeef()
                .addPeppers()
                .addPesto()
                .addExtraCheese()
                .addBacon()
                .addChicken()
                .addOnions();
        Pizza myLCPizza1 = littleCaesarsPizza1.build();
        myLCPizza1.eat();

        PizzaBuilder littleCaesarsPizza2 = new LittleCaesarsPizzaBuilder();
        littleCaesarsPizza2.setSize(PizzaBuilder.Size.SMALL)
                .addHamAndPineapple()
                .addMushrooms()
                .addExtraCheese()
                .addBacon()
                .addOnions()
                .addPeppers();
        Pizza myLCPizza2 = littleCaesarsPizza2.build();
        myLCPizza2.eat();

        PizzaBuilder dominosPizza1 = new DominosPizzaBuilder();
        dominosPizza1.setSize(PizzaBuilder.Size.SMALL)
                .addPepperoni();
        Pizza myDPizza1 = dominosPizza1.build();
        myDPizza1.eat();

        PizzaBuilder dominosPizza2 = new DominosPizzaBuilder();
        dominosPizza2.setSize(PizzaBuilder.Size.LARGE)
                .addPepperoni()
                .addSausage()
                .addMushrooms();
        Pizza myDPizza2 = dominosPizza2.build();
        myDPizza2.eat();
    }
}
