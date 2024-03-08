package com.mycompany.flyrest;
/**
 *
 * @author Sarah
 */
public class Sightseeing extends CityMarks {

    //attributes
    String[] sightseeing = new String[3];

    //constructors
    public Sightseeing() {
    }

    public Sightseeing(String to) {
        super.to = to;
    }

    //methods: for store sightseeing suggestions in (sightseeing) depending on (to)
    public String[] ChoosenCity() {
        if (to == "RUH") {
            suggInRyiadh();
        } else if (to == "KWI") {
            suggInKuwait();
        } else if (to == "FCO") {
            suggInRoma();
        } else if (to == "CDG") {
            suggInParis();
        }
        return sightseeing;
    }

    public void suggInRyiadh() {
        sightseeing[0] = "The gloves";
        sightseeing[1] = "Financial Center";
        sightseeing[2] = "Riyadh Season such as: Boulevard City, Boulevard World";
    }//End method

    public void suggInKuwait() {
        sightseeing[0] = "Sheikh Jaber Al Ahmad Cultural";
        sightseeing[1] = "Al-Shaheed Park";
        sightseeing[2] = "The Avenues";
    }//End method

    public void suggInRoma() {
        sightseeing[0] = "Castel Santأ¢â‚¬â„¢Angelo";
        sightseeing[1] = "The Roman Forum";
        sightseeing[2] = "Piazza Navona";
    }//End method

    public void suggInParis() {
        sightseeing[0] = "Arc de Triomphe";
        sightseeing[1] = "Eiffel Tower (at night)";
        sightseeing[2] = "Palais Royal";
    }//End method

}//End class
