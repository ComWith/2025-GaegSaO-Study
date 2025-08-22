import java.util.Objects;
import java.util.UUID;

// 앨리스 객체 (가변 + 식별자 기반으로 동등성 비교)
public class Alice {

    private final UUID id;  // 식별자 - 동일성 판단
    private Height height;

    public Alice(Height height) {
        this.id = UUID.randomUUID();
        this.height = Objects.requireNonNull(height);
    }

    // 쿼리 (상태 조회)
    public Height getHeight() {
        return height;
    }

    // 명령 (상태 변경 - Side Effect 발생)
    public void drink(Beverage potion, int ml) {
        Objects.requireNonNull(potion);
        if (ml <= 0) throw new IllegalArgumentException("음료를 섭취하여야 합니다...");

        // 협력(메시지 전송), 다른 객체의 상태 변경은 그 객체가 알아서 판단
        potion.consume(ml);

        // 자신의 상태 변경 (예를 들어, 2ml 섭취 시 1cm 감소한다고 가정하자)
        this.height = this.height.minus(ml / 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alice)) return false;
        return id.equals(((Alice) o).id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Alice 객체 [식별자 값: " + id + ", 키: " + height + "cm]";
    }
}