package game.ui;

import game.core.Character;
import game.core.Element;
import game.core.enums.CharacterStats;
import game.core.tools.Amulet;
import game.core.tools.Armor;
import game.core.tools.Shield;
import game.core.tools.Sword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        int option = 0;
        Element mage = new Character(CharacterStats.MAGE);
        Element warrior = new Character(CharacterStats.WARRIOR);
        Element worker = new Character(CharacterStats.WORKER);

        while (option != -1) {

            out.println("** Print options **");
            out.println();
            out.println("0. Exit");
            out.println("1. Every piece of equipment added");
            out.println("2. Full equipped character");
            out.println();
            out.print("Select an option: ");
            option = Integer.parseInt(in.readLine());
            out.println();

            switch (option){
                case 0:
                    option = -1;
                    break;
                case 1:
                    printEveryEquipmentAdded(mage);
                    printEveryEquipmentAdded(warrior);
                    printEveryEquipmentAdded(worker);
                    break;
                case 2:
                    printFullEquippedCharacter(mage);
                    printFullEquippedCharacter(warrior);
                    printFullEquippedCharacter(worker);
                    break;
                default:
                    out.println("Invalid Option");
            }

        }
    }

    private static void printEveryEquipmentAdded (Element chToEquip) {

        Sword chWithSword = new Sword(chToEquip);
        Armor chWithArmor = new Armor(chWithSword);
        Shield chWithShield = new Shield(chWithArmor);
        Amulet chWithAmulet = new Amulet(chWithShield);

        out.println(""+chWithSword.getName() + ".");
        out.println(" - Health:  " + chWithSword.getHp());
        out.println(" - Attack:  " + chWithSword.getAtk());
        out.println(" - Defense: " + chWithSword.getDef());
        out.println(" - Magic:   " + chWithSword.getMp());
        out.println();
        out.println(""+chWithArmor.getName() + ".");
        out.println(" - Health:  " + chWithArmor.getHp());
        out.println(" - Attack:  " + chWithArmor.getAtk());
        out.println(" - Defense: " + chWithArmor.getDef());
        out.println(" - Magic:   " + chWithArmor.getMp());
        out.println();
        out.println(""+chWithShield.getName() + ".");
        out.println(" - Health:  " + chWithShield.getHp());
        out.println(" - Attack:  " + chWithShield.getAtk());
        out.println(" - Defense: " + chWithShield.getDef());
        out.println(" - Magic:   " + chWithShield.getMp());
        out.println();
        out.println(""+chWithAmulet.getName() + ".");
        out.println(" - Health:  " + chWithAmulet.getHp());
        out.println(" - Attack:  " + chWithAmulet.getAtk());
        out.println(" - Defense: " + chWithAmulet.getDef());
        out.println(" - Magic:   " + chWithAmulet.getMp());
        out.println();
    }


    private static void printFullEquippedCharacter (Element chToEquip) {

        Sword chWithSword = new Sword(chToEquip);
        Armor chWithArmor = new Armor(chWithSword);
        Shield chWithShield = new Shield(chWithArmor);
        Amulet chWithAmulet = new Amulet(chWithShield);

        out.println(""+chWithAmulet.getName() + ".");
        out.println(" - Health:  " + chWithAmulet.getHp());
        out.println(" - Attack:  " + chWithAmulet.getAtk());
        out.println(" - Defense: " + chWithAmulet.getDef());
        out.println(" - Magic:   " + chWithAmulet.getMp());
        out.println();
    }
}
