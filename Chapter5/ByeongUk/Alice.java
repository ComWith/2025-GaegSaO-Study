public class Alice implements Witness {

    @Override
    public void enter(TrialRecord record) {
        record.append(Statement.of("앨리스: 증인석에 입장했습니다."));
    }

    @Override
    public void testify(TrialRecord record) {
        record.append(Statement.of("좀 억울해보이긴 하네요. 근데 진짜 했는지는 모르겠습니다."));
    }
}