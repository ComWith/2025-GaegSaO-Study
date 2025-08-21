package Chapter1.ByeongUk;

// 가격 정책 (책임 분리를 통해 가격 정책 캡슐화)
public class Pricing {

    private Pricing() {}

    public static int calculatePrice(Coffee coffee) {
        int basedPrice = 3000;
        int extraFeePerShot = 500;

        return basedPrice + (coffee.getShots() - 1) * extraFeePerShot;
    }
}