import java.util.ArrayList;
import java.util.List;

public class TrialRecord {

    private final List<Statement> statements = new ArrayList<>();

    public void append(Statement statement) {
        statements.add(statement);
    }

    public int testimonyCount() {
        return statements.size();
    }

    public boolean anyMentions(String keyword) {
        return statements.stream().anyMatch(st -> st.mentions(keyword));
    }

    @Override public String toString() {
        return statements.toString();
    }
}