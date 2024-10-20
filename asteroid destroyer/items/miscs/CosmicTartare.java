package src.items.miscs;

import src.Player.Player;

public class CosmicTartare extends Misc {
    private int attackBoost;
    private int defenseBoost;
    private int duration;

    public CosmicTartare() {
        super("Cosmic Tartare", "Aumenta el ataque y la defensa por 3 turnos.");  // Cambié el nombre a "Cosmic Tartare" para darle una temática espacial
        this.attackBoost = 10;
        this.defenseBoost = 5;
        this.duration = 3;
    }

    public void use(Player player) {
        System.out.println("Has consumido Cosmic Tartare. Ataque aumentado en " + attackBoost +
                " y defensa aumentada en " + defenseBoost + " por " + duration + " turnos.");
        // Aquí aplicaríamos lógica para aumentar temporalmente ataque y defensa
        // Puede implicar un seguimiento de turnos y reducción de los efectos al expirar
    }
}

