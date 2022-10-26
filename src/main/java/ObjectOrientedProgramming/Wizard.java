package ObjectOrientedProgramming;

public class Wizard extends Basehero {
    private boolean magic;

    public Wizard(String name) {
        super("Колдун " + name, 17, 12, 0, new int[]{-5, 0}, 30, 9);
        magic = true;
    }

    public Wizard() {
        super("Колдун ", 17, 12, 0, new int[]{-5, 0}, 30, 9);
        magic = true;
    }

    @Override
    public String getInfo() {
        return String.format("%s Магия: %b", super.getInfo(), magic);
    }
    @Override
    public String getName() {
        return String.format("Wizard %s:",super.getName());
    }

}