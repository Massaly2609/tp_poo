package sn.uasz.poo.exo2;

import java.time.LocalDate;

public class Scanner_Informatique extends Peripherique {
    private String format_scan;

    public Scanner_Informatique(int ref, String marque, LocalDate date_fabrication, double prix,
                                String type, String resolution, double vitesse, String format_scan) {

        super(ref, marque, date_fabrication, prix, type, resolution, vitesse);
        this.format_scan = format_scan;
    }

    public String getFormat_scan() {
        return format_scan;
    }

    public void setFormat_scan(String format_scan) {
        this.format_scan = format_scan;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Format scan: " + format_scan;
    }

}

