package ObjectOrientedProgramming;

public class Monk extends Basehero {

    public boolean magic;

    public Monk(String name) {
        super("Монах " + name, 1, 1, 0, new int[]{1, 0}, 1, 3);
        magic = true;
    }

    public Monk() {
        super("Монах ", 1, 1, 0, new int[]{1, 0}, 1, 3);
        magic = true;
    }

    @Override
    public String getInfo() {
        return String.format("%s Магия: %b", super.getInfo(), magic);
    }
    @Override
    public String getName() {
        return String.format("Monk %s:",super.getName());
    }
}

