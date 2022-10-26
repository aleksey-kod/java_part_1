package ObjectOrientedProgramming;

public class Spearman extends Basehero {
    public Spearman(String name) {
        super("Копейщик " + name, 4, 5, 0, new int[]{1, 3}, 10, 4);
    }
    public Spearman() {
        super("Копейщик ", 4, 5, 0, new int[]{1, 3}, 10, 4);
    }
    @Override
    public String getName() {
        return String.format("Spearman %s:",super.getName());
    }
}
