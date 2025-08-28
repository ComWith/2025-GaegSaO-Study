package chapter3;

import java.util.List;

import static java.util.stream.Collectors.toList;

// 최종 여정 객체
public class Journey {

    private final List<Leg> legs;

    public Journey(List<Leg> legs) {
        this.legs = List.copyOf(legs);
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public int getTotalMinutes() {
        return legs.stream().mapToInt(Leg::getTime).sum();
    }

    public int transfers() {
        return Math.max(0, legs.size() - 1);
    }

    @Override
    public String toString() {
        String path = legs.stream().map(l -> l.getStartStation().getName()).collect(toList()).toString()
                .replace("]", " -> "+legs.get(legs.size()-1).getTargetStation().getName() + "]");
        return path + " | 소요 시간: " + getTotalMinutes() + "분, 환승 횟수: " + transfers() + "회";
    }
}