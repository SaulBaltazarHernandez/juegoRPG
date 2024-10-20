package src.items;

import src.enums.ItemCategory;;

public abstract class Item {
    protected String name;
    protected String description;
    protected ItemCategory itemCategory;

    // Constructor vacío, por si deseas inicializar después
    public Item() {
        this.name = "";
        this.description = "";
        ItemCategory ItemCategory = null;
        this.itemCategory = ItemCategory; // Agrega un valor por defecto si corresponde
    }

    // Constructor que inicializa con una categoría de ítem
    public Item(ItemCategory itemCategory) {
        this.name = ""; // Asigna valores predeterminados
        this.description = "";
        this.itemCategory = itemCategory;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ItemCategory getItemType() {
        return itemCategory;
    }
}

