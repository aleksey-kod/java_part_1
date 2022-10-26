package ObjectOrientedProgramming;

public class Fermer extends Basehero {

    private boolean delivery;

    public Fermer(String name) {
        super("Крестьянин " + name, 1, 1, 0, new int[]{1,0}, 1, 3);
        delivery = true;
    }
    public Fermer() {
        super("Крестьянин", 1, 1, 0, new int[]{1,0}, 1, 3);
        delivery = true;
    }

    @Override
    public String getInfo() {
        return String.format("%s Доставка: %b", super.getInfo(), delivery);
    }
    @Override
    public String getName() {
        return String.format("Fermer %s: ",super.getName());
    }
}
