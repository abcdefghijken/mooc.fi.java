
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item temp = (Item) compared;
        
        return this.name.equals(temp.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash += this.name.hashCode() * 31;
        
        return hash;
    }
}
