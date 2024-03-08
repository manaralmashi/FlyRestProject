package com.mycompany.flyrest;

/**
 *
 * @author لميس
 */
public class flyadeal extends AirPlaneCompany {

    /**
     *
     */
    public flyadeal() {
        CompName = "flyadeal";
        Symbol = "F3";
        AllFlights++;
    }

    /**
     *
     */
    public void CompInfo() {
//         System.out.println("                                                        -FLYADEAL-\n");
//         System.out.println("         ABOUT FLYADEAL:");
//         System.out.println("         __________________________________________");
//         System.out.println("        |                    |                     |");
//         System.out.println("        |     IATA  code     |        F3           |");
//         System.out.println("        |____________________|_____________________|");
//         System.out.println("        |                    |                     |");
//         System.out.println("        |     ICAO  code     |        FAD          |");
//         System.out.println("        |____________________|_____________________|");
//         System.out.println("        |                    |                     |");
//         System.out.println("        |      flyadeal      |    Jeddah,Saudi     |");
//         System.out.println("        |    headquarters    |       Arabia        |");
//         System.out.println("        |____________________|_____________________|");
//         System.out.println("        |                    |                     |");
//         System.out.println("        |  main operational  |   King Abdulaziz    |");
//         System.out.println("        |      airport       |International Airport|");
//         System.out.println("        |____________________|_____________________|");
//         System.out.println("        |                    |                     |");
//         System.out.println("        |     number of      |         12          |");
//         System.out.println("        |destinations coverd |                     |");
//         System.out.println("        |____________________|_____________________|");
//         System.out.println("        |                    |                     |");
//         System.out.println("        |    Most popular    |      JED, RUH       |");
//         System.out.println("        |    destinations    |      DMM, AHB       |");
//         System.out.println("        |____________________|_____________________|");
//         System.out.println("        |                    |                     |");
//         System.out.println("        |    Most popular    |RUH - JED, JED - RUH |");
//         System.out.println("        |       routes       |DMM - JED, AHB - RUH |");
//         System.out.println("        |____________________|_____________________|");
//         System.out.println("        |                    |                     |");
//         System.out.println("        |      Year of       |        2016         |");
//         System.out.println("        |    establishment   |                     |");
//         System.out.println("        |____________________|_____________________|");
//         System.out.println("        |                    |                     |");
//         System.out.println("        |   Parent company   |       Saudia        |");
//         System.out.println("        |____________________|_____________________|");
//         System.out.println("        |                    |                     |");
//         System.out.println("        |   Popular fleet    |  Airbus A320-200    |");
//         System.out.println("        |                    |  Airbus A320neo     |");
//         System.out.println("        |____________________|_____________________|");
//         System.out.println("\nSaudi Arabiaâ€™s low-cost airline, flyadeal, is the Kingdomâ€™s third-largest carrier.\nIt is Saudi Arabian Airlinesâ€™ sister company that was originally \nestablished to meet the rising demand for affordable air travel. \n");
//         System.out.println("\n");
//         System.out.println("        ------------------------------------------------------");
//         System.out.println("                          Historical Highlights ".toUpperCase());
//         System.out.println("        ------------------------------------------------------");
//         System.out.println("        - Flyadeal airlines' first flight was on the 23rd of September 2017, which is the Kingdomâ€™s National Day. ");
//         System.out.println("        - A total of 12 million passengers have traveled with flyadeal since its establishment \n");
//         System.out.println("        ------------------------------------------------------");
//         System.out.println("                             Flyadeal Fleet ".toUpperCase());
//         System.out.println("        ------------------------------------------------------");
//         System.out.println("        fly adeal fleet of 15 Airbus A320 and A320neo aircraft guarantees a comfortable trip for all passengers..\n");
//         System.out.println("        - Each A320 has a total of 186 seats available for booking.");
//         System.out.println("        - The A320 Family, the world's best-selling single-aisle aircraft, was invented in 1988. ");
//         System.out.println("        - Over the years, the A320 has clocked up more than 103 million flights\n        and transported more than 11.5 billion passengers worldwide. \n");
//         System.out.println("        ------------------------------------------------------");
//         System.out.println("        Flyadeal Recent Awards & Recognition ".toUpperCase());
//         System.out.println("        ------------------------------------------------------");
//         System.out.println("\n");
//         System.out.println("         ____________________________________________________________________________");
//         System.out.println("        |                    |                                                       |");
//         System.out.println("        |     Year Award     |                     Award Type                        |");
//         System.out.println("        |____________________|_______________________________________________________|");
//         System.out.println("        |                    |                                                       |");
//         System.out.println("        |        2021        | Middle East Technology Excellence Awards 2021         |");
//         System.out.println("        |____________________|_______________________________________________________|");
//         System.out.println("        |                    |                                                       |");
//         System.out.println("        |        2021        |    Flyadeal ranked the 10th as the Best Airline       |");
//         System.out.println("        |                    |        Staff in the Middle East by Skytrax            |");
//         System.out.println("        |____________________|_______________________________________________________|");
//         System.out.println("        |                    |                                                       |");
//         System.out.println("        |        2019        | Flyadeal circumnavigated the globe 599 times          |");
//         System.out.println("        |____________________|_______________________________________________________|");
//         System.out.println("        |                    |                                                       |");
//         System.out.println("        |        2018        |      (CAPA) Asia Pacific Air Transport Excellence     |");
//         System.out.println("        |                    |           Award for Best Emerging Airline             |");
//         System.out.println("        |____________________|_______________________________________________________|");
//         System.out.println("\n");
//         System.out.println("\n");
//         System.out.println("        ------------------------------------------------------");
//         System.out.println("        Flyadeal services for Economy Class and Business Class");
//         System.out.println("        ------------------------------------------------------");
//         System.out.println("\n");
//         System.out.println("         Economy Class:                                   Business Class");
//         System.out.println("         ________________________________________         ________________________________________");
//         System.out.println("        |                                        |       |                                        |");
//         System.out.println("        | Comfortable seats                      |       | Spacious seats                         |");
//         System.out.println("        |________________________________________|       |________________________________________|");
//         System.out.println("        |                                        |       |                                        |");
//         System.out.println("        | Seat selection with price variations   |       | Premium rows with extra legroom        |");
//         System.out.println("        |________________________________________|       |________________________________________|");
//         System.out.println("        |                                        |       |                                        |");
//         System.out.println("        | Access to USB charging                 |       | Access to USB charging                 |");
//         System.out.println("        |________________________________________|       |________________________________________|");
//         System.out.println("        |                                        |       |                                        |");
//         System.out.println("        | Mobile/ tablet holder                  |       | Seat selection with price variations   |");
//         System.out.println("        |________________________________________|       |________________________________________|");
//         System.out.println("        |                                        |       |                                        |");
//         System.out.println("        | Mobile/ tablet holder                  |       | Mobile/ tablet holder                  |");
//         System.out.println("        |________________________________________|       |________________________________________|");
//         System.out.println("        |                                        |       |                                        |");
//         System.out.println("        |1carry-on bag(maximum 7kg&55x35x20 cm)  |       | Ladies only seating                    |");
//         System.out.println("        |________________________________________|       |________________________________________|");
//         System.out.println("        |                                        |       |                                        |");
//         System.out.println("        | Pre-order meals                        |       | Pre-order meals                        |");
//         System.out.println("        |________________________________________|       |________________________________________|");
//         System.out.println("                                                         |                                        |");
//         System.out.println("                                                         |1 carry-on bag(maximum 7kg&55x35x20 cm) |");
//         System.out.println("                                                         |________________________________________|");
//         System.out.println("                                                         |                                        |");
//         System.out.println("                                                         |1 checked bag (maximum 25kg & 75x35x50) |");
//         System.out.println("                                                         |________________________________________|");
        Window w = new Window(" Flyadeal Company", "/Users/manaralmashi/NetBeansProjects/FlyRest/src/main/java/Flyadeal.jpg");
        w.setVisible(true);

    }
}
