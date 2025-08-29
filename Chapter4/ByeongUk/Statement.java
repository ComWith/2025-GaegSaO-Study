package chapter4;

// 증언 엔티티
public class Statement {

    private final String text;  // 증언 내용이라는 상태가 필요

    private Statement(String text) {
        this.text = text;
    }

    public static Statement of(String text) {
        return new Statement(text);
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}