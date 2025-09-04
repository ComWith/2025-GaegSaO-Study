public class JudgeMain {
    public static void main(String[] args) {

        Summoner whiteRabbit = new WhiteRabbit();

        // 재판1: 왕과 모자 장수와의 협력
        King king = new King();
        Witness hatter = new Hatter("nervous");
        TrialRecord record1 = new TrialRecord();
        System.out.println("[재판1] 판결=" + king.holdTrial(whiteRabbit, hatter, record1)
                + " | record=" + record1);

        System.out.println();

        // 재판2: 여왕과 앨리스와의 협력
        Queen queen = new Queen();
        Witness alice = new Alice();
        TrialRecord record2 = new TrialRecord();
        System.out.println("[재판2] 판결=" + queen.holdTrial(whiteRabbit, alice, record2)
                + " | record=" + record2);

    }
}

/*

[재판1] 판결=GUILTY | record=[왕: 재판을 시작합니다..., 하얀토끼: 증인을 부릅니다..., 모자 장수(nervous): 증인석에 입장., 왕: 증언하십시오..., 누가 훔친 걸(steal) 봤어요..., 왕: 평결 -> GUILTY]

[재판2] 판결=INNOCENT | record=[여왕: 재판을 시작합니다..., 하얀토끼: 증인을 부릅니다..., 앨리스: 증인석에 입장했습니다., 여왕: 증언하십시오..., 좀 억울해보이긴 하네요. 근데 진짜 했는지는 모르겠습니다., 여왕: 평결 -> INNOCENT]
*/