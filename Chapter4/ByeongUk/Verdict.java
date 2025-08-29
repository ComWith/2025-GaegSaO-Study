package chapter4;

// 판결 엔티티
public class Verdict {

    private final Type type;  // 판결 유형이라는 상태 필요(유죄/무죄)

    private Verdict(Type type) {
        this.type = type;
    }

    public static Verdict of(Type type) {
        return new Verdict(type);
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.name();
    }
}