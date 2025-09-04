public class Statement {

    private final String text;

    private Statement(String text) {
        this.text = text;
    }

    public static Statement of(String text) {
        return new Statement(text);
    }

    public boolean mentions(String keyword) {
        return text.contains(keyword);
    }

    @Override public String toString() {
        return text;
    }
}