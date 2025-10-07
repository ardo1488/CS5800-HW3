import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        MealSingleton mealSingleton = MealSingleton.getInstance();

        mealSingleton.setDietPlan(new PaleoDietPlan());

        mealSingleton.createMeal();

          for(int i = 0; i < 6; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select a diet plan (1- No Restrictions, 2- Paleo, 3- Vegan, 4- Nut Allergy): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    mealSingleton.setDietPlan(new NoRestrictionsDietPlan());
                    break;
                case 2:
                    mealSingleton.setDietPlan(new PaleoDietPlan());
                    break;
                case 3:
                    mealSingleton.setDietPlan(new VeganDietPlan());
                    break;
                case 4:
                    mealSingleton.setDietPlan(new NutAllergyDietPlan());
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid diet plan.");
                    continue;
            }
            mealSingleton.createMeal();
            System.out.println("Customer " + (i + 1) + " Meal Plan:");
            System.out.println("Carbs: " + mealSingleton.getCarbs());
            System.out.println("Fats: " + mealSingleton.getFats());
            System.out.println("Protein: " + mealSingleton.getProtein() + "\n");
        }
    }
}
