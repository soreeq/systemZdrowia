package zdrowie;

public enum Status {
    NIEZREALIZOWANA(false),
    ZREALIZOWANA(true),
    ZAREZERWOWANA(true);


    boolean doRezerwacji;

    private Status(boolean czyZarezerwowany){
        doRezerwacji = doRezerwacji;

    }
}
