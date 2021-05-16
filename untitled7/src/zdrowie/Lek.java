package zdrowie;

public class Lek {
    private String nazwa;
    private double cena;
    private boolean czyNaRecepte;
    private String producent;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public boolean isCzyNaRecepte() {
        return czyNaRecepte;
    }

    public void setCzyNaRecepte(boolean czyNaRecepte) {
        this.czyNaRecepte = czyNaRecepte;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }
}
