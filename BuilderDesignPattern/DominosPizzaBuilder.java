public class DominosPizzaBuilder implements PizzaBuilder {
    String pizzaChain = "Dominos";
    Size size = null;
    boolean pepperoni = false;
    boolean sausage = false;
    boolean mushrooms = false;
    boolean bacon = false;
    boolean onions = false;
    boolean extraCheese = false;
    boolean peppers = false;
    boolean chicken = false;
    boolean olives = false;
    boolean spinach = false;
    boolean tomatoAndBasil = false;
    boolean beef = false;
    boolean ham = false;
    boolean pesto = false;
    boolean spicyPork = false;
    boolean hamAndPineapple = false;

    @Override
    public PizzaBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    @Override
    public PizzaBuilder addSausage() {
        this.sausage = true;
        return this;
    }

    @Override
    public PizzaBuilder addMushrooms() {
        this.mushrooms = true;
        return this;
    }

    @Override
    public PizzaBuilder addBacon() {
        this.bacon = true;
        return this;
    }

    @Override
    public PizzaBuilder addOnions() {
        this.onions = true;
        return this;
    }

    @Override
    public PizzaBuilder addExtraCheese() {
        this.extraCheese = true;
        return this;
    }

    @Override
    public PizzaBuilder addPeppers() {
        this.peppers = true;
        return this;
    }

    @Override
    public PizzaBuilder addChicken() {
        this.chicken = true;
        return this;
    }

    @Override
    public PizzaBuilder addOlives() {
        this.olives = true;
        return this;
    }

    @Override
    public PizzaBuilder addSpinach() {
        this.spinach = true;
        return this;
    }

    @Override
    public PizzaBuilder addTomatoAndBasil() {
        this.tomatoAndBasil = true;
        return this;
    }

    @Override
    public PizzaBuilder addBeef() {
        this.beef = true;
        return this;
    }

    @Override
    public PizzaBuilder addHam() {
        this.ham = true;
        return this;
    }

    @Override
    public PizzaBuilder addPesto() {
        this.pesto = true;
        return this;
    }

    @Override
    public PizzaBuilder addSpicyPork() {
        this.spicyPork = true;
        return this;
    }

    @Override
    public PizzaBuilder addHamAndPineapple() {
        this.hamAndPineapple = true;
        return this;
    }

    @Override
    public Pizza build() {
        if (this.size == null) {
            throw new IllegalStateException("Size must be set");
        }
        return new Pizza(this);
    }

    @Override
    public String getPizzaChain() { return pizzaChain; }

    @Override 
    public Size getSize() { return size; }

    @Override 
    public boolean hasPepperoni() { return pepperoni; }

    @Override 
    public boolean hasSausage() { return sausage; }

    @Override 
    public boolean hasMushrooms() { return mushrooms; }

    @Override 
    public boolean hasBacon() { return bacon; }

    @Override 
    public boolean hasOnions() { return onions; }

    @Override 
    public boolean hasExtraCheese() { return extraCheese; }

    @Override 
    public boolean hasPeppers() { return peppers; }

    @Override 
    public boolean hasChicken() { return chicken; }

    @Override 
    public boolean hasOlives() { return olives; }

    @Override 
    public boolean hasSpinach() { return spinach; }

    @Override 
    public boolean hasTomatoAndBasil() { return tomatoAndBasil; }

    @Override 
    public boolean hasBeef() { return beef; }

    @Override 
    public boolean hasHam() { return ham; }

    @Override 
    public boolean hasPesto() { return pesto; }

    @Override 
    public boolean hasSpicyPork() { return spicyPork; }

    @Override 
    public boolean hasHamAndPineapple() { return hamAndPineapple; }
}
