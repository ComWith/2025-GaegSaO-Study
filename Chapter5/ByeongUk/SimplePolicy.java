public class SimplePolicy implements VerdictPolicy {

    @Override public Verdict decide(TrialRecord record) {
        return Verdict.of(record.testimonyCount() > 0 ? Type.GUILTY : Type.INNOCENT);
    }
}