package src.Armadura.scr;

import src.Armadura.scr.Armor;

public class Main {
    public static void main(String[] args) {
        Armor helmet = new Armor("Iron Helmet", 5, ArmorType.HELMET, 100);
        Armor chestplate = new Armor("Steel Chestplate", 15, ArmorType.CHESTPLATE, 200);

        System.out.println(helmet);
        System.out.println(chestplate);

        // Simula que el casco recibe 20 de daño
        helmet.sustainDamage(20);
        System.out.println("After taking damage: " + helmet);

        // Repara el casco
        helmet.restore(10);
        System.out.println("After repairing: " + helmet);
    }
}
