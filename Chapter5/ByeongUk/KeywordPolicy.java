public class KeywordPolicy implements VerdictPolicy {

    private final String keyword;

    public KeywordPolicy(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public Verdict decide(TrialRecord record) {
        return Verdict.of(record.anyMentions(keyword) ? Type.GUILTY : Type.INNOCENT);
    }
}