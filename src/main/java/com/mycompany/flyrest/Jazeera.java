package com.mycompany.flyrest;
/**
 *
 * @author لميس
 */
public class Jazeera extends AirPlaneCompany {

    /**
     *
     */
    public Jazeera() {
        CompName = "Jazeera";
        Symbol = "J9";
        AllFlights++;
    }

    /**
     *
     */
    public void CompInfo() {
        Window w = new Window(" Jazeera Company", "/Users/manaralmashi/NetBeansProjects/FlyRest/src/main/java/Jazera.jpg");
        w.setVisible(true);
    }
}
