package ObjectOrientedProgramming;

public class Crossbowman extends Basehero {
    public Crossbowman(String name) {
        super("Арбалетчик " + name, 6, 3, 16, new int[]{2, 3}, 10, 4);
    }
    public Crossbowman() {
        super("Арбалетчик ", 6, 3, 16, new int[]{2, 3}, 10, 4);
    }
    @Override
    public String getName() {
        return String.format("Crossbowman %s:",super.getName());
    }
}
