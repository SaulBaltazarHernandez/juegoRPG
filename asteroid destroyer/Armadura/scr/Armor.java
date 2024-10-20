package src.Armadura.scr;

public class Armor {
    private String identifier;
    private int protectionValue;
    private ArmorType category;
    private int condition;

    public Armor(String identifier, int protectionValue, ArmorType category, int condition) {
        this.identifier = identifier;
        this.protectionValue = protectionValue;
        this.category = category;
        this.condition = condition;
    }

    // Getters
    public String getIdentifier() {
        return identifier;
    }

    public int getProtectionValue() {
        return protectionValue;
    }

    public ArmorType getCategory() {
        return category;
    }

    public int getCondition() {
        return condition;
    }

    // Setters
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setProtectionValue(int protectionValue) {
        this.protectionValue = protectionValue;
    }

    public void setCategory(ArmorType category) {
        this.category = category;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    // Reduce la condición de la armadura al recibir daño
    public void sustainDamage(int damage) {
        this.condition -= damage;
        if (this.condition < 0) {
            this.condition = 0;
        }
    }

    // Método para restaurar la condición de la armadura
    public void restore(int amount) {
        this.condition += amount;
        // Aquí podrías agregar un límite máximo de condición si es necesario.
    }

    @Override
    public String toString() {
        return "Armor{" +
                "identifier='" + identifier + '\'' +
                ", protectionValue=" + protectionValue +
                ", category=" + category +
                ", condition=" + condition +
                '}';
    }
}
