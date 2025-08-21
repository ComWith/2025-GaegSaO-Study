package Chapter1.ByeongUk;

// 영수증 (협력의 결과물)
public class Receipt {

    private final Order order;
    private final Coffee coffee;
    private final int price;

    public Receipt(Order order, Coffee coffee, int price) {
        this.order = order;
        this.coffee = coffee;
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Receipt [order=" + order + ", coffee=" + coffee + ", price=" + price + "₩]";
    }
}