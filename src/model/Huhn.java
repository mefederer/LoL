package model;

import java.util.Date;

public class Huhn extends Tier {

private int eier;

    public Huhn(String name, String futter, Date geburtsdatum, int eier) {
        super(name, futter, geburtsdatum);
        this.eier = eier;
    }

    public int getEier() {
        return eier;
    }

    public void setEier(int eier) {
        this.eier = eier;
    }

    public String makeSound(){
        return "Gack!";
    }

}