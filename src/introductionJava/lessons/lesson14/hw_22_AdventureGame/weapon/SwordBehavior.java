package introductionJava.lessons.lesson14.hw_22_AdventureGame.weapon;

public class SwordBehavior implements WeaponBehavior {
    public static final String NAME = "Меч";
    @Override
    public void useWeapon() {
        System.out.println("Меч. Удар мечем -20");
    }
}
