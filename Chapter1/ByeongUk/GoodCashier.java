package Chapter1.ByeongUk;

public class GoodCashier implements Cashier {

    // 어떤 바리스타와 협력할 것인지 캐시어가 결정
    private final Barista barista;

    public GoodCashier(Barista barista) {
        this.barista = barista;
    }

    @Override
    public Receipt takeOrder(Order order) {
        System.out.println("안녕하세요~ " + order.getCustomerName() + "님! 주문 도와드리겠습니다.");
        Coffee coffee = barista.makeCoffee(order);  // 바리스타에게 메시지 전송
        int price = Pricing.calculatePrice(coffee);
        System.out.println("총 " + price + "원입니다. 맛있게 드세요~");

        return new Receipt(order, coffee, price);
    }
}