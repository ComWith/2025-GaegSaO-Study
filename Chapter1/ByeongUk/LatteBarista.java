package Chapter1.ByeongUk;

// 라떼를 잘하는 바리스타
public class LatteBarista implements Barista {

    @Override
    public Coffee makeCoffee(Order order) {
        int shots = order.getMenuItem().getDefaultShots() + order.getExtraShots();
        System.out.println("기가 막힌 카페라떼 제조 중...");

        return new Coffee(order.getMenuItem().getName(), shots);
    }
}