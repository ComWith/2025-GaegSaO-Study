// 증인을 소환하는 역할
public interface Summoner {
    // 이제 문맥을 받아 기록까지 책임지도록 한다
    void summon(Witness witness, TrialRecord record);
}