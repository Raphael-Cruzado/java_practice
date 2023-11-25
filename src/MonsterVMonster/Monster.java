package MonsterVMonster;

import java.util.Random;

class Monster {
    private String name;
    private int health;
    private Weapon weapon;

    // Constructor
    public Monster(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Getter for weapon name
    public String getWeaponName() {
        return weapon.getName();
    }

    // Method for monster attacking another monster
    public int attack(Monster target) {
        int damage = new Random().nextInt(weapon.getMaxDamage() + 1);
        target.takeDamage(damage);
        return damage;
    }

    // Method for taking damage
    private void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

}
