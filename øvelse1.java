package GitØvelse;

import java.util.ArrayList;

public class øvelse1 {

    ArrayList<String> names = new ArrayList<String>();

    public boolean doesArralistContainString(ArrayList names, String navn) {

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(navn)) {
                System.out.println("The string has been found");
                return true;
            } else {
                names.add(navn);
            }
        }
        return false;
    }
}

