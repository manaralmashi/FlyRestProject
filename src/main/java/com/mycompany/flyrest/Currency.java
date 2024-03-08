package com.mycompany.flyrest;
/**
 *
 * @author Sarah
 */
public class Currency {

    //attributes
    private static String currency;

    //methods: for store the currency in (currency) depending on (to)
    public String ChoosenCity(String to) {
        if (to == "RUH") {
            suggInRyiadh();
        } else if (to == "KWI") {
            suggInKuwait();
        } else if (to == "FCO") {
            suggInRoma();
        } else if (to == "CDG") {
            suggInParis();
        }
        return currency;
    }

    //methods
    public void suggInRyiadh() {
        currency = "Riyal(SAR)= 0.27$";
    }//End method

    public void suggInKuwait() {
        currency = "Dinar(KWD)= 3.28$";
    }//End method

    public void suggInRoma() {
        currency = "Lira= 1.08$";
    }//End method

    public void suggInParis() {
        currency = "Franc(FF)= 1.08$";
    }//End method    

}//End class
