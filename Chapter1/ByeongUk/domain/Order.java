package Chapter1.ByeongUk.domain;

// 주문
public class Order {

    private final String customerName;  // 고객 이름이라는 상태
    private final Menu menuItem;  // 고객이 주문할 메뉴라는 상태
    private final int extraShots;  // 추가 샷이라는 상태

    public Order(String customerName, Menu menuItem, int extraShots) {
        this.customerName = customerName;
        this.menuItem = menuItem;
        this.extraShots = extraShots;
    }

    /*
    상태에 접근할 수 있는 유일한 방법 (Getter)
     */
    public String getCustomerName() {
        return customerName;
    }

    public Menu getMenuItem() {
        return menuItem;
    }

    public int getExtraShots() {
        return extraShots;
    }
}