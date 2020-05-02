package introductionJava.lessons.lesson14.hw_22_AdventureGame;

import introductionJava.lessons.lesson14.hw_22_AdventureGame.weapon.*;

public class King extends Character {

    public King(String name, WeaponBehavior weaponBehavior) {
        super(name, weaponBehavior);
    }

    public King(String name) {
        this(name, new BowAndArrowBehavior());
    }

    public King() {
        this("King");
    }
}
