package com.mycompany.flyrest;

/**
* @author Lamis Mohammed 
*  ID: 443007788 
* @description :
* This class will interact with other classes, it will declare and create an object from other classes and use the concept of polymorphism, 
* other classes can create an object of this class, to easily access other classes from which an object has been taken, within its body
*  
*/

public class AirPlane {
    // Attributes
    /**
     * FlightDirectionNum
     * @description to take the number of flight Direction entered by the user
     */
    private int FlightDirectionNum;
    /**
     * ChoosenCompany
     * @description to take the number of the Company Choosen by the user
     */
    private int ChoosenCompany;
    /**
     * @@link To link all airline classes together here in this class
     */
    AirPlaneCompany Company;
    /**
     * Company
     * @description need it to print the card neatly for the first time
     */
    private String s = "    SAUDI ARABIAN AIRLINES    ";
    private String F = "            FLYNAS            ";
    private String f = "           Flyadeal           ";
    private String J = "           JAZEERA            ";
    private String W = "           WIZZ AIR           ";
    /**
     * NoOFfly
     * @description need it to set and return the flight number
     */
    private String NoOFfly;
    

    /**
     * AirPlane
     * @description Constructors
     */

    public AirPlane() {

    }
    

    /**
     * PrintCards
     * @param FlightDirectionNum
     * @description take the Direction number entered by the user to print the cards with airlines available for this flight 
     */

    public void PrintCards(int FlightDirectionNum) {
        this.FlightDirectionNum = FlightDirectionNum;
        if (FlightDirectionNum == 1) {
            CardForm1(s, F, f, "SV", "XY", "F3", "Depends", 249.0, 259.0);
            System.out.println("* Depends: Prices are based on flights to the company ");

        } else if (FlightDirectionNum == 2) {
            CardForm1(s, F, J, "SV", "XY", "J9", "Depends", 249.0, 403.0);
            System.out.println("* Depends: Prices are based on flights to the company ");
        } else if (FlightDirectionNum == 3) {
            Compaform4(s, "SV", 4083.0);
        } else if (FlightDirectionNum == 4) {
            Compaform4(s, "SV", 3624.0);
        } else if (FlightDirectionNum == 5) {
            CardForm2(s, W, "SV", "W6", 4347.0, "288.98");
        } else if (FlightDirectionNum == 6) {
            CardForm2(s, W, "SV", "W6", 2187.0, "Depends");
            System.out.println("* Depends: Prices are based on flights to the company ");
        }
    }

    /**
     * ChoosenCompany 
     * @param ChoosenCompany
     * @description to get the number of company choosen So that the object is formed according to the user’s choice of the company in each class
     */
    public void ChoosenCompany(int ChoosenCompany) {
        this.ChoosenCompany = ChoosenCompany;
        if (FlightDirectionNum == 1) {
            if (ChoosenCompany == 1) {
                Company = new SaudiArabianAirlines();
                Company.setCompName("Saudi Arabian Airlines");
                Company.setSymbol("SV");
            } else if (ChoosenCompany == 2) {
                Company = new Flynas();
                Company.setCompName("Flynas");
                Company.setSymbol("XY-");

            } else if (ChoosenCompany == 3) {
                Company = new flyadeal();
                Company.setCompName("Flyadeal");
                Company.setSymbol("F3-");
            }
        } else if (FlightDirectionNum == 2) {
            if (ChoosenCompany == 1) {
                Company = new SaudiArabianAirlines();
                Company.setCompName("Saudi Arabian Airlines");
                Company.setSymbol("SV");

            } else if (ChoosenCompany == 2) {
                Company = new Flynas();
                Company.setCompName("Flynas");
                Company.setSymbol("XY-");

            } else if (ChoosenCompany == 3) {
                Company = new Jazeera();
                Company.setCompName("Jazeera");
                Company.setSymbol("J9-");

            }

        } else if (FlightDirectionNum == 3) {
            if (ChoosenCompany == 1) {
                Company = new SaudiArabianAirlines();
                Company.setCompName("Saudi Arabian Airlines");
                Company.setSymbol("SV");

            }

        } else if (FlightDirectionNum == 4) {
            if (ChoosenCompany == 1) {
                Company = new SaudiArabianAirlines();
                Company.setCompName("Saudi Arabian Airlines");
                Company.setSymbol("SV");
            }

        } else if (FlightDirectionNum == 5) {
            if (ChoosenCompany == 1) {
                Company = new SaudiArabianAirlines();
                Company.setCompName("Saudi Arabian Airlines");
                Company.setSymbol("SV");

            } else if (ChoosenCompany == 2) {
                Company = new WizAir();
                Company.setCompName("Wizz Air");
                Company.setSymbol("W6");
            }
        } else if (FlightDirectionNum == 6) {
            if (ChoosenCompany == 1) {
                Company = new SaudiArabianAirlines();
                Company.setCompName("Saudi Arabian Airlines");
                Company.setSymbol("SV");

            } else if (ChoosenCompany == 2) {
                Company = new WizAir();
                Company.setCompName("Wizz Air");
                Company.setSymbol("W6");

            }

        }

    }

