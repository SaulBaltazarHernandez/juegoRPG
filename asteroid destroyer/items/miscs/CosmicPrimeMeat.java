package src.items.miscs;

import src.Player.Player;
import src.enums.Stats;

public class CosmicPrimeMeat extends Misc {
    private int healingAmount;

    public CosmicPrimeMeat() {
        super("Cosmic Prime Meat", "Recupera 35 de salud.");  // Cambié el nombre a "Cosmic Prime Meat" para darle una temática espacial
        this.healingAmount = 35;
    }

    public void use(Player player) {
        int currentHealth = player.getStat(src.Player.Stats.HP);
        player.putStat(Stats.HP, currentHealth + healingAmount);
        System.out.println("Has usado un Cosmic Prime Meat. Salud restaurada en " + healingAmount);
    }
}

