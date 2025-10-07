import java.util.Random;

interface Carbs {
   
    void generateCarbItem();
}

class NoRestrictionsCarbs implements Carbs {
    private String carbItem;
   
    @Override
    public void generateCarbItem() {
        String[] carbOptions = {"Cheese", "Bread", "Lentils", "Pistachio"};
        Random rand = new Random();
        int carbItemIndex = rand.nextInt(carbOptions.length);
        carbItem = carbOptions[carbItemIndex];
    }

    @Override
    public String toString() {
        return carbItem;
    }
}

class PaleoCarbs implements Carbs {
    private String carbItem;
   
    @Override
    public void generateCarbItem() {
       
        carbItem = "Pistachio";
    }

    @Override
    public String toString() {
        return carbItem;
    }
}

class VeganCarbs implements Carbs {
    private String carbItem;
   
    @Override
    public void generateCarbItem() {
        String[] carbOptions = {"Bread", "Lentils", "Pistachio"};
        Random rand = new Random();
        int carbItemIndex = rand.nextInt(carbOptions.length);
        carbItem = carbOptions[carbItemIndex];
    }

    @Override
    public String toString() {
        return carbItem;
    }
}

class NutAllergyCarbs implements Carbs {
    private String carbItem;
   
    @Override
    public void generateCarbItem() {
        String[] carbOptions = {"Cheese", "Bread", "Lentils"};
        Random rand = new Random();
        int carbItemIndex = rand.nextInt(carbOptions.length);
        carbItem = carbOptions[carbItemIndex];
    }

    @Override
    public String toString() {
        return carbItem;
    }
}