package chapter4;

public class JudgeMain {
    public static void main(String[] args) {

        Summoner whiteRabbit = new WhiteRabbit();

        // 협력1: 왕과 모자 장수
        Judge king = new King();
        Witness hatter = new Hatter("nervous");
        TrialRecord trialRecord1 = new TrialRecord();
        Verdict verdict1 = king.holdTrial(whiteRabbit, hatter, trialRecord1);
        System.out.println("증언 내용: " + trialRecord1 + ", 평결: " + verdict1);

        System.out.println();

        // 협력2: 여왕과 앨리스
        Judge queen = new Queen();
        Witness alice = new Alice();
        TrialRecord trialRecord2 = new TrialRecord();
        Verdict verdict2 = queen.holdTrial(whiteRabbit, alice, trialRecord2);
        System.out.println("증언 내용: " + trialRecord2 + ", 평결: " + verdict2);
    }
}

/*
하얀 토끼: 증인 출석을 요청드립니다!
증언 내용: [누가 훔친 걸(steal) 봤어요...], 평결: GUILTY

하얀 토끼: 증인 출석을 요청드립니다!
증언 내용: [좀 억울해보이긴 하네요. 근데 진짜 했는지는 모르겠습니다.], 평결: INNOCENT
*/