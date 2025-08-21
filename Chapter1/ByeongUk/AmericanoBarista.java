package Chapter1.ByeongUk;

// 아메리카노를 잘하는 바리스타
public class AmericanoBarista implements Barista {

    @Override
    public Coffee makeCoffee(Order order) {
        int shots = order.getMenuItem().getDefaultShots() + order.getExtraShots();
        System.out.println("기가 막힌 아메리카노 제조 중...");

        return new Coffee(order.getMenuItem().getName(), shots);
    }
}