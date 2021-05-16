package zdrowie;

import java.util.Date;

public class Badanie {
    private Date data;
    private String opis;
    private String rodzajBadan;
    private Osoba lekarz;
    private String miejsceBadania;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getRodzajBadan() {
        return rodzajBadan;
    }

    public void setRodzajBadan(String rodzajBadan) {
        this.rodzajBadan = rodzajBadan;
    }

    public Osoba getLekarz() {
        return lekarz;
    }

    public void setLekarz(Osoba lekarz) {
        this.lekarz = lekarz;
    }

    public String getMiejsceBadania() {
        return miejsceBadania;
    }

    public void setMiejsceBadania(String miejsceBadania) {
        this.miejsceBadania = miejsceBadania;
    }

}

