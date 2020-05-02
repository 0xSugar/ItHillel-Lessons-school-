package introductionJava.lessons.lesson14.hw_22_AdventureGame;

import introductionJava.lessons.lesson14.hw_22_AdventureGame.weapon.*;

public class Troll extends Character {

    public Troll(String name, WeaponBehavior weaponBehavior) {
        super(name, weaponBehavior);
    }

    public Troll(String name) {
        this(name, new AxeBehavior());
    }

    public Troll() {
        this("Troll");
    }
}
