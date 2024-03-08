package com.mycompany.flyrest;

public class Hotels extends CityMarks {

    //attributes
    String[] hotels = new String[3];

    //constructors
    public Hotels() {
    }

    public Hotels(String to) {
        super.to = to;
    }

    //methods: for store hotels suggestions in (hotels) depending on (to)
    public String[] ChoosenCity() {
//        if (to == "RUH") {
//            suggInRyiadh();
//        } else if (to == "KUW") {
//            suggInKuwait();
//        } else if (to == "FCO") {
//            suggInRoma();
//        } else if (to == "CDG") {
//            suggInParis();
//        }
        if (to == "RUH") {
            suggInRyiadh();
        } else if (to == "KWI") {
            suggInKuwait();
        } else if (to == "FCO") {
            suggInRoma();
        } else if (to == "CDG") {
            suggInParis();
        }
        return hotels;
    }

    public void suggInRyiadh() {
        hotels[0] = "Centro Waha";
        hotels[1] = "Hilton";
        hotels[2] = "Marriott";
    }//End method

    public void suggInKuwait() {
        hotels[0] = "Marina Royal";
        hotels[1] = "Hilton Garden Inn";
        hotels[2] = "Four Seasons";
    }//End method

    public void suggInRoma() {
        hotels[0] = "Savoy Roma";
        hotels[1] = "Cilicia";
        hotels[2] = "Hotel Colosseum";
    }//End method

    public void suggInParis() {
        hotels[0] = "Le metropolitan";
        hotels[1] = "Magda Champs Elysees";
        hotels[2] = "Chalgrin Boutique";
    }//End method

}//End class
