package chapter3;

public class JourneyMain {
    public static void main(String[] args) {

        Station A = new Station("A");
        Station E = new Station("E");

        RoutePlanner planner = new ExampleImplements();  // 예시 경로 구현체

        Journey leastTime = planner.plan(A, E, new LeastTimePolicy());  // 정책 구현체 선택
        Journey leastTransfers = planner.plan(A, E, new LeastTransferPolicy());  // 정책 구현체 선택

        System.out.println("[최단 시간 경로] " + leastTime);
        System.out.println("[최소 환승 경로] " + leastTransfers);
    }
}

/*
[최단 시간 경로] [A, B, C -> E] | 소요 시간: 25분, 환승 횟수: 2회
[최소 환승 경로] [A, D -> E] | 소요 시간: 30분, 환승 횟수: 1회
*/