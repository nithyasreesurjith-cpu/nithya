
import java.util.*;

class MenuItem {
    String id, name;
    double price;

    MenuItem(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Order {
    String orderId;
    List<MenuItem> items = new ArrayList<>();

    Order(String orderId) {
        this.orderId = orderId;
    }

    void addItem(MenuItem item) {
        items.add(item);
    }

    double calculateBill() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.price;
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {

        MenuItem tea = new MenuItem("M1", "Tea", 20);
        MenuItem burger = new MenuItem("M2", "Burger", 80);
        MenuItem cake = new MenuItem("M3", "Cake", 50);

        Order order = new Order("O1");

        order.addItem(tea);
        order.addItem(burger);
        order.addItem(cake);

        System.out.println("Order ID : " + order.orderId);
        System.out.println("Total Bill : ₹" + order.calculateBill());
    }
}

