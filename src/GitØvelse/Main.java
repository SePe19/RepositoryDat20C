package GitØvelse;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        øvelse1 navneArray = new øvelse1();
        ArrayList<String> names = new ArrayList<String>();

        names.add("Henning");
        names.add("Sebber");
        names.add("Simon");
        names.add("Jose");
        names.add("Hamzah");
        names.add("Prutskid");

        navneArray.printProblemDescription();
        navneArray.doesArraylistContainString(names, "Mette");
        navneArray.doesArraylistContainString(names, "Mette");

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));

        }
    }
}