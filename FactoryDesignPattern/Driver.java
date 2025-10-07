import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        MealSingleton mealSingleton = MealSingleton.getInstance();

        mealSingleton.setDietPlan(new PaleoDietPlan());

        mealSingleton.createMeal();

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 6; i++) {
            System.out.print("Please enter your name: ");
            String name = scanner.next();
            System.out.print("Select a diet plan (1- No Restrictions, 2- Paleo, 3- Vegan, 4- Nut Allergy): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> mealSingleton.setDietPlan(new NoRestrictionsDietPlan());
                case 2 -> mealSingleton.setDietPlan(new PaleoDietPlan());
                case 3 -> mealSingleton.setDietPlan(new VeganDietPlan());
                case 4 -> mealSingleton.setDietPlan(new NutAllergyDietPlan());
                default -> {
                    System.out.println("Invalid choice. Please select a valid diet plan.");
                    continue;
                }
            }
            mealSingleton.createMeal();
            System.out.println("\nCustomer " + (i + 1) + ":  " + name + "\n\nMeal:");
            System.out.println("Carbs: " + mealSingleton.getCarbs());
            System.out.println("Fats: " + mealSingleton.getFats());
            System.out.println("Protein: " + mealSingleton.getProtein() + "\n");
        }
        scanner.close();
    }
}
