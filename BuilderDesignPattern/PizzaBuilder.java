public interface PizzaBuilder {

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    //Setters
    public PizzaBuilder setSize(Size size); 

    public PizzaBuilder addPepperoni();
    
    public PizzaBuilder addSausage();

    public PizzaBuilder addMushrooms();

    public PizzaBuilder addBacon();

    public PizzaBuilder addOnions();

    public PizzaBuilder addExtraCheese();

    public PizzaBuilder addPeppers();

    public PizzaBuilder addChicken();

    public PizzaBuilder addOlives();

    public PizzaBuilder addSpinach();

    public PizzaBuilder addTomatoAndBasil();

    public PizzaBuilder addBeef();

    public PizzaBuilder addHam();

    public PizzaBuilder addPesto();

    public PizzaBuilder addSpicyPork();

    public PizzaBuilder addHamAndPineapple();

    //Builder
    public Pizza build();

    //Getters
    String getPizzaChain();

    Size getSize();

    boolean hasPepperoni();

    boolean hasSausage();

    boolean hasMushrooms();

    boolean hasBacon();

    boolean hasOnions();

    boolean hasExtraCheese();

    boolean hasPeppers();

    boolean hasChicken();

    boolean hasOlives();

    boolean hasSpinach();

    boolean hasTomatoAndBasil();

    boolean hasBeef();

    boolean hasHam();

    boolean hasPesto();

    boolean hasSpicyPork();

    boolean hasHamAndPineapple();
}
