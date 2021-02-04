package exercise;

import java.util.ArrayList;

public class Bibliotek {
    private static ArrayList<Bog> bibliotek = new ArrayList<>();

    public static void main(String[] args) {
        Bog paranoia = new Bog("1234567891011","Paranoia",1999);
        Bog peterPedal = new Bog("1234567891091","Peter Pedal",1992);
        Bog pippiLangstrømpe = new Bog("1234567491411","Pippi på eventyr",1962);
        bibliotek.add(paranoia);
        bibliotek.add(peterPedal);
        bibliotek.add(pippiLangstrømpe);
        objektISBN(paranoia);
        objektISBN(peterPedal);
        objektISBN(pippiLangstrømpe);
    }

    public static boolean objektISBN(Bog bog){
        Bog bog1 = new Bog("1234567891011","John Dillermand",2021);
        if(bog1.getiSBNNummer().equals(bibliotek.get(bibliotek.indexOf(objektISBN(bog))).getiSBNNummer())){
            return true;
        }
        else {
            return false;
        }
    }
}
