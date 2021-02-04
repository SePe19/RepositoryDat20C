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


        navneArray.doesArralistContainString(names, "Hans");

    }
}