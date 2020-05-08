package introductionJava.lesson14.hw_22_AdventureGame;

import introductionJava.lesson14.hw_22_AdventureGame.weapon.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        Collections.addAll(list, new King(), new Knight(), new Queen(), new Troll());
        for (Character character : list) {
            System.out.printf("%-8s", character.getName());
            character.fight();
        }

        //.... какая-то то там битва

        // меняем оружие тролля и королевы.. теперь королева с топором, а троль с ножем
        WeaponBehavior queenKnife = list.get(2).getWeaponBehavior();
        list.get(2).setWeaponBehavior(list.get(3).getWeaponBehavior());
        list.get(3).setWeaponBehavior(queenKnife);

        // король берет в руки мечь
        list.get(0).setWeaponBehavior(new SwordBehavior());

        System.out.println();
        for (Character character : list) {
            System.out.printf("%-8s", character.getName());
            character.fight();
        }

        //...какая-то там битва


        System.out.println();
        System.out.println("Троль помер.");
        list.get(3).setWeaponBehavior(null);
        for (Character character : list) {
            System.out.printf("%-8s", character.getName());
            character.fight();
        }



    }
}
