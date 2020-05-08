package introductionJava.lesson14.hw_22_AdventureGame;

import introductionJava.lesson14.hw_22_AdventureGame.weapon.*;

public class Knight extends Character {
    public Knight(String name, WeaponBehavior weaponBehavior) {
        super(name, weaponBehavior);
    }

    public Knight(String name) {
        this(name, new SwordBehavior());
    }

    public Knight() {
        this("Knight");
    }
}
