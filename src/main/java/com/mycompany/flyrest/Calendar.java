package com.mycompany.flyrest;

//-----------------------------------
import java.text.SimpleDateFormat;
import java.util.Date;
//-----------------------------------

/**
 *
 * @author msms1
 */
public class Calendar {

    //-------data feild----------
    private String DateOfTravel;             //Stores the date of the day the traveler chooses to travel

    private String PresentMonth;              //Stores the current month number 
    private Date DateOfReservation;           //Stores the day and time the user logged in to book their ride
    private static int NumberOftripsSameDay;  //Stores the number of flights booked for one day in a specific airline

    //-------constructors----------
    /**
     *
     * @param DateOfTravel
     */
    public Calendar(String DateOfTravel) {
        this.DateOfTravel = DateOfTravel;
    }

    /**
     *
     */
    public Calendar() {
    }

    //-------method ----------
    /**
     *
     */
    public void Calendar() {
        Date date = new Date();
        SimpleDateFormat Compare = new SimpleDateFormat("M");
        PresentMonth = Compare.format(date);

        switch (PresentMonth) {

            case "1":
                System.out.println("   -------January------  ");
                System.out.print("   S   M   T   W   T   F   S");
                int day = 1;
                for (int i = 1; i < 33; i++) {

                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i > 31) {
                        System.out.print("   ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }
                        day++;
                    }
                }//end for loop 
                System.out.println("");
                break;
            case "2":

                System.out.println("   -------February------  ");
                System.out.print("   S   M   T   W   T   F   S");
                day = 1;
                for (int i = 1; i < 34; i++) {
                    if (i == 1 | i == 2) {
                        System.out.print("     ");
                    }
                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i < 6) {
                        System.out.print("   ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }

                        day++;
                    }
                }//end for loop 
                System.out.println("");
                break;

            case "3":
                System.out.println("   -------March------  ");
                System.out.print("   S   M   T   W   T   F   S");
                day = 1;
                for (int i = 1; i < 33; i++) {
                    if (i == 1 | i == 2 | i == 3 | i == 4) {
                        System.out.print("  ");
                    }
                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i < 4) {
                        System.out.print("  ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }

                        day++;
                    }

                }
                System.out.println("");
                break;
            case "4":
                System.out.println("      -------APril------   ");
                System.out.print("   S   M   T   W   T   F   S");
                day = 1;
                for (int i = 1; i < 37; i++) {
                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i < 7) {
                        System.out.print("    ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }
                        day++;
                    }
                }
                System.out.println("");
                break;
            case "5":
                System.out.println("       -------May------    ");
                System.out.print("   S   M   T   W   T   F   S");
                day = 1;
                for (int i = 1; i < 33; i++) {
                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i < 2) {
                        System.out.print("    ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }
                        day++;
                    }
                }
                System.out.println("");
                break;
            case "6":

                System.out.println("       -------June------    ");
                System.out.print("   S   M   T   W   T   F   S");
                day = 1;
                for (int i = 1; i < 35; i++) {
                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i < 5) {
                        System.out.print("    ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }
                        day++;
                    }
                }
                System.out.println("");
                break;
            case "7":
                System.out.println("       -------July------    ");
                System.out.print("   S   M   T   W   T   F   S");
                day = 1;
                for (int i = 1; i < 38; i++) {
                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i < 7) {
                        System.out.print("    ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }
                        day++;
                    }
                }
                System.out.println("");
                break;
            case "8":
                System.out.println("       -------August------    ");
                System.out.print("   S   M   T   W   T   F   S");
                day = 1;
                for (int i = 1; i < 34; i++) {
                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i < 3) {
                        System.out.print("    ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }
                        day++;
                    }
                }
                System.out.println("");
                break;
            case "9":
                System.out.println("     -------Septemmber------    ");
                System.out.print("   S   M   T   W   T   F   S");
                day = 1;
                for (int i = 1; i < 36; i++) {
                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i < 6) {
                        System.out.print("    ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }
                        day++;
                    }
                }
                System.out.println("");
                break;
            case "10":
                System.out.println("     -------October------    ");
                System.out.print("   S   M   T   W   T   F   S");
                day = 1;
                for (int i = 1; i < 32; i++) {
                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i > 31) {
                        System.out.print("    ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }
                        day++;
                    }
                }
                System.out.println("");
                break;
            case "11":

                System.out.println("     -------November------    ");
                System.out.print("   S   M   T   W   T   F   S");
                day = 1;
                for (int i = 1; i < 34; i++) {
                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i < 4) {
                        System.out.print("    ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }
                        day++;
                    }
                }
                System.out.println("");

                break;

            case "12":
                System.out.println("     -------December------    ");
                System.out.print("   S   M   T   W   T   F   S");
                day = 1;
                for (int i = 1; i < 37; i++) {
                    if (i % 7 == 1) {
                        System.out.println();
                    }
                    if (i < 6) {
                        System.out.print("    ");
                    } else {
                        if (day / 10 == 0) {
                            System.out.print("   " + day);
                        } else {
                            System.out.print("  " + day);
                        }
                        day++;
                    }
                }
                System.out.println("");
                break;

        }
    }

    /**
     *
     * @param day
     * @return
     */
    public String Day(String day) {
        SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("yyyy-MM-" + day);
        Date date = new Date();
        SimpleDateFormat Compare = new SimpleDateFormat("dd");
        String presentday = Compare.format(date);
        String DateOfTravelFormat = SimpleDateFormat.format(date);
        this.DateOfTravel = DateOfTravelFormat;
        DateOfReservation = date;
        NumberOftripsSameDay++;

        if (presentday == DateOfTravel) {
            NumberOftripsSameDay++;
        }
        return this.DateOfTravel;
    }
    //-------Getters methods----------

    /**
     *
     * @return
     */
    public String getDay() {
        return DateOfTravel;
    }

    /**
     *
     * @return
     */
    public String getPresentMonth() {
        return PresentMonth;
    }

    /**
     *
     * @return
     */
    public Date getDateOfReservation() {
        return DateOfReservation;
    }

    /**
     *
     * @return
     */
    public String getDateOfTravel() {
        return DateOfTravel;
    }

    /**
     *
     * @return
     */
    public static int getNumberOftripsSameDay() {
        return NumberOftripsSameDay;
    }

//-------setter methods----------
    /**
     *
     * @param DateOfTravel
     */
    public void setDay(String DateOfTravel) {
        this.DateOfTravel = DateOfTravel;
    }

}
