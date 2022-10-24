package ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {


    public static void main(String[] args) {
        List<Person> PersonsList = new ArrayList<>();
        for (int i = 0; i < 4; ++i) {
            Fermer ferm = new Fermer(String.valueOf(i));
            PersonsList.add(ferm);
        }
        for (int i = 0; i < 4; ++i) {
            Robber robber = new Robber(String.valueOf(i));
            PersonsList.add(robber);
        }
        for (int i = 0; i < 4; ++i) {
            Sniper sniper = new Sniper(String.valueOf(i));
            PersonsList.add(sniper);
        }
        for (int i = 0; i < 4; ++i) {
            Wizard wizard = new Wizard(String.valueOf(i));
            PersonsList.add(wizard);
        }
        for (int i = 0; i < 4; ++i) {
            Spearman spearman = new Spearman(String.valueOf(i));
            PersonsList.add(spearman);
        }
        for (int i = 0; i < 4; ++i) {
            Сrossbowman сrossbowman = new Сrossbowman(String.valueOf(i));
            PersonsList.add(сrossbowman);
        }
        for (int i = 0; i < 4; ++i) {
            Monk monk = new Monk(String.valueOf(i));
            PersonsList.add(monk);
        }

        for (Person pers : PersonsList) {
            System.out.println(pers.getInfo());
        }
    }

}
