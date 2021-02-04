package exercise;

public class Bog {
    public String getiSBNNummer() {
        return iSBNNummer;
    }

    public void setiSBNNummer(String iSBNNummer) {
        this.iSBNNummer = iSBNNummer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUdgivelsesaar() {
        return udgivelsesaar;
    }

    public void setUdgivelsesaar(int udgivelsesaar) {
        this.udgivelsesaar = udgivelsesaar;
    }

    private String iSBNNummer;
    private String titel;
    private int udgivelsesaar;


    public Bog(String iSBNNummer, String titel, int udgivelsesaar) {
        this.iSBNNummer = iSBNNummer;
        this.titel = titel;
        this.udgivelsesaar = udgivelsesaar;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "iSBNNummer='" + iSBNNummer + '\'' +
                ", titel='" + titel + '\'' +
                ", udgivelsesaar=" + udgivelsesaar +
                '}';
    }
}
