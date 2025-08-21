package Chapter1.ByeongUk.domain;

// 메뉴
public class Menu {

    private final String name;  // 메뉴 이름이라는 상태
    private final int defaultShots;  // 기본 샷이라는 상태

    public Menu(String name, int defaultShots) {
        this.name = name;
        this.defaultShots = defaultShots;
    }

    /*
    상태에 접근할 수 있는 유일한 방법 (Getter)
     */
    public String getName() {
        return name;
    }

    public int getDefaultShots() {
        return defaultShots;
    }
}