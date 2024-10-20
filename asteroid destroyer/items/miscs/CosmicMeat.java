package src.items.miscs;

import src.Player.Player;
import src.enums.Stats;

public class CosmicMeat extends Misc {
    private int healingAmount;

    public CosmicMeat() {
        super("Cosmic Meat", "Recupera 20 de salud.");  // Cambié el nombre a "Cosmic Meat" para darle una temática espacial
        this.healingAmount = 20;
    }

    public void use(Player player) {
        int currentHealth = player.getStat(Stats.HP);
        player.putStat(Stats.HP, currentHealth + healingAmount);
        System.out.println("Has usado una Cosmic Meat. Salud restaurada en " + healingAmount);
    }
}

