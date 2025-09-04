// 재판에 입장하고 증언하는 역할
public interface Witness {
    void enter(TrialRecord record);
    void testify(TrialRecord record);
}