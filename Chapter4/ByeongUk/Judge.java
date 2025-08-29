package chapter4;

// 판사 역할
public interface Judge {
    // 재판을 여는 행동
    Verdict holdTrial(Summoner s, Witness w, TrialRecord record);
}