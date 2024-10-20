/*
   Esta clase representa un enemigo específico en el juego, el Nebulon.
   Extiende la clase Enemy y personaliza las estadísticas y el comportamiento de ataque del Nebulon.
*/
package src.Enemy.Enemys;
import src.Player.Player;
import src.Enemy.Enemy;

public class Nebulon extends Enemy {
    public Nebulon() {
        super("Nebulon", 50, 20, 5, "Una criatura rápida y mortal con tentáculos de energía."); // Defensa ligera
    }

    @Override
    public void attack(Player player) {
        System.out.println(getName() + " ataca con energía cósmica!");
        player.takeDamage(getAttackPower()); // Usar getAttackPower() si attackPower es privado
    }
}


