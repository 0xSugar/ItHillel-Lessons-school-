package introductionJava.lessons.lesson14.hw_22_AdventureGame;

import introductionJava.lessons.lesson14.hw_22_AdventureGame.weapon.WeaponBehavior;

public abstract class Character {
    private String name;

    private WeaponBehavior weaponBehavior;

    protected Character(String name, WeaponBehavior weaponBehavior) {
        this.name = name;
        this.weaponBehavior = weaponBehavior;
    }

    public void fight() {
        if (weaponBehavior != null) {
            weaponBehavior.useWeapon();
        }
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public String getName() {
        return name;
    }
}
