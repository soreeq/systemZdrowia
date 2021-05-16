package zdrowie;

import java.util.Date;

public class Skierowanie {
    private Date dataWaznosci;
    private Osoba lekarzZlecajacy;
    private String nazwaBadania;
    private Status statusSkierowania;

    public Date getDataWaznosci() {
        return dataWaznosci;
    }

    public void setDataWaznosci(Date dataWaznosci) {
        this.dataWaznosci = dataWaznosci;
    }

    public Osoba getLekarzZlecajacy() {
        return lekarzZlecajacy;
    }

    public void setLekarzZlecajacy(Osoba lekarzZlecajacy) {
        this.lekarzZlecajacy = lekarzZlecajacy;
    }

    public String getNazwaBadania() {
        return nazwaBadania;
    }

    public void setNazwaBadania(String nazwaBadania) {
        this.nazwaBadania = nazwaBadania;
    }

    public Status getStatusSkierowania() {
        return statusSkierowania;
    }

    public void setStatusSkierowania(Status statusSkierowania) {
        this.statusSkierowania = statusSkierowania;
    }
}
