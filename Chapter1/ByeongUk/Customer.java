ackage Chapter1.ByeongUk;

// 고객
public class Customer {

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public Receipt order(Cashier cashier, Menu menuItem, int extraShots) {
        Order order = new Order(name, menuItem, extraShots);  // 주문 생성
        return cashier.takeOrder(order);  // 캐시어로부터 주문에 대한 영수증을 받음
    }
}