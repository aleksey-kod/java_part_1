package ObjectOrientedProgramming;

public abstract class Person {
    private int attack;
    private int def;
    private int shots;
    private int[] damage;
    private float health;
    private int speed;
    private String name;

    public Person(String name, float health) {
        this.name = name;
        this.health = health;
    }

    public Person(String name, int attack, int def, int shots, int[] damage, float health, int speed) {
        this(name, health);
        this.attack = attack;
        this.def = def;
        this.shots = shots;
        this.damage = damage;
        this.speed = speed;
    }

    public String getInfo() {
        return String.format("%s: %s Здоровье: %f: Атака: %d Защита: %d Выстрелы: %d Урон: %d-%d Скорость: %d",
                this.getClass().getSimpleName(),name, health, attack, def, shots, damage[0], damage[1], speed);
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDef() {
        return def;
    }

    public int[] getDamage() {
        return damage;
    }

    public float getHealth() {
        return health;
    }

    public int getShots() {
        return shots;
    }

    public int getSpeed() {
        return speed;
    }
}

