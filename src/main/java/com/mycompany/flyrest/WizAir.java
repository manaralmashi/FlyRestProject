package com.mycompany.flyrest;
/**
 *
 * @author لميس
 */

public class WizAir extends AirPlaneCompany {

    /**
     *
     */
    public WizAir() {
        CompName = "Wiz Air";
        Symbol = "W6";
        AllFlights++;
    }

    /**
     *
     */
    public void CompInfo() {
        Window w = new Window(" Wiz Company", "/Users/manaralmashi/NetBeansProjects/FlyRest/src/main/java/Wiz.jpg");
        w.setVisible(true);
    }
}
