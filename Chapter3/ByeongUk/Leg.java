package chapter3;

// 구간 객체
public class Leg {

    private final Station start;  // 출발역
    private final Station target;  // 도착역
    private final int time;  // 소요 시간

    public Leg(Station start, Station target, int time) {
        this.start = start;
        this.target = target;
        this.time = time;
    }

    public Station getStartStation() {
        return start;
    }

    public Station getTargetStation() {
        return target;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "[출발역: " + start + "역 -> 도착역: " + target + "역], 소요 시간: " + time + "분";
    }
}