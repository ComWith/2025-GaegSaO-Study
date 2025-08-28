package chapter3;

import java.util.Comparator;
import java.util.List;

// 예시 경로 구현체
public class ExampleImplements implements RoutePlanner {

    @Override
    public Journey plan(Station start, Station target, CostPolicy cost) {
        List<Journey> journeys = examples(start, target);

        return journeys.stream().min(Comparator.comparingInt(cost::score)).orElseThrow(() -> new IllegalStateException("해당하는 경로가 없습니다..."));
    }

    // A역부터 E역까지의 경로
    private List<Journey> examples(Station A, Station E) {
        Station B = new Station("B");
        Station C = new Station("C");
        Station D = new Station("D");

        // 예시 경로
        Journey leastTime = new Journey(List.of(new Leg(A, B, 10), new Leg(B, C, 10), new Leg(C, E, 5)));
        Journey leastTransfers = new Journey(List.of(new Leg(A, D, 20), new Leg(D, E, 10)));

        return List.of(leastTime, leastTransfers);
    }
}