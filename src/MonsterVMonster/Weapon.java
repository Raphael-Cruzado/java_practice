package MonsterVMonster;

class Weapon {
    private String name;
    private int maxDamage;

    // Default constructor
    public Weapon() {
        this.name = "Pointy Stick";
        this.maxDamage = 1;
    }

    // Overloaded constructor
    public Weapon(String name, int maxDamage) {
        this.name = name;
        this.maxDamage = maxDamage;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for maxDamage
    public int getMaxDamage() {
        return maxDamage;
    }

    // Setter for maxDamage
    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

}
