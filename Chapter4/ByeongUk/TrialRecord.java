package chapter4;

import java.util.ArrayList;
import java.util.List;

// 재판 기록 엔티티
public class TrialRecord {

    private final List<Statement> statements = new ArrayList<>();

    // 추가 진술이 있을 경우 재판 기록 수정
    public void append(Statement statement) {
        statements.add(statement);
    }

    int count() {
        return statements.size();
    }

    // 특정 증언 내용이 있다면 유죄
    boolean anyMentions(String keyword) {
        return statements.stream().anyMatch(s -> s.getText().contains(keyword));
    }

    @Override
    public String toString() {
        return statements.toString();
    }
}