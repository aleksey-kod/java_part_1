package ObjectOrientedProgramming;

public class Sniper extends Basehero {
    public Sniper(String name) {
        super("Снайпер " + name, 12, 10, 32, new int[]{8, 10}, 15, 9);
    }
    public Sniper() {
        super("Снайпер ", 12, 10, 32, new int[]{8, 10}, 15, 9);
    }
    @Override
    public String getName() {
        return String.format("Sniper %s:",super.getName());
    }

}