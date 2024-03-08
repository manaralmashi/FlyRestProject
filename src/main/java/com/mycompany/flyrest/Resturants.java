package com.mycompany.flyrest;


/**
 *
 * @author Sarah
 */
public class Resturants extends CityMarks {

    //attributes
    String[] resturants = new String[3];

    //constructors
    public Resturants() {
    }

    public Resturants(String to) {
        super.to = to;
    }

    //methods: for store resturants suggestions in (resturants) depending on (to)
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
        return resturants;
    }//End method

    public void suggInRyiadh() {
        resturants[0] = "Alsaudi resturant";
        resturants[1] = "Swalief Aldira resturant";
        resturants[2] = "Elixir Bunn Coffee roasters";
    }//End method

    public void suggInKuwait() {
        resturants[0] = "Milk bun";
        resturants[1] = "Queens restaurant";
        resturants[2] = "Cell#9";
    }//End method

    public void suggInRoma() {
        resturants[0] = "Ditirambo";
        resturants[1] = "Toscano";
        resturants[2] = "Il Tempio di Iside";
    }//End method

    public void suggInParis() {
        resturants[0] = "Loulou resturant";
        resturants[1] = "La Girafe resturant";
        resturants[2] = "Coco resturant";
    }//End method

}//End class
