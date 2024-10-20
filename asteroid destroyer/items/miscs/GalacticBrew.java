package src.items.miscs;

import src.Player.Player;
import src.enums.Stats;

public class GalacticBrew extends Misc {
    private int healingAmount;

    public GalacticBrew() {
        super("Galactic Brew", "Restaura 50 puntos de salud.");  // Cambié el nombre a "Galactic Brew" para darle una temática espacial
        this.healingAmount = 50;
    }

    public void use(Player player) {
        int currentHealth = player.getStat(Stats.HP);
        player.putStat(Stats.HP, currentHealth + healingAmount);
        System.out.println("Has usado una Galactic Brew. Salud restaurada en " + healingAmount);
    }
}

