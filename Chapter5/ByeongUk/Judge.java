// 재판을 개시하는 역할
public interface Judge {
    Verdict holdTrial(Summoner summoner, Witness witness, TrialRecord record);
}