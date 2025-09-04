public class WhiteRabbit implements Summoner {

    @Override
    public void summon(Witness witness, TrialRecord record) {
        record.append(Statement.of("[WhiteRabbit] 증인을 부릅니다."));
        witness.enter(record);
    }
}