    /**
     * ListOftrips 
     * @param n for the fight number
     * @param Period1 for the time to go
     * @param Period2 for the arrival time
     * @description to print to the user the flight information she/ he entered
     */
    public void ListOftrips(String n, String Period1, String Period2) {
        NoOFfly = Company.getSymbol() + n;
        if (FlightDirectionNum == 1) {
            if (ChoosenCompany == 1) {
                double price = 0;
                if (n == "510") {
                    price = 937.0;
                } else if (n == "514") {
                    price = 505.0;
                } else {
                    price = 505.0;
                }
                cardForm3(s, NoOFfly, Period1, Period2, price);
            } else if (ChoosenCompany == 2) {
                cardForm3(F, NoOFfly, Period1, Period2, 249.0);

            } else if (ChoosenCompany == 3) {
                cardForm3(f, NoOFfly, Period1, Period2, 259.0);
            }
        } else if (FlightDirectionNum == 2) {
            if (ChoosenCompany == 1) {
                double price = 0;
                if (n == "515") {
                    price = 408.0;
                } else if (n == "511") {
                    price = 470.0;
                } else {
                    price = 408.0;
                }
                cardForm3(s, NoOFfly, Period1, Period2, price);

            } else if (ChoosenCompany == 2) {
                cardForm3(F, NoOFfly, Period1, Period2, 249.0);

            } else if (ChoosenCompany == 3) {
                cardForm3(J, NoOFfly, Period1, Period2, 403.0);

            }
        } else if (FlightDirectionNum == 3) {
            if (ChoosenCompany == 1) {
                cardForm3(s, NoOFfly, Period1, Period2, 4083.0);

            }
        } else if (FlightDirectionNum == 4) {
            if (ChoosenCompany == 1) {
                cardForm3(s, NoOFfly, Period1, Period2, 3624.0);

            }
        } else if (FlightDirectionNum == 5) {
            if (ChoosenCompany == 1) {
                cardForm3(s, NoOFfly, Period1, Period2, 4347.0);

            } else if (ChoosenCompany == 2) {
                cardForm3(W, NoOFfly, Period1, Period2, 288.98);

            }
        } else if (FlightDirectionNum == 6) {
            if (ChoosenCompany == 1) {
                cardForm3(s, NoOFfly, Period1, Period2, 2187.0);

            } else if (ChoosenCompany == 2) {
                double price = 0;
                if (n == "8393") {
                    price = 159.0;
                } else if (n == "8392") {
                    price = 201.0;
                }
                cardForm3(W, NoOFfly, Period1, Period2, price);

            }
        }
    }

    /**
     *
     * @param Comp1 for the first company name 
     * @param Comp2 for the second company name 
     * @param Comp3 for the third company name 
     * @param symbol for the first company symbol 
     * @param symbol2 for the second company symbol 
     * @param symbol3 for the third company symbol 
     * @param Price1 for the first company price 
     * @param Price2 for the second company price
     * @param Price3 for the third company price
     * @description to print the cards format If the trip contains 3 companies, he can choose between them
     * 
     */
    public void CardForm1(String Comp1, String Comp2, String Comp3, String symbol, String symbol2, String symbol3, String Price1, double Price2, double Price3) { // to print this form when selecting the first fly 

        System.out.println("1-                                                   2-                                                    3-");
        System.out.println(" ______________________________                       ______________________________                        ______________________________");
        System.out.println("|                              |                     |                              |                      |                              |");
        System.out.println("|                              |                     |                              |                      |                              |");
        System.out.println("|                              |                     |                              |                      |                              |");
        System.out.println("|" + Comp1 + "|                     |" + Comp2 + "|                      |" + Comp3 + "|");
        System.out.println("|                              |                     |                              |                      |                              |");
        String g = "|              " + symbol;
        System.out.print(g);
        LengthRec(g, 30);
        System.out.print("|                     |");
        String r = "              " + symbol2;
        System.out.print(r);
        LengthRec(r, 29);
        System.out.print("|                      ");
        String u = "|              " + symbol3;
        System.out.print(u);
        LengthRec(u, 30);
        System.out.println("|                     ");
        System.out.println("|                              |                     |                              |                      |                              |");
        System.out.println("|      __________________      |                     |      __________________      |                      |      __________________      |");
        System.out.println("|     |                  |     |                     |     |                  |     |                      |     |                  |     |");
        String a = "|     |     " + Price1 + " SR";
        System.out.print(a);
        LengthRec(a, 24);
        System.out.print("|     |                    ");
        String q = " |     |     " + Price2 + " SR";
        System.out.print(q);
        LengthRec(q, 24);
        System.out.print(" |     |                    ");
        String p = "  |     |     " + Price3 + " SR";
        System.out.print(p);
        LengthRec(p, 24);
        System.out.println("  |     |");
        System.out.println("|     |__________________|     |                     |     |__________________|     |                      |     |__________________|     |");
        System.out.println("|                              |                     |                              |                      |                              |");
        System.out.println("|                              |                     |                              |                      |                              |");
        System.out.println("|______________________________|                     |______________________________|                      |______________________________|");

    }

    /**
     *
     * @param Comp1 for the first company name 
     * @param Comp2 for the second company name 
     * @param symbol for the first company symbol 
     * @param symbol2 for the second company symbol 
     * @param Price1 for the first company price 
     * @param Price2 for the second company price
     * @description to print the cards format If the trip contains 2 companies, he can choose between them
     */
    public void CardForm2(String Comp1, String Comp2, String symbol, String symbol2, double Price1, String Price2) { // to print this form when selecting the first fly 

        System.out.println("1-                                                   2-                                 ");
        System.out.println(" ______________________________                       ______________________________ ");
        System.out.println("|                              |                     |                              |");
        System.out.println("|                              |                     |                              |");
        System.out.println("|                              |                     |                              |");
        System.out.println("|" + Comp1 + "|                     |" + Comp2 + "|");
        System.out.println("|                              |                     |                              |");
        String g = "|             " + symbol;
        System.out.print(g);
        LengthRec(g, 30);
        System.out.print("|                     |");
        String r = "              " + symbol2;
        System.out.print(r);
        LengthRec(r, 29);
        System.out.print("|                      ");

        System.out.println();
        System.out.println("|                              |                     |                              |");
        System.out.println("|      __________________      |                     |      __________________      |");
        System.out.println("|     |                  |     |                     |     |                  |     |");
        String a = "|     |    " + Price1 + " SR";
        System.out.print(a);
        LengthRec(a, 24);
        System.out.print("|     |                    ");
        String q = " |     |    " + Price2 + " SR";
        System.out.print(q);
        LengthRec(q, 24);
        System.out.print(" |     |                    ");

        System.out.println();
        System.out.println("|     |__________________|     |                     |     |__________________|     |");
        System.out.println("|                              |                     |                              |");
        System.out.println("|                              |                     |                              |");
        System.out.println("|______________________________|                     |______________________________|");

    }

