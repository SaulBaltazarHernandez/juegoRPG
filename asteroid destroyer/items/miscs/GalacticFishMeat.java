package src.items.miscs;

import src.Player.Player;
import src.enums.*;

public class GalacticFishMeat extends Misc {
    private int healingAmount;

    public GalacticFishMeat() {
        super("Galactic Fish Meat", "Recupera 10 de salud.");  // Cambié el nombre a "Galactic Fish Meat" para darle una temática espacial
        this.healingAmount = 10;
    }

    public void use(Player player) {
        int currentHealth = player.getStat(src.enums.Stats.HP);
        player.putStat(Stats.HP, currentHealth + healingAmount);
        System.out.println("Has usado una Galactic Fish Meat. Salud restaurada en " + healingAmount);
    }
}
