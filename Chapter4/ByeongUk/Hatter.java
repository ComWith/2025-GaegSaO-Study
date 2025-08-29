package chapter4;

// 증언하는 모자 장수
public class Hatter implements Witness {

    private final String feeling;  // 쫄리는 정도

    Hatter(String feeling) {
        this.feeling = feeling;
    }

    @Override
    public boolean enter() {
        return true;  // 일단 무조건 입장한다고 가정
    }

    @Override
    public Statement testify() {
        String content = switch(feeling) {
            case "nervous" -> "누가 훔친 걸(steal) 봤어요...";
            case "calm" -> "아무 것도 못 봤는데요?";
            default -> "저 그때 그곳에 없었습니다.";
        };

        return Statement.of(content);
    }
}