package introductionJava.lesson14.hw_22_AdventureGame.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    public static final String NAME = "Лук";
    @Override
    public void useWeapon() {
        System.out.println("Лук. Выстрел из лука -15");
    }
}
