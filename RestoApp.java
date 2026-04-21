// Client Application
public class RestoApp {
    public static void main(String[] args) {
        System.out.println("=" .repeat(50));
        System.out.println("     RESTAURANT POS SYSTEM");
        System.out.println("=" .repeat(50));
        System.out.println();
        
        // Step 1: Create individual items (Leaves)
        MenuItem classicBurger = new MenuItem("Classic Burger", 250.00);
        MenuItem largeFries = new MenuItem("Large Fries", 85.00);
        MenuItem rootBeer = new MenuItem("Root Beer", 60.00);
        
        // Step 2: Create sub-composite (Barkada Solo Meal)
        MenuCategory barkadaSoloMeal = new MenuCategory("BARKADA SOLO MEAL");
        barkadaSoloMeal.add(classicBurger);
        barkadaSoloMeal.add(largeFries);
        barkadaSoloMeal.add(rootBeer);
        
        // Step 3: Create another leaf
        MenuItem vanillaSundae = new MenuItem("Vanilla Sundae", 45.00);
        
        // Step 4: Create top-composite (Main Menu)
        MenuCategory mainMenu = new MenuCategory("MAIN MENU");
        mainMenu.add(barkadaSoloMeal);
        mainMenu.add(vanillaSundae);
        
        // Step 5: Test - Call print() and getPrice() on Main Menu
        System.out.println("--- MENU DISPLAY ---");
        mainMenu.print();
        
        System.out.println();
        System.out.println("--- TOTAL MAIN MENU PRICE ---");
        System.out.printf("Main Menu Total: P%.2f%n", mainMenu.getPrice());
        
        System.out.println();
        System.out.println("--- INDIVIDUAL ITEM PRICES ---");
        classicBurger.print();
        largeFries.print();
        rootBeer.print();
        vanillaSundae.print();
        
        System.out.println();
        System.out.println("=" .repeat(50));
        System.out.println("     TRANSACTION COMPLETE");
        System.out.println("=" .repeat(50));
    }
}
