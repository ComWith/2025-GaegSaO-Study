package chapter1;

public class CoffeeShopMain {
    public static void main(String[] args) {

        Menu americano = new Menu("아메리카노", 2);
        Menu latte = new Menu("카페라떼", 1);
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        Cashier goodCashier1 = new GoodCashier(new AmericanoBarista());
        Receipt receipt1 = alice.order(goodCashier1, americano, 2);
        System.out.println(receipt1);

        System.out.println();

        Cashier goodCashier2 = new GoodCashier(new LatteBarista());
        Receipt receipt2 = bob.order(goodCashier2, latte, 1);
        System.out.println(receipt2);
    }
}

/*
안녕하세요~ Alice님! 주문 도와드리겠습니다.
기가 막힌 아메리카노 제조 중...
총 4500원입니다. 맛있게 드세요~
Receipt [order=chapter1.Order@6b884d57, coffee=Coffee [name=아메리카노, shots=4], price=4500₩]

안녕하세요~ Bob님! 주문 도와드리겠습니다.
기가 막힌 카페라떼 제조 중...
총 3500원입니다. 맛있게 드세요~
Receipt [order=chapter1.Order@19469ea2, coffee=Coffee [name=카페라떼, shots=2], price=3500₩]
*/