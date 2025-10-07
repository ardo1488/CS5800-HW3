public class MealSingleton {
    private static MealSingleton instance;
    private DietPlan dietPlan;
    private Carbs carbs;
    private Fats fats;
    private Protein protein;

    private MealSingleton() {
        // Private constructor to prevent instantiation
    }

    public static MealSingleton getInstance() {
        if (instance == null) {
            instance = new MealSingleton();
        }
        return instance;
    }

    public void setDietPlan(DietPlan dietPlan) {
        this.dietPlan = dietPlan;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    public String getCarbs() {
       return carbs.toString();
    }

    public String getFats() {
        return fats.toString();
    }

    public String getProtein() {
        return protein.toString();
    }

    public void createMeal() {
        if (dietPlan != null) {
            carbs = dietPlan.createCarbs();
            fats = dietPlan.createFats();
            protein = dietPlan.createProtein();
        } else {
            System.out.println("Diet plan not set.");
        }

        carbs.generateCarbItem();
        fats.generateFatsItem();
        protein.generateProteinItem();
    }


}
