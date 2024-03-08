package com.mycompany.flyrest;

/**
 *
 * @author Sarah
 */
public abstract class CityMarks {

    //attirbutes
    protected static String currency;
    protected String to; //to from main

    //abstract methods
    public abstract void suggInRyiadh();

    public abstract void suggInKuwait();

    public abstract void suggInRoma();

    public abstract void suggInParis();

    public abstract String[] ChoosenCity();

    //get&set
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public static String getCurrency() {
        return currency;
    }

    public static void setCurrency(String c) {
        currency = c;
    }

    //method
    public static void Changecurrency(String to) {
        if (to == "RUH") {
            currency = "Ryals";
        } else if (to == "KWI") {

        } else if (to == "FCO") {

        } else if (to == "CDG") {

        }
    }//End method

}//End class
