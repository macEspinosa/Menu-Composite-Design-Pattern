// Step C: The Composite (Category/Combo)
import java.util.ArrayList;
import java.util.List;

public class MenuCategory implements MenuComponent {
    private String name;
    private List<MenuComponent> menuComponents;
    
    public MenuCategory(String name) {
        this.name = name;
        this.menuComponents = new ArrayList<>();
    }
    
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }
    
    @Override
    public double getPrice() {
        double total = 0;
        for (MenuComponent component : menuComponents) {
            total += component.getPrice();
        }
        return total;
    }
    
    @Override
    public void print() {
        System.out.println(name + ":");
        for (MenuComponent component : menuComponents) {
            component.print();
        }
    }
}
