import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<String> items = new ArrayList<>();
    private double totalAmount;
    private double discountApplied;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void addItem(String item, double price) {
        items.add(item);
        totalAmount += price;
    }

    public double calculateTotal() {
        return totalAmount - discountApplied;
    }

    public void applyDiscount(double discount) {
        this.discountApplied = discount;
    }

    public void placeOrder(User user) {
        double finalTotal = calculateTotal();
        int pointsEarned = (int) (finalTotal * 0.10);
        user.addPoints(pointsEarned);

        System.out.println("Order placed. Points earned: " + pointsEarned);
    }

    public void cancelOrder() {
        System.out.println("Order " + orderId + " canceled.");
    }
}
