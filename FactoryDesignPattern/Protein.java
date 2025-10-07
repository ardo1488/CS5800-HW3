import java.util.Random;

interface Protein {
   
    void generateProteinItem();
}

class NoRestrictionsProtein implements Protein {
    private String proteinItem;

    @Override
    public void generateProteinItem() {
        String[] proteinOptions = {"Fish", "Chicken", "Beef", "Tofu"};
        Random rand = new Random();
        int proteinItemIndex = rand.nextInt(proteinOptions.length);
        proteinItem = proteinOptions[proteinItemIndex];
    }

    @Override
    public String toString() {
        return proteinItem;
    }
}

class PaleoProtein implements Protein {
    private String proteinItem;
   
    @Override
    public void generateProteinItem() {
        String[] proteinOptions = {"Fish", "Chicken", "Beef"};
        Random rand = new Random();
        int proteinItemIndex = rand.nextInt(proteinOptions.length);
        proteinItem = proteinOptions[proteinItemIndex];
    }

    @Override
    public String toString() {
        return proteinItem;
    }
}

class VeganProtein implements Protein {
    private String proteinItem;
   
    @Override
    public void generateProteinItem() {
        proteinItem = "Tofu";
    }

    @Override
    public String toString() {
        return proteinItem;
    }
}

class NutAllergyProtein implements Protein {
    private String proteinItem;
   
    @Override
    public void generateProteinItem() {
        String[] proteinOptions = {"Fish", "Chicken", "Beef", "Tofu"};
        Random rand = new Random();
        int proteinItemIndex = rand.nextInt(proteinOptions.length);
        proteinItem = proteinOptions[proteinItemIndex];
    }

    @Override
    public String toString() {
        return proteinItem;
    }
}