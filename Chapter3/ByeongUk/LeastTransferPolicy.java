package chapter3;

// 최소 환승 경로 정책
public class LeastTransferPolicy implements CostPolicy {

    @Override
    public int score(Journey j) {
        return j.transfers() * 1000 + j.getTotalMinutes();
    }
}