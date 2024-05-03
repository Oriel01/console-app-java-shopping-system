package classes;

import java.util.ArrayList;

public class Order {
    public static ArrayList orderList = new ArrayList();

    private Provider provider;
    private Product product;
    private int quantity;
    private double totalPrice = 0.0;
    private int orderDay;
    private int orderWeek;
    private OrderStatus status = OrderStatus.ACTIVE;
    public Order(Provider provider, Product product, int quantity, int orderDay, int orderWeek){
        this.provider = provider;
        this.product = product;
        this.quantity = quantity;
        this.orderDay = orderDay;
        this.orderWeek = orderWeek;
    }

    //Getter and Setters
    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public int getOrderWeek() {
        return orderWeek;
    }

    public void setOrderWeek(int orderWeek) {
        this.orderWeek = orderWeek;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderDay() {
        return orderDay;
    }

    public void setOrderDay(int orderDay) {
        this.orderDay = orderDay;
    }

    //Methods

    private void generateTotalPrice(int quantity){
        this.totalPrice *= quantity;
    }

    @Override
    public String toString() {
        return "Provider: " + provider.getProviderName() + "(" + provider.getProviderCode() + ")"
                + "\nProduct: " + product.getProductName()
                + "\nQuantity: " + quantity
                + "\nTotal Price: " + totalPrice
                + "\nOrder Day: " + orderDay
                + "\nStatus: " + status + "\n";
    }
}
