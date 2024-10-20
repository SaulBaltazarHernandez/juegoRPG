package src.items;

import java.util.Map;
import src.enums.ItemCategory;
import src.enums.Slot;
import src.enums.Stats;

public abstract class Equipment extends Item {
    private Slot slot;
    private Map<Stats, Integer> stats;

    // Constructor que inicializa con un slot y un mapa de estadísticas
    public Equipment(Slot slot, Map<Stats, Integer> stats) {
        super();  // Llamada al constructor de Item
        this.slot = slot;
        this.stats = stats;
    }

    // Constructor que inicializa nombre, un valor entero y categoría de ítem
    public Equipment(String name, int value, ItemCategory itemCategory) {
        super();  // Llamada al constructor de Item
        this.name = name;  // Asignamos el nombre pasado por parámetro
        this.itemCategory = itemCategory;  // Asignamos la categoría de ítem
        // Aquí podrías añadir la lógica para el valor entero 'value' si se requiere
    }

    // Getter para obtener el slot del equipo
    public Slot getSlot() {
        return slot;
    }

    // Getter para obtener las estadísticas del equipo
    public Map<Stats, Integer> getStats() {
        return stats;
    }

    // Método para obtener el valor de una estadística específica
    public int getStatValue(Stats stat) {
        return stats.getOrDefault(stat, 0);  // Devuelve 0 si no encuentra la estadística
    }

    // Método para establecer el valor de una estadística específica
    public void setStatValue(Stats stat, int value) {
        stats.put(stat, value);
    }

    public abstract void displayItemInfo();
}
