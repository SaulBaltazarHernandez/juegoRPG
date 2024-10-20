/*
   Esta clase representa un enemigo específico en el juego, el CosmicHerbivore.
   Extiende la clase Enemy y personaliza las estadísticas y el comportamiento de ataque del CosmicHerbivore.
*/

package src.Enemy.Enemys;
import src.Player.Player;
import src.Enemy.Enemy;

public class CosmicHerbivore extends Enemy {
    public CosmicHerbivore() {
        super("CosmicHerbivore", 80, 30, 10, "Un gigantesco ser del espacio con garras cósmicas.");
    }

    @Override
    public void attack(Player player) {
        // Usar el método getName() para obtener el nombre del enemigo
        System.out.println(getName() + " ataca con sus enormes garras cósmicas!");
        player.takeDamage(getAttackPower());  // Usar getAttackPower() para obtener el poder de ataque
    }
}


