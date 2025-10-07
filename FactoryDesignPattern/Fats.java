import java.util.Random;

interface Fats {
   
    void generateFatsItem();
}

class NoRestrictionsFats implements Fats {
    private String fatsItem;
   
    @Override
    public void generateFatsItem() {
        String[] fatsOptions = {"Avocado", "Sour Cream", "Tuna", "Peanuts"};
        Random rand = new Random();
        int fatsItemIndex = rand.nextInt(fatsOptions.length);
        fatsItem = fatsOptions[fatsItemIndex];
    }

    @Override
    public String toString() {
        return fatsItem;
    }
}

class PaleoFats implements Fats {
    private String fatsItem;
   
    @Override
    public void generateFatsItem() {
        String[] fatsOptions = {"Avocado", "Tuna", "Peanuts"};
        Random rand = new Random();
        int fatsItemIndex = rand.nextInt(fatsOptions.length);
        fatsItem = fatsOptions[fatsItemIndex];
    }

    @Override
    public String toString() {
        return fatsItem;
    }
}

class VeganFats implements Fats {
    private String fatsItem;
   
    @Override
    public void generateFatsItem() {
        String[] fatsOptions = {"Avocado", "Peanuts"};
        Random rand = new Random();
        int fatsItemIndex = rand.nextInt(fatsOptions.length);
        fatsItem = fatsOptions[fatsItemIndex];
    }

    @Override
    public String toString() {
        return fatsItem;
    }
}

class NutAllergyFats implements Fats {
    private String fatsItem;
   
    @Override
    public void generateFatsItem() {
        String[] fatsOptions = {"Avocado", "Sour Cream", "Tuna"};
        Random rand = new Random();
        int fatsItemIndex = rand.nextInt(fatsOptions.length);
        fatsItem = fatsOptions[fatsItemIndex];
    }

    @Override
    public String toString() {
        return fatsItem;
    }
}