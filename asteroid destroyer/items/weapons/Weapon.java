package src.items.weapons;

import src.enums.ItemCategory;
import src.items.Equipment;

public abstract class Weapon extends Equipment {
    private int attackBonus;  // Cambié el nombre para reflejar el propósito correctamente

    public Weapon(String name, int attackBonus) {
        super(name, attackBonus, ItemCategory.Arma);  // Modifiqué el uso correcto del constructor de Equipment
        this.attackBonus = attackBonus;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Arma: " + getName() + " | Bono de ataque: " + attackBonus);
    }
}

