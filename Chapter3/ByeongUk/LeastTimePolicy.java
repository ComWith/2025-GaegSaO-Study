package chapter3;

// 최단 시간 경로 정책
public class LeastTimePolicy implements CostPolicy {

    @Override
    public int score(Journey j) {
        return j.getTotalMinutes() * 1000 + j.transfers();
    }
}