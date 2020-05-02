package introductionJava.lessons.lesson14.hw_22_AdventureGame.weapon;

public class KnifeBehavior implements WeaponBehavior {
    public static final String NAME = "Нож";
    @Override
    public void useWeapon() {
        System.out.println("Нож. Удар ножем -5");
    }
}
