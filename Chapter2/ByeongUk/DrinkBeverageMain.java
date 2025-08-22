public class DrinkBeverageMain {
    public static void main(String[] args) {

        // (값 객체) 상태 비교를 통해 동등성 판단
        Height h1 = Height.ofHeight(130);
        Height h2 = Height.ofHeight(130);
        System.out.println("값 객체(키)는 동등한가? " + h1.equals(h2));

        // (엔티티) 가변적이기 때문에 식별자로 동일성 판단
        Alice alice1 = new Alice(h1);
        Alice alice2 = new Alice(Height.ofHeight(130));
        System.out.println("앨리스 객체는 동일한가? " + alice1.equals(alice2));

        Beverage potion = new Beverage(50);

        // 쿼리 (상태 조회)
        System.out.println("앨리스의 키: " + alice1.getHeight() + ", 남은 음료의 양: " + potion.remainingPotion() + "ml");

        // 명령 (상태 변경)
        alice1.drink(potion, 20);
        System.out.println("음료를 마신 후, 앨리스의 키: " + alice1.getHeight() + ", 남은 음료의 양: " + potion.remainingPotion() + "ml");
    }
}

/*
값 객체(키)는 동등한가? true
앨리스 객체는 동일한가? false
앨리스의 키: 130cm, 남은 음료의 양: 50ml
음료를 마신 후, 앨리스의 키: 120cm, 남은 음료의 양: 30ml
*/