    /**
     *
     * @param name for the company name choosen by the user
     * @param Nofly for the flight number choosen by the user
     * @param Period for the flight time (to go) choosen by the user
     * @param Period2 for the flight time (to arrive) choosen by the user
     * @param price for the flight price choosen by the user
     * @description to print card format 
     * 
     */
    public void cardForm3(String name, String Nofly, String Period, String Period2, double price) {
        System.out.println();
        System.out.println("                             ______________________________ ");
        System.out.println("                            |                              |");
        System.out.println("                            |                              |");
        System.out.println("                            |                              |");
        System.out.println("                            |" + name + "|");
        System.out.println("                            |                              |");
        String g = "                            |            " + Nofly;
        System.out.print(g);
        LengthRec(g, 58);
        System.out.print("|");
        System.out.println();
        String P = "                            |        Time:" + Period + "-" + Period2;
        System.out.print(P);
        LengthRec(P, 58);
        System.out.print("|");
        System.out.println();
        System.out.println("                            |      __________________      |");
        System.out.println("                            |     |                  |     |");
        String a = "                            |     |    " + price + " SR";
        System.out.print(a);
        LengthRec(a, 52);
        System.out.print("|     |");
        System.out.println();
        System.out.println("                            |     |__________________|     |");
        System.out.println("                            |                              |");
        System.out.println("                            |                              |");
        System.out.println("                            |______________________________|");
    }

    /**
     *
     * @param name for the first company name 
     * @param S for the company symbol 
     * @param price for the  company price 
     * @description to print the cards format If the trip contains 1 companies, he can choose between them
     */
    public void Compaform4(String name, String S, double price) {
        System.out.println();
        System.out.println("                             ______________________________ ");
        System.out.println("                            |                              |");
        System.out.println("                            |                              |");
        System.out.println("                            |                              |");
        System.out.println("                            |" + name + "|");
        System.out.println("                            |                              |");
        String g = "                            |             " + S;
        System.out.print(g);
        LengthRec(g, 58);
        System.out.print("|");
        System.out.println();
        System.out.println("                            |                              |");
        System.out.println("                            |      __________________      |");
        System.out.println("                            |     |                  |     |");
        String a = "                            |     |    " + price + " SR";
        System.out.print(a);
        LengthRec(a, 52);
        System.out.print("|     |");
        System.out.println();
        System.out.println("                            |     |__________________|     |");
        System.out.println("                            |                              |");
        System.out.println("                            |                              |");
        System.out.println("                            |______________________________|");
    }

    private void LengthRec(String a, int b) {//  to maintain the rectangular shape on the output console in the following methos 
        String c = " ";
        for (int j = a.length(); j < b; j++) {
            c += " ";
        }
        System.out.print(c);
    }

    /**
     * Check
     * @param choice
     * @return description will return true if the user enterd a valid number when sheL he choose the company
     * @description  To check 
     */
    public boolean Check(int choice) {
        if (FlightDirectionNum == 1) {
            if (choice >= 1 & choice < 4) {
                return true;
            }
        } else if (FlightDirectionNum == 2) {
            if (choice >= 1 & choice < 4) {
                return true;
            }
        } else if (FlightDirectionNum == 3) {
            if (choice == 1) {
                return true;
            }
        } else if (FlightDirectionNum == 4) {
            if (choice == 1) {
                return true;
            }
        } else if (FlightDirectionNum == 5) {
            if (choice >= 1 & choice < 3) {
                return true;
            }
        } else if (FlightDirectionNum == 6) {
            if (choice >= 1 & choice < 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * getSymbol 
     * @return description return the symbol of the company choosen
     */
    public String getSymbol() {
        return Company.getSymbol();
    }

    /**
     * getNoOFfly
     * @return description return the flight number of the company choosen
     */
    public String getNoOFfly() {
        return NoOFfly;
    }

    /**
     * setNoOFfly
     * @param NoOFfly
     * @description to set the flight number
     */
    public void setNoOFfly(String NoOFfly) {
        this.NoOFfly = NoOFfly;
    }

    /**
     * PrintInfo
     * @description to print the information for the company choosen
     */
    public void PrintInfo() {
        Company.CompInfo();
    }

    /**
     * getCompName
     * @return description return the company name of the company choosen by the user
     */
    public String getCompName() {
        return Company.getCompName();
    }

    /**
     * setFlightDirectionNum
     * @param FlightDirectionNum
     * @description to set the Flight Direction Number
     */
    public void setFlightDirectionNum(int FlightDirectionNum) {
        this.FlightDirectionNum = FlightDirectionNum;
    }
    
    public static int NumOfTravellerComp() {
        return AirPlaneCompany.getAllFlights();
    }

}

