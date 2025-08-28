package chapter3;

// 경로를 계획하는 메시지
public interface RoutePlanner {
    Journey plan(Station start, Station target, CostPolicy cost);
}