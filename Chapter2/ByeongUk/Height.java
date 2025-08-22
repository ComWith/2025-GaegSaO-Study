// 앨리스의 키 (불변 + 동등성으로 비교)
public class Height {

    private final int height;

    private Height(int height) {
        if (height < 0) throw new IllegalArgumentException("키는 반드시 양수여야 합니다.");
        this.height = height;
    }

    public static Height ofHeight(int height) {
        return new Height(height);
    }

    public int getHeight() {
        return height;
    }

    public Height plus(int x) {
        return new Height(height + x);
    }

    public Height minus(int x) {
        return new Height(height - x);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return height == ((Height) o).height;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(height);
    }

    @Override
    public String toString() {
        return height + "cm";
    }

}