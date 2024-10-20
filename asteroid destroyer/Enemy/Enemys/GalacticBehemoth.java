/*
   Esta clase representa un enemigo específico en el juego, el GalacticBehemoth.
   Extiende la clase Enemy y personaliza las estadísticas y el comportamiento de ataque del GalacticBehemoth.
*/
package src.Enemy.Enemys;
import src.Player.Player;
import src.Enemy.Enemy;

public class GalacticBehemoth extends Enemy {
    public GalacticBehemoth() {
        super("GalacticBehemoth", 100, 40, 20, "Una enorme criatura del espacio con poderosos ataques.");
    }

    @Override
    public void attack(Player player) {
        // Usar getName() si 'name' es privado en Enemy
        System.out.println(getName() + " lanza un poderoso rayo cósmico!");
        player.takeDamage(getAttackPower());  // Usar getAttackPower() si attackPower es privado
    }
}


