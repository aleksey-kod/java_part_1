package ObjectOrientedProgramming;

public class Robber extends Basehero {


    public Robber(String name) {
        super("Разбойник " + name, 8, 3, 0, new int[]{2, 3, 4}, 10, 6);
    }

    public Robber() {
        super("Разбойник ", 8, 3, 0, new int[]{2, 3, 4}, 10, 6);
    }
    @Override
    public String getName() {
        return String.format("Robber %s:",super.getName());
    }

}

