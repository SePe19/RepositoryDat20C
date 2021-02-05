package GitØvelse;

import java.util.ArrayList;


public class øvelse1 {

    ArrayList<String> names = new ArrayList<String>();

    public boolean doesArraylistContainString(ArrayList names, String navn) {

        if (names.contains(navn)) {
            System.out.println("The string has been found");
        } else {
            System.out.println("There was no person by the name of " + navn + "\nBut now " + navn + " is added to the list");
            }
        return false;
    }

    public void printProblemDescription(){
        System.out.println("Problem description: Skriv en metodemed navnet doesArraylistContainString, dermodtager 2parametrer: " +
                "enarraylisteog enstreng.Metoden returnerer en boolean:•Hvis strengen ikke findes iarraylistenindsættes strengen " +
                "i listen og metoden returnerer false•Hvis strengen findes i arraylisten returnerer metodentrue og printer " +
                "”The String has been found”");
    }

}

