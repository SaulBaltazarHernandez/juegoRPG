/*
   Esta clase representa un enemigo específico en el juego, el Astrodevourer.
   Extiende la clase Enemy y personaliza las estadísticas y el comportamiento de ataque del Astrodevourer.
*/
package src.Enemy.Enemys;
import src.Player.Player;
import src.Enemy.Enemy;

public class Astrodevourer extends Enemy {
    public Astrodevourer() {
        super("Astrodevourer", 150, 50, 25, "Una criatura espacial voraz que absorbe energía cósmica.");
    }

    @Override
    public void attack(Player player) {
        // Usar getName() si 'name' es privado en Enemy
        System.out.println(getName() + " te ataca con un rayo cósmico!");
        player.takeDamage(getAttackPower());  // Usar getAttackPower() si attackPower es privado
    }
}
