public class Pizza {
    private final String pizzaChain;
    private final PizzaBuilder.Size size;
    private boolean pepperoni = false;
    private boolean sausage = false;
    private boolean mushrooms = false;
    private boolean bacon = false;
    private boolean onions = false;
    private boolean extraCheese = false;
    private boolean peppers = false;
    private boolean chicken = false;
    private boolean olives = false;
    private boolean spinach = false;
    private boolean tomatoAndBasil = false;
    private boolean beef = false;
    private boolean ham = false;
    private boolean pesto = false;
    private boolean spicyPork = false;
    private boolean hamAndPineapple = false;

    public Pizza(PizzaBuilder builder) {
        this.pizzaChain = builder.getPizzaChain();
        this.size = builder.getSize();
        this.pepperoni = builder.hasPepperoni();
        this.sausage = builder.hasSausage();
        this.mushrooms = builder.hasMushrooms();
        this.bacon = builder.hasBacon();
        this.onions = builder.hasOnions();
        this.extraCheese = builder.hasExtraCheese();
        this.peppers = builder.hasPeppers();
        this.chicken = builder.hasChicken();
        this.olives = builder.hasOlives();
        this.spinach = builder.hasSpinach();
        this.tomatoAndBasil = builder.hasTomatoAndBasil();
        this.beef = builder.hasBeef();
        this.ham = builder.hasHam();
        this.pesto = builder.hasPesto();
        this.spicyPork = builder.hasSpicyPork();
        this.hamAndPineapple = builder.hasHamAndPineapple();
    }

    public void eat(){
        System.out.println("Pizza Chain: " + pizzaChain);
        System.out.println("Size: " + size);
        System.out.println("Toppings:");
        System.out.println((pepperoni ? "Pepperoni\n" : "")
                + (sausage ? "Sausage\n" : "")
                + (mushrooms ? "Mushrooms\n" : "")
                + (bacon ? "Bacon\n" : "")
                + (onions ? "Onions\n" : "")
                + (extraCheese ? "Extra Cheese\n" : "")
                + (peppers ? "Peppers\n" : "")
                + (chicken ? "Chicken\n" : "")
                + (olives ? "Olives\n" : "")
                + (spinach ? "Spinach\n" : "")
                + (tomatoAndBasil ? "Tomato and Basil\n" : "")
                + (beef ? "Beef\n" : "")
                + (ham ? "Ham\n" : "")
                + (pesto ? "Pesto\n" : "")
                + (spicyPork ? "Spicy Pork\n" : "")
                + (hamAndPineapple ? "Ham and Pineapple\n" : ""));
    }
}
