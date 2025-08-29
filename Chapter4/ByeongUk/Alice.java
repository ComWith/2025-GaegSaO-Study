package chapter4;

// 증언하는 앨리스
public class Alice implements Witness {

    @Override
    public boolean enter() {
        return true;
    }

    @Override
    public Statement testify() {
        return Statement.of("좀 억울해보이긴 하네요. 근데 진짜 했는지는 모르겠습니다.");
    }
}