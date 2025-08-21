package Chapter1.ByeongUk.role;

// 캐시어 역할 (주문을 받아 결과를 돌려줌)
public interface Cashier {

    Receipt takeOrder(Order order);
}