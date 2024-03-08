package com.mycompany.flyrest;

/**
 *
 * @author لميس
 */
public class Flynas extends AirPlaneCompany {

    /**
     *
     */
    public Flynas() {
        CompName = "Flynas";
        Symbol = "XY";
        AllFlights++;
    }

    /**
     *
     */
    public void CompInfo() {
        Window w = new Window(" Flynas Company", "/Users/manaralmashi/NetBeansProjects/FlyRest/src/main/java/Flynas.jpg");
        w.setVisible(true);
    }

}
