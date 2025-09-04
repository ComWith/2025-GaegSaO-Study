public class Hatter implements Witness {

    private final String feeling;
    public Hatter(String feeling) { this.feeling = feeling; }

    @Override
    public void enter(TrialRecord record) {
        record.append(Statement.of("모자 장수(" + feeling + "): 증인석에 입장."));
    }

    @Override
    public void testify(TrialRecord record) {
        String content = switch (feeling) {
            case "nervous" -> "누가 훔친 걸(steal) 봤어요...";
            case "calm"    -> "아무것도 못 봤는데요?";
            default        -> "저 그때 그곳에 없었습니다.";
        };
        record.append(Statement.of(content));
    }
}