package chapter4;

// 판사 역할을 수행하는 왕
public class King implements Judge {

    @Override
    public Verdict holdTrial(Summoner s, Witness w, TrialRecord record) {
        s.summon(w);  // 증인 소환
        if (w.enter()) {
            Statement st = w.testify();
            record.append(st);
        }

        // 그냥 간단하게 증언이 있다면 유죄, 없다면 무죄로 설정
        return Verdict.of(record.count() > 0 ? Type.GUILTY : Type.INNOCENT);
    }
}