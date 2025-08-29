package chapter4;

// 판사 역할을 수행하는 여왕
public class Queen implements Judge {

    @Override
    public Verdict holdTrial(Summoner s, Witness w, TrialRecord record) {
        s.summon(w);  // 증인 소환
        if (w.enter()) {
            Statement st = w.testify();
            record.append(st);
        }

        // 증언에 "훔치다" 라는 키워드가 있어야 유죄로 판단, 그렇지 않으면 무죄
        return Verdict.of(record.anyMentions("steal") ? Type.GUILTY : Type.INNOCENT);
    }
}