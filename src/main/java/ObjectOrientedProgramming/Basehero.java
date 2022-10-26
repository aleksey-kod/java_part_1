package ObjectOrientedProgramming;

public abstract class Basehero implements Actions {

    private static int number = 0;
    private int attack;
    private int def;
    private int shots;
    private int[] damage;
    private float health;
    private int speed;
    private String name;

    public Basehero(String name, float health) {
        this.name = String.format("%s %d",name,++number);
        this.health = health;
    }

    public Basehero(String name, int attack, int def, int shots, int[] damage, float health, int speed) {
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

    @Override
    public String getName() {
        return String.format("Имя:'%s', Здоровье:%f",name,health);
    }
    @Override
    public void print(){
        System.out.println(getInfo());
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
    /*@Override
    public void strike(Basehero hero) {

    }

    @Override
    public void getDamaged(int damagePower) {

    }

    @Override
    public boolean changePosition() {
        return false;
    }

    @Override
    public String indicateStatus() {
        return null;
    }*/
}

