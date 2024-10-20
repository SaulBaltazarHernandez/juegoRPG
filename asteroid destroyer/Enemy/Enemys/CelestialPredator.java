/*
   Esta clase representa un enemigo específico en el juego, el CelestialPredator.
   Extiende la clase Enemy y personaliza las estadísticas y el comportamiento de ataque del CelestialPredator.
*/
package src.Enemy.Enemys;
import src.Player.Player;
import src.Enemy.Enemy;

public class CelestialPredator extends Enemy {
    public CelestialPredator() {
        super("CelestialPredator", 110, 50, 15, "Una criatura del espacio, rápida y mortal con mandíbulas poderosas.");
    }

    @Override
    public void attack(Player player) {
        // Usar getName() si 'name' es privado en Enemy
        System.out.println(getName() + " ataca con su inmensa mandíbula cósmica!");
        player.takeDamage(getAttackPower());  // Usar getAttackPower() si attackPower es privado
    }
}
