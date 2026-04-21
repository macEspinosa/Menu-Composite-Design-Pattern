// Client Application
public class RestoApp {
    public static void main(String[] args) {
        // Leaves
        MenuItem classicBurger = new MenuItem("Classic Burger", 250.00);
        MenuItem largeFries = new MenuItem("Large Fries", 85.00);
        MenuItem rootBeer = new MenuItem("Root Beer", 60.00);
        
        // Sub-Composite
        MenuCategory barkadaSoloMeal = new MenuCategory("Barkada Solo Meal");
        barkadaSoloMeal.add(classicBurger);
        barkadaSoloMeal.add(largeFries);
        barkadaSoloMeal.add(rootBeer);
        
        // Leaf
        MenuItem vanillaSundae = new MenuItem("Vanilla Sundae", 45.00);
        
        // Top-Composite
        MenuCategory mainMenu = new MenuCategory("Main Menu");
        mainMenu.add(barkadaSoloMeal);
        mainMenu.add(vanillaSundae);
        
        // Test
        mainMenu.print();
        System.out.println("Total: P" + mainMenu.getPrice());
    }
}
