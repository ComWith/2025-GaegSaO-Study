import java.util.UUID;

// 음료 객체 (가변 + 식별자 기반으로 동등성 비교)
public class Beverage {

    private final UUID id;  // 엔티티 식별자
    private int remainingPotion;  // 가변 상태 (외부 직접 수정 불가)

    public Beverage(int initialPotion) {
        if (initialPotion < 0) throw new IllegalArgumentException("초기값은 반드시 0 이상이어야 합니다...");
        this.id = UUID.randomUUID();
        this.remainingPotion = initialPotion;
    }

    // 명령 (상태 변경 - Side Effect 발생)
    public void consume(int ml) {
        if (ml <= 0) throw new IllegalArgumentException("섭취량은 양수여야 합니다...");
        if (ml > remainingPotion) throw new IllegalArgumentException("음료가 바닥나기 직전입니다!");
        this.remainingPotion -= ml;  // 자신의 상태는 자신이 바꿈(자율성, 캡슐화)
    }

    // 쿼리 (상태 조회)
    public int remainingPotion() {
        return this.remainingPotion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Beverage)) return false;
        return id.equals(((Beverage) o).id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Beverage 객체 [식별자 값: " + id + ", 남은 양: " + remainingPotion + "ml]";
    }
}