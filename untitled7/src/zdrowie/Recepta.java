package zdrowie;

import java.util.Date;
import java.util.List;
import java.util.zip.DataFormatException;

public class Recepta {
    private static int dataWaznosc = 90;
    private Date dataWydania;
    private List<Lek> listaLekow;
    private double cena;

    public boolean checkWaznosc(){
        return true;
    }

    public static int getDataWaznosc() {
        return dataWaznosc;
    }

    public static void setDataWaznosc(int dataWaznosc) {
        Recepta.dataWaznosc = dataWaznosc;
    }

    public Date getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(Date dataWydania) {
        this.dataWydania = dataWydania;
    }

    public List<Lek> getListaLekow() {
        return listaLekow;
    }

    public void setListaLekow(List<Lek> listaLekow) {
        this.listaLekow = listaLekow;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
