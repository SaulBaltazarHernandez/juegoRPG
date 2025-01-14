package src.inventory;

import src.items.Item;
import src.items.armaduras.Armor;
import src.items.miscs.Misc;

import java.util.ArrayList;

class Inventory {

    private ArrayList<Item> items;
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (items.size() < capacity) {
            items.add(item);
        } else {
            System.out.println("El inventario está lleno");
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public int getItemCount() {
        return items.size(); // Ahora devuelve el número de ítems
    }

    public boolean isFull() {
        return items.size() == capacity;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }

    public void increaseCapacity(int amount) {
        capacity += amount;
        items.ensureCapacity(capacity);
    }

    public ArrayList<Armor> getArmors() {
        ArrayList<Armor> armors = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Armor) {
                armors.add((Armor) item);
            }
        }
        return armors;
    }

    public ArrayList<Misc> getMiscs() {
        ArrayList<Misc> miscs = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Misc) {
                miscs.add((Misc) item);
            }
        }
        return miscs;
    }
}

