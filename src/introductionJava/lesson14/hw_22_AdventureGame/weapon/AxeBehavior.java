package introductionJava.lesson14.hw_22_AdventureGame.weapon;

public class AxeBehavior implements WeaponBehavior {
    public static final String NAME = "Топор";
    @Override
    public void useWeapon() {
        System.out.println("Топор. Удар топором -30");
    }
}
