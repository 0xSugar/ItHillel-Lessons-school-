package introductionJava.lesson14.hw_22_AdventureGame;

import introductionJava.lesson14.hw_22_AdventureGame.weapon.*;

public class Queen extends Character {

    public Queen(String name, WeaponBehavior weaponBehavior) {
        super(name, weaponBehavior);
    }

    public Queen(String name) {
        this(name, new KnifeBehavior());
    }

    public Queen() {
        this("Queen");
    }
}
