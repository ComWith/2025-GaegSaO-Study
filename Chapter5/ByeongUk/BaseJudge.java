public abstract class BaseJudge implements Judge {

    private final VerdictPolicy verdictPolicy;

    public BaseJudge(VerdictPolicy verdictPolicy) {
        this.verdictPolicy = verdictPolicy;
    }

    @Override
    public Verdict holdTrial(Summoner summoner, Witness witness, TrialRecord record) {
        record.append(Statement.of(title() + "재판을 시작합니다."));
        summoner.summon(witness, record);
        record.append(Statement.of(title() + ": 증언하십시오."));
        witness.testify(record);

        Verdict verdict = verdictPolicy.decide(record);
        record.append(Statement.of(title() + ": 평결 ->" + verdict));

        return verdict;
    }

    // “누가 말하는가”라는 표현만 서브클래스에 위임
    protected abstract String title();
}