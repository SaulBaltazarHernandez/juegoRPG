package src;
import src.Enemy.Enemys.Astrodevourer;
import src.Enemy.Enemys.CelestialPredator;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import src.Enemy.Enemy;
import src.Game.GameLauncher;
import src.Player.Player;

public class Main {
    public static void main(String[] args) {
        // Crear un jugador
        String playerName = JOptionPane.showInputDialog("Introduce el nombre del jugador:");
        if (playerName == null || playerName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre no válido. El juego se cerrará.");
            System.exit(0);
        }

        Player player = new Player(playerName, 100, 30, 50); // Nombre, salud, poder de ataque

        // Crear una lista de enemigos
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(new Astrodevourer());      // Instancia de la subclase Astrodevourer
        enemies.add(new CelestialPredator());   // Instancia de la subclase CelestialPredator
        // Agrega otros enemigos según sea necesario

        // Inicializar el juego
        GameLauncher game = new GameLauncher(player);

        // Iniciar el juego
        game.startGame();
    }
}
