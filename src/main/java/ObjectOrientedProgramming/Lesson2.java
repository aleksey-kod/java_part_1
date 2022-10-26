package ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson2 {
    // side 0 whiteSide
    // side 1 darkSide

    public static List<Basehero> heroGenerate(int counthero, int side) {
        List<Basehero> result = new ArrayList<>();
        if (side == 0) {
            Random rnd = new Random();
            for (int i = 0; i < counthero; i++) {
                switch (rnd.nextInt(4)) {
                    case 0:
                        result.add(new Fermer());
                        break;
                    case 1:
                        result.add(new Spearman());
                        break;
                    case 2:
                        result.add(new Crossbowman());
                        break;
                    default:
                        result.add(new Monk());
                }

            }
        }
        if (side == 1) {
            Random rnd = new Random();
            for (int i = 0; i < counthero; i++) {
                switch (rnd.nextInt(4)) {
                    case 0:
                        result.add(new Fermer());
                        break;
                    case 1:
                        result.add(new Robber());
                        break;
                    case 2:
                        result.add(new Sniper());
                        break;
                    default:
                        result.add(new Wizard());
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Basehero> whiteSide = new ArrayList<>();
        List<Basehero> darkSide = new ArrayList<>();
        whiteSide = heroGenerate(5, 0);
        darkSide = heroGenerate(5, 1);
        whiteSide.forEach(n -> n.print());
        darkSide.forEach(n -> n.print());
        whiteSide.forEach(n -> System.out.println(n.getName()));
        darkSide.forEach(n -> System.out.println(n.getName()));

    }
}
