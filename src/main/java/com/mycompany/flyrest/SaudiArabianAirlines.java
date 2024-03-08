package com.mycompany.flyrest;
/**
 *
 * @author لميس
 */
public class SaudiArabianAirlines extends AirPlaneCompany {

    /**
     *
     */
    public SaudiArabianAirlines() {
        CompName = "Saudi Arabian Airlines";
        Symbol = "SV";
        AllFlights++;
    }

    /**
     *
     */
    public void CompInfo() {
        Window w = new Window(" Saudi Company", "/Users/manaralmashi/NetBeansProjects/FlyRest/src/main/java/Saudi Arabian.jpg");
        w.setVisible(true);
    }
}