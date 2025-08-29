package chapter4;

// 소환 요청을 하는 하얀 토끼
public class WhiteRabbit implements Summoner {

    @Override
    public void summon(Witness w) {
        System.out.println("하얀 토끼: 증인 출석을 요청드립니다!");
    }
}