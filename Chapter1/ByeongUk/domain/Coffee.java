package Chapter1.ByeongUk.domain;

// 커피
public class Coffee {

    private final String name;  // 커피 이름이라는 상태
    private final int shots;  // 커피에 들어갈 샷이라는 상태

    public Coffee(String name, int shots) {
        this.name = name;
        this.shots = shots;
    }

    /*
    상태에 접근할 수 있는 유일한 방법 (Getter)
     */
    public String getName() {
        return name;
    }

    public int getShots() {
        return shots;
    }

    @Override
    public String toString() {
        return "Coffee [name=" + name + ", shots=" + shots + "]";
    }
}