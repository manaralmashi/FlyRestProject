/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.flyrest;

//Sarah Abdulrahman Al- Oufi 
//443006431

//Murooj Al- Zahrani
//443008435

//Lamis Mohammed
//443007788

//Fay Abdullah Al- Thubity 
//443002646

//Manar Saad Al- Mashi
//443008492

//GROUP 6

//--------------------------------
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
//--------------------------------

public class FlyRest {

    public static void main(String[] args) {
        DynamicArray FlyRest = new DynamicArray();

        for (int R = 1; R > 0; R++) {

            Scanner input = new Scanner(System.in);
            AirPlane airPlane = new AirPlane();
            Trips trips = new Trips();
            Calendar calendar;
            String Day = "";
            int DirectionOfTrips;

            TravelerInformation travelerInformation;

            System.out.println("                   ___________________________________________________________________________  ");
            System.out.println("                  /                  Welcome To  Our Travel Agency * FLY REST *               \\");
            System.out.println("                  \\___________________________________________________________________________/ \n\n\n");
            System.out.println(" ___________________________________________ ");
            System.out.println("|            Traveler Information           |");
            System.out.println("|___________________________________________|\n");
            //1
            System.out.println("[1]:");
            String fname = CheckName("First name ");
            System.out.println("[2]:");
            String mname = CheckName("Middle name ");
            System.out.println("[3]:");
            String lname = CheckName("Last name ");
            Name name = new Name(fname, mname, lname);
            System.out.println("----------------------------------------");
            //2
            int gend;
            String gend_S = null;
            gend:
            do {
                System.out.println("Please select your Gender :  ");
                System.out.println(" [1]- Female \n [2]- Male   ");
                gend = input.nextInt();
                if (gend == 1) {
                    gend_S = "Female";
                } else if (gend == 2) {
                    gend_S = "Male";
                } else if ((gend != 1 & gend != 2)) {
                    wrongMessage();
                    continue gend;
                }
            } while (gend != 1 & gend != 2);

            // 3
            System.out.println("\n----------- Your Age Information --------- ");
            System.out.println("[1]:\n Please enter your YEAR of BIRTH (A four-digit number) : ");
            String year = input.next();
            boolean Y = (year.matches("[1-9]{1}[0-9]{3}"));
            while (Y == false) {
                System.out.println("       ______________________________________");
                System.out.println("     /\\                                      |");
                System.out.println("    /  \\              Sorry                  |");
                System.out.println("   / ): \\         year is invalid            |");
                System.out.println("  /      \\       Please enter again          |");
                System.out.println(" /________\\__________________________________|");
                System.out.println("\n");
                System.out.println("enter your YEAR of BIRTH (A four-digit number) : ");
                year = input.next();
                Y = (year.matches("[1-9]{1}[0-9]{3}"));
            }//end while
            int month;
            month:
            do {
                System.out.println("----------------------------------------");
                System.out.println("[2]:\nPlease enter your BIRTH MONTH (There are only 12 months) : ");
                month = input.nextInt();
                if (month < 1 | month > 12) {
                    System.out.println("       ______________________________________");
                    System.out.println("     /\\                                      |");
                    System.out.println("    /  \\              Sorry                  |");
                    System.out.println("   / ): \\         month is invalid            |");
                    System.out.println("  /      \\       Please enter again          |");
                    System.out.println(" /________\\__________________________________|");
                    continue month;
                }

            } while (month < 1 | month > 12);

            System.out.println("----------------------------------------");
            String Month1 = month + "";
            System.out.println("[3]:\nPlease enter your BIRTHDAY :");
            int day = input.nextInt();

            switch (Month1) {
                case "1 ":
                case "3 ":
                case "5 ":
                case "7 ":
                case "9 ":
                case "11 ":
                    if (day > 31 | day < 1) {
                        do {

                            System.out.println("       ______________________________________");
                            System.out.println("     /\\                                      |");
                            System.out.println("    /  \\              Sorry                  |");
                            System.out.println("   / ): \\ The current month does not contain |");
                            System.out.println("  /      \\  the date of the day you entered  |");
                            System.out.println(" /________\\__________________________________|");
                            System.out.println("\n");

                            System.out.println("Please enter again        ");
                            day = input.nextInt();

                        } while (day > 31 | day < 1);
                    }
                    break;
                case "4 ":
                case "6 ":
                case "8 ":
                case "10 ":
                case "12 ":
                    if (day > 30 | day < 1) {
                        do {
                            System.out.println("       ______________________________________");
                            System.out.println("     /\\                                      |");
                            System.out.println("    /  \\              Sorry                  |");
                            System.out.println("   / ): \\ The current month does not contain |");
                            System.out.println("  /      \\  the date of the day you entered  |");
                            System.out.println(" /________\\__________________________________|");
                            System.out.println("\n");

                            System.out.println("Please enter again ");
                            day = input.nextInt();

                        } while (day > 30 | day < 1);
                    }
                    break;
                case "2 ":
                    if (day > 28 | day < 1) {
                        do {
                            System.out.println("       ______________________________________");
                            System.out.println("     /\\                                      |");
                            System.out.println("    /  \\              Sorry                  |");
                            System.out.println("   / ): \\ The current month does not contain |");
                            System.out.println("  /      \\  the date of the day you entered  |");
                            System.out.println(" /________\\__________________________________|");
                            System.out.println("\n");

                            System.out.println("Please enter again"
                            );
                            day = input.nextInt();

                        } while (day > 28 | day < 1);
                    }
                    break;

            }
            //convert string year to int
            int year_i = Integer.parseInt(year);
            Age age = new Age(day, month, year_i);
            System.out.println("----------------------------------------");

            //4
            String num;
            System.out.println(" Please enter you'r PHONE NUMBER ( Start with 05********) : ");
            num = input.next();

            boolean indexnum = (num.matches("[0]{1}[5]{1}[0-9]{8}"));

            if (indexnum == true) {
                System.out.println(" Number is valid\n");
            }
            while (indexnum == false) {
                System.out.println(" Number is invalid, Please enter your mobile number again");
                System.out.println("Enter the PHONE NUMBER ( Start with 05********):");
                num = input.nextLine();
                indexnum = (num.matches("[0]{1}[5]{1}[0-9]{8}"));
            }//end of the  block while

            String city;
            boolean CheckCity;
            CheckCountry:
            do {
                System.out.println("----------------------------------------");
                System.out.println("Please enter your CITY of residence :");
                city = input.next();
                CheckCity = city.matches("[a-zA-Z]+");
                if (CheckCity == false) {
                    System.out.println("       _________________________________________");
                    System.out.println("     /\\                                         |");
                    System.out.println("    /  \\              Sorry                     |");
                    System.out.println("   / ): \\ The city you entered is not valid.    |");
                    System.out.println("  /      \\      Please enter again              |");
                    System.out.println(" /________\\_____________________________________|");
                    System.out.println("\n");
                    continue CheckCountry;
                }
            } while (CheckCity == false);

            //passport
            System.out.println("----------------------------------------");
            Passport passport = new Passport(passport());

            //E-MAIL
            System.out.println("----------------------------------------");
            
            boolean f = true;
            String email;
            ArrayList<String> address = new ArrayList<>();
            do {
                System.out.println(" Please enter your E-MAIL Addres : ");
                email = input.next();
                address.add(email);

                for (String i : address) {

                    if (isValid(i) == false) {
                        System.out.println("       ______________________________________");
                        System.out.println("     /\\                                      |");
                        System.out.println("    /  \\              Sorry                  |");
                        System.out.println("   / ): \\         Email is invalid           |");
                        System.out.println("  /      \\  Please enter your Email again    |");
                        System.out.println(" /________\\__________________________________|");
                        System.out.println("\n");

                        f = false;
                    } else {
                        f = true;
                    }

                }
            } while (f == false);

            //construct the travelerInformation with all para we want
            travelerInformation = new TravelerInformation(gend_S, name, age, num, city, passport, email);

            System.out.println(" ___________________________________________ ");
            System.out.println("|              Trip Information             |");
            System.out.println("|___________________________________________|\n");
            //View available flight directions
            do {
                System.out.println("              Direction of Trips :               ");
                System.out.println(" ________________________________________________");
                System.out.println("|        |1~   [Riyadh ] ---> [Kuwait]           |");
                System.out.println("|        |2~   [Kuwait ] ---> [Riyadh]           |");
                System.out.println("|        |3~   [Riyadh ] ---> [ Paris]           |");
                System.out.println("|        |4~   [ Paris ] ---> [Riyadh]           |");
                System.out.println("|        |5~   [Riyadh ] ---> [ Rome ]           |");
                System.out.println("|        |6~   [ Rome  ] ---> [Riyadh]           |");
                System.out.println("|________________________________________________|");
                System.out.println("Enter the direction of Trips you want to book : ");

                DirectionOfTrips = input.nextInt();
                //check the number entered by the traveler
                if (DirectionOfTrips < 1 | DirectionOfTrips > 6) {
                    wrongMessage();
                }
            } while (DirectionOfTrips < 1 | DirectionOfTrips > 6);

            airPlane.PrintCards(DirectionOfTrips);
            System.out.println("-------------------------------------------------------");
            System.out.println(" Enter the number of the AIRLINE you want to book with : ");
            boolean test = true;
            int Airline = 1;
            do {
                Airline = input.nextInt();
                if (airPlane.Check(Airline)) {
                    test = false;
                } else {
                    System.out.println("       ______________________________________");
                    System.out.println("     /\\                                      |");
                    System.out.println("    /  \\              Sorry                  |");
                    System.out.println("   / ): \\         You have to enter          |");
                    System.out.println("  /      \\          a valid number           |");
                    System.out.println(" /________\\__________________________________|");
                }
            } while (test);
            airPlane.ChoosenCompany(Airline);

            System.out.println("\n______________________________________________________________________________________________________________________________________________");
            System.out.println(" > Do you want to see COMPANY information " + airPlane.getCompName());
            System.out.println("[1] Yes \n"
                    + "[2] No ");
            boolean test2 = true;
            while (test2) {
                int information = input.nextInt();
                if (information == 1) {
                    test2 = false;
                    airPlane.PrintInfo();
//                    test2 = false;
                } else if (information == 2) {
                    test2 = false;
                } else {
                    System.out.println("       ______________________________________");
                    System.out.println("     /\\                                      |");
                    System.out.println("    /  \\              Sorry                  |");
                    System.out.println("   / ): \\   You have to enter Either 1 or 2  |");
                    System.out.println("  /      \\     Please enter a valid number   |");
                    System.out.println(" /________\\__________________________________|");
                }
            }

            int period = 0;
            period:
            do {
                calendar = new Calendar();
                calendar.Calendar();
                System.out.println("___________________________");
                System.out.println("Enter the DATE of the DAY you want to book : ");
                int DayOfTravel = input.nextInt();
                String Month = calendar.getPresentMonth();
                Day = TestToday(Testday(DayOfTravel, Month, calendar), Month, calendar);
                calendar.Day(Day);

                //View available times according to the selected airline
                switch (DirectionOfTrips) {

                    case (1):

                        trips = new FirstFlight(airPlane);
                        if (trips.getAirPlane().equals("Saudi Arabian Airlines")) {
                            a:
                            do {
                                trips.periods(trips.getAirPlane());
                                System.out.println("Enter the number of the period in which you want to book");
                                period = input.nextInt();
                                trips.FlightNumber(period);
                                if (period > 3 | period < 1) {
                                    wrongMessage();
                                    continue a;
                                }
                            } while (period > 3 | period < 1);
                        } else {
                            a:
                            do {
                                trips.periods(trips.getAirPlane());
                                System.out.println("Enter the number of the period in which you want to book");
                                period = input.nextInt();
                                trips.FlightNumber(period);
                                if (period > 1 | period < 1) {
                                    wrongMessage();
                                    continue a;
                                }
                            } while (period > 1 | period < 1);
                        }

                        period = Testperiod(trips, period, Day);
                        if (period == 1000) {
                            continue period;
                        }

                        break;
                    case (2):

                        trips = new SecondTrip(airPlane);
                        if (trips.getAirPlane().equals("Saudi Arabian Airlines")) {
                            a:
                            do {
                                trips.periods(trips.getAirPlane());
                                System.out.println("Enter the number of the period in which you want to book");
                                period = input.nextInt();
                                trips.FlightNumber(period);
                                if (period > 3 | period < 1) {
                                    wrongMessage();
                                    continue a;
                                }
                            } while (period > 3 | period < 1);
                        } else {
                            a:
                            do {
                                trips.periods(trips.getAirPlane());
                                System.out.println("Enter the number of the period in which you want to book");
                                period = input.nextInt();
                                trips.FlightNumber(period);
                                if (period > 1 | period < 1) {
                                    wrongMessage();
                                    continue a;
                                }
                            } while (period > 1 | period < 1);
                        }

                        period = Testperiod(trips, period, Day);
                        if (period == 1000) {
                            continue period;
                        }

                        break;
                    case (3):
                        trips = new ThirdTrip(airPlane);
                        if (trips.getAirPlane().equals("Saudi Arabian Airlines")) {
                            a:
                            do {
                                trips.periods(trips.getAirPlane());
                                System.out.println("Enter the number of the period in which you want to book");
                                period = input.nextInt();
                                trips.FlightNumber(period);
                                if (period > 1 | period < 1) {
                                    wrongMessage();
                                    continue a;
                                }
                            } while (period > 1 | period < 1);
                        }

                        period = Testperiod(trips, period, Day);
                        if (period == 1000) {
                            continue period;
                        }
                        break;
                    case (4):
                        trips = new FourthFlight(airPlane);
                        if (trips.getAirPlane().equals("Saudi Arabian Airlines")) {
                            a:
                            do {
                                trips.periods(trips.getAirPlane());
                                System.out.println("Enter the number of the period in which you want to book");
                                period = input.nextInt();
                                trips.FlightNumber(period);
                                if (period > 1 | period < 1) {
                                    wrongMessage();
                                    continue a;
                                }
                            } while (period > 1 | period < 1);
                        }
                        period = Testperiod(trips, period, Day);
                        if (period == 1000) {
                            continue period;
                        }

                        break;
                    case (5):
                        trips = new FifthFlight(airPlane);
                        if (trips.getAirPlane().equals("Saudi Arabian Airlines")) {
                            a:
                            do {
                                trips.periods(trips.getAirPlane());
                                System.out.println("Enter the number of the period in which you want to book");
                                period = input.nextInt();
                                trips.FlightNumber(period);
                                if (period > 1 | period < 1) {
                                    wrongMessage();
                                    continue a;
                                }
                            } while (period > 1 | period < 1);
                        }
                        period = Testperiod(trips, period, Day);
                        if (period == 1000) {
                            continue period;
                        }

                        break;
                    case (6):
                        trips = new SixthFlight(airPlane);
                        if (trips.getAirPlane().equals("Wiz Air ")) {
                            a:
                            do {
                                trips.periods(trips.getAirPlane());
                                System.out.println("Enter the number of the period in which you want to book");
                                period = input.nextInt();
                                trips.FlightNumber(period);
                                if (period > 2 | period < 1) {
                                    wrongMessage();
                                    continue a;
                                }
                            } while (period > 2 | period < 1);
                        } else {
                            a:
                            do {
                                trips.periods(trips.getAirPlane());
                                System.out.println("Enter the number of the period in which you want to book");
                                period = input.nextInt();
                                trips.FlightNumber(period);
                                if (period > 1 | period < 1) {
                                    wrongMessage();
                                    continue a;
                                }
                            } while (period > 1 | period < 1);
                        }

                        period = Testperiod(trips, period, Day);
                        if (period == 1000) {
                            continue period;
                        }

                        break;

                }

            } while (period == 1000);

            airPlane.ListOftrips(trips.getFlightNumber(), trips.getDepartureTime(), trips.getArrivalTime());

            // General 
            Scanner k = new Scanner(System.in);
            Seats seats = new Seats();
            Baggage baggage = new Baggage(trips, seats);

            // 1- Grade
            seats.printsSeatGrade();
            System.out.println(" ___________________________________________ ");
            System.out.println("|              Seats Information            |");
            System.out.println("|___________________________________________|\n");
            System.out.println("Please, Enter the SEAT GRADE :\n"
                    + "[1] First grade\n"
                    + "[2] Business degree\n"
                    + "[3] Economy grade\n");
            int gradeChoose_I = 0;
            String gradeChoose_S = null;
            boolean x = true;
            while (x) {
                gradeChoose_I = k.nextInt();
                if (!(gradeChoose_I >= 1 & gradeChoose_I <= 3)) {
                    System.out.println("       ______________________________________");
                    System.out.println("     /\\                                     |");
                    System.out.println("    /  \\              Sorry                 |");
                    System.out.println("   / ): \\   You have to enter 1, 2 or 3     |");
                    System.out.println("  /      \\     Please enter a valid number  |");
                    System.out.println(" /________\\_________________________________|");
                } else {
                    seats.setSeatGrade(gradeChoose_I);
                    gradeChoose_S = seats.getSeatGrade();
                    x = false;
                }
            }

            // 2- Number
            seats.printsSeatNumber();
            System.out.println("Please, Enter the SEAT NUMBER : ");
            int seatNumberChoose_I = 0;
            String seatNumberChoose_S = null;
            boolean y = true;
            while (y) {
                seatNumberChoose_I = k.nextInt();

                switch (gradeChoose_I) {
                    case 1:
                        // is it between 1 and 14 ?
                        if (seatNumberChoose_I >= 1 & seatNumberChoose_I <= 14) {

                            if (seats.isValidSeat(seatNumberChoose_I)) {
                                seats.setSeatNumber(seatNumberChoose_I);
                                seats.setReseverArray(seatNumberChoose_I);
                                y = false;
                            } else {
                                System.out.println("       __________________________________________");
                                System.out.println("     /\\                                         |");
                                System.out.println("    /  \\              Sorry                     |");
                                System.out.println("   / ): \\  The seat you have chosen is reserved,|");
                                System.out.println("  /      \\  Please enter a valid number.        |");
                                System.out.println(" /________\\_____________________________________|");
                            }
                        } else {
                            System.out.println("       __________________________________________");
                            System.out.println("     /\\                                         |");
                            System.out.println("    /  \\              Sorry                     |");
                            System.out.println("   / ): \\   You must choose the seat in the     |");
                            System.out.println("  /      \\  same grade that you have chosen!    |");
                            System.out.println(" /________\\_____________________________________|");
                        }
                        break;

                    case 2:
                        // is it between 15 and 28 ?
                        if (seatNumberChoose_I >= 15 & seatNumberChoose_I <= 28) {

                            if (seats.isValidSeat(seatNumberChoose_I)) {
                                seats.setSeatNumber(seatNumberChoose_I);
                                seats.setReseverArray(seatNumberChoose_I);
                                y = false;
                            } else {
                                System.out.println("       __________________________________________");
                                System.out.println("     /\\                                         |");
                                System.out.println("    /  \\              Sorry                     |");
                                System.out.println("   / ): \\  The seat you have chosen is reserved,|");
                                System.out.println("  /      \\  Please enter a valid number.        |");
                                System.out.println(" /________\\_____________________________________|");
                            }
                        } else {
                            System.out.println("       __________________________________________");
                            System.out.println("     /\\                                         |");
                            System.out.println("    /  \\              Sorry                     |");
                            System.out.println("   / ): \\   You must choose the seat in the     |");
                            System.out.println("  /      \\  same grade that you have chosen!    |");
                            System.out.println(" /________\\_____________________________________|");
                        }
                        break;

                    case 3:
                        // is it between 29 and 70 ?
                        if (seatNumberChoose_I >= 29 & seatNumberChoose_I <= 70) {

                            if (seats.isValidSeat(seatNumberChoose_I)) {
                                seats.setSeatNumber(seatNumberChoose_I);
                                seats.setReseverArray(seatNumberChoose_I);
                                y = false;
                            } else {
                                System.out.println("       __________________________________________");
                                System.out.println("     /\\                                         |");
                                System.out.println("    /  \\              Sorry                     |");
                                System.out.println("   / ): \\  The seat you have chosen is reserved,|");
                                System.out.println("  /      \\  Please enter a valid number.        |");
                                System.out.println(" /________\\_____________________________________|");
                            }
                        } else {
                            System.out.println("       __________________________________________");
                            System.out.println("     /\\                                         |");
                            System.out.println("    /  \\              Sorry                     |");
                            System.out.println("   / ): \\   You must choose the seat in the     |");
                            System.out.println("  /      \\  same grade that you have chosen!    |");
                            System.out.println(" /________\\_____________________________________|");
                        }
                        break;
                }
            }
            gradeChoose_S = seats.getSeatGrade();
            seatNumberChoose_S = seats.getSeatNumber();
            //Create new obj from (seat) with valid information
            seats = new Seats(gradeChoose_S, seatNumberChoose_S, FlyRest, trips, calendar);
            seats.setPriceOfSeats(gradeChoose_I);//end seat number
            //###########################################################################################################################################

            printTicket(airPlane.getCompName(), name.getFname() + " " + name.getLname(), trips.getIATACodeOfDeparture(), trips.getIATACodeOfDestination(), airPlane.getNoOFfly(), "" + calendar.getDateOfReservation(), trips.getDepartureTime(), seats.getSeatNumber(), seats.getSeatGrade());

            System.out.println(" ___________________________________________ ");
            System.out.println("|              Meals Information            |");
            System.out.println("|___________________________________________|\n");
            RunMealClass Meal = new RunMealClass();
            MealsCompany mealsCompany = null;
            int YesOrNo;
            meals:
            do {
                System.out.println("-------------------------------------------------");
                System.out.println("    Do you want to see the types of meals        ");
                System.out.println("and book them according to the flight you chose? ");

                System.out.println("1-Yes\n2-No");
                YesOrNo = input.nextInt();
                if (YesOrNo == 1) {
                    trips.setYesOrNo(YesOrNo);
                    int again = 0;
                    int choice1;
                    int choice2 = 0;

                    switch (trips.getAirPlane()) {
                        case "Saudi Arabian Airlines":

                            mealsCompany = new FirstCompanyMeals();

                            s:
                            do {
                                Meal.printTypesOfMeals(mealsCompany);
                                System.out.println("Enter the type of meal you want");
                                System.out.println("(The maximum you can specify is only Tow types)");
                                choice1 = input.nextInt();
                                if (choice1 > 5 | choice1 < 1) {
                                    wrongMessage();
                                    continue s;
                                }
                                Meal.Execution(mealsCompany, choice1, choice2);
                                mealsCompany.setTotalMealPrice(choice1);
                            } while (choice1 > 5 | choice1 < 1);

                            s2:
                            do {
                                System.out.println("----------Do you want to select another type of meal?----------");
                                System.out.println("Please choose a type other than the one you chose the first time");
                                System.out.println("1-Yes\n2-No");
                                again = input.nextInt();
                                if (again == 1) {
                                    Meal.printTypesOfMeals(mealsCompany);
                                    System.out.println("Enter the second type of meal you want");
                                    choice2 = input.nextInt();
                                    if (choice2 > 5 | choice2 < 1 | choice2 == choice1) {
                                        wrongMessage();
                                        System.out.println("    Do not forget that it is not allowed ");
                                        System.out.println("to repeat the same previously selected request");
                                        System.out.println("_____________________________________________");
                                        continue s2;
                                    }
                                    Meal.Execution(mealsCompany, choice1, choice2);
                                } else if (again == 2) {
                                    Meal.Execution(mealsCompany, choice1, choice2);
                                } else if (again != 1 & again != 2) {
                                    wrongMessage();
                                    continue s2;
                                }
                            } while (choice2 > 5 | choice2 < 0 | choice2 == choice1);

                            break;
                        case "Flynas":
                            mealsCompany = new SecondCompanyMeals();
                            s:
                            do {
                                Meal.printAdvance(mealsCompany);
                                System.out.println("Enter the number of the meal or drink you want to book");
                                System.out.println("(The maximum number of meal and drinks reserved is two)");
                                choice1 = input.nextInt();
                                if (choice1 > 7 | choice1 < 1) {
                                    wrongMessage();
                                    continue s;
                                }
                                Meal.Execution(mealsCompany, choice1, choice2);
                                mealsCompany.setTotalMealPrice(choice1);
                            } while (choice1 > 7 | choice1 < 1);

                            s2:
                            do {
                                System.out.println("------------Do you want to reserve another meal or drink?------------");
                                System.out.println("Please choose a meal or drink other than the one you choose the first time");
                                System.out.println("1-Yes\n2-No");
                                again = input.nextInt();
                                if (again == 1) {
                                    Meal.printAdvance(mealsCompany);
                                    System.out.println("Enter the second order for the meals and drinks you want");
                                    choice2 = input.nextInt();
                                    if (choice2 > 7 | choice2 < 1 | choice2 == choice1) {
                                        wrongMessage();
                                        System.out.println("    Do not forget that it is not allowed ");
                                        System.out.println("to repeat the same previously selected request");
                                        System.out.println("_____________________________________________");
                                        continue s2;
                                    }
                                    Meal.Execution(mealsCompany, choice1, choice2);
                                    mealsCompany.setTotalMealPrice(choice2);
                                } else if (again == 2) {
                                    Meal.Execution(mealsCompany, choice1, choice2);
                                } else if (again != 1 & again != 2) {
                                    wrongMessage();
                                    continue s2;
                                }
                            } while (choice2 > 7 | choice2 < 0 | choice2 == choice1);

                            break;
                        case "Flyadeal":
                            mealsCompany = new ThirdCompanyMeals();
                            s:
                            do {
                                Meal.printAdvance(mealsCompany);
                                System.out.println("Enter the number of the meal or drink you want to book");
                                System.out.println("(The maximum number of meal and drinks reserved is two)");
                                choice1 = input.nextInt();
                                if (choice1 > 13 | choice1 < 1) {
                                    wrongMessage();
                                    continue s;
                                }
                                Meal.Execution(mealsCompany, choice1, choice2);
                                mealsCompany.setTotalMealPrice(choice1);
                            } while (choice1 > 13 | choice1 < 1);

                            s2:
                            do {
                                System.out.println("------------Do you want to reserve another meal or drink?------------");
                                System.out.println("Please choose a meal or drink other than the one you choose the first time");
                                System.out.println("1-Yes\n2-No");
                                again = input.nextInt();
                                if (again == 1) {
                                    Meal.printAdvance(mealsCompany);
                                    System.out.println("Enter the second order for the meals and drinks you want");
                                    choice2 = input.nextInt();
                                    if (choice2 > 13 | choice2 < 1 | choice2 == choice1) {
                                        wrongMessage();
                                        System.out.println("    Do not forget that it is not allowed ");
                                        System.out.println("to repeat the same previously selected request");
                                        System.out.println("_____________________________________________");
                                        continue s2;
                                    }
                                    Meal.Execution(mealsCompany, choice1, choice2);
                                } else if (again == 2) {
                                    Meal.Execution(mealsCompany, choice1, choice2);
                                } else if (again != 1 & again != 2) {
                                    wrongMessage();
                                    continue s2;
                                }
                            } while (choice2 > 13 | choice2 < 0 | choice2 == choice1);

                            break;

                        case "Jazeera":
                            mealsCompany = new FourthCompanyMeals();
                            s:
                            do {
                                Meal.printTypesOfMeals(mealsCompany);
                                System.out.println("       Enter the type of meal you want");
                                System.out.println("(The maximum you can specify is only Tow types)");
                                choice1 = input.nextInt();
                                if (choice1 > 5 | choice1 < 1) {
                                    wrongMessage();
                                    continue s;
                                }
                                Meal.Execution(mealsCompany, choice1, choice2);
                                mealsCompany.setTotalMealPrice(choice1);
                            } while (choice1 > 5 | choice1 < 1);

                            s2:
                            do {
                                System.out.println("----------Do you want to select another type of meal?----------");
                                System.out.println("Please choose a type other than the one you chose the first time");
                                System.out.println("1-Yes\n2-No");
                                again = input.nextInt();
                                if (again == 1) {
                                    Meal.printTypesOfMeals(mealsCompany);
                                    System.out.println("Enter the second type of meal you want");
                                    choice2 = input.nextInt();
                                    if (choice2 > 5 | choice2 < 1 | choice2 == choice1) {
                                        wrongMessage();
                                        System.out.println("    Do not forget that it is not allowed ");
                                        System.out.println("to repeat the same previously selected request");
                                        System.out.println("_____________________________________________");
                                        continue s2;
                                    }
                                    Meal.Execution(mealsCompany, choice1, choice2);
                                } else if (again == 2) {
                                    Meal.Execution(mealsCompany, choice1, choice2);
                                } else if (again != 1 & again != 2) {
                                    wrongMessage();
                                    continue s2;
                                }
                            } while (choice2 > 5 | choice2 < 0 | choice2 == choice1);
                            break;
                        case "Wiz Air":
                            mealsCompany = new FifthCompanyMeals();

                            s:
                            do {
                                Meal.printTypesOfMeals(mealsCompany);
                                System.out.println("       Enter the type of meal you want");
                                System.out.println("(The maximum you can specify is only Tow types)");
                                choice1 = input.nextInt();
                                if (choice1 > 5 | choice1 < 1) {
                                    wrongMessage();
                                    continue s;
                                }
                                Meal.Execution(mealsCompany, choice1, choice2);
                                mealsCompany.setTotalMealPrice(choice1);
                            } while (choice1 > 5 | choice1 < 1);

                            s2:
                            do {
                                System.out.println("----------Do you want to select another type of meal?----------");
                                System.out.println("Please choose a type other than the one you chose the first time");
                                System.out.println("1-Yes\n2-No");
                                again = input.nextInt();
                                if (again == 1) {
                                    Meal.printTypesOfMeals(mealsCompany);
                                    System.out.println("Enter the second type of meal you want");
                                    choice2 = input.nextInt();
                                    if (choice2 > 5 | choice2 < 1 | choice2 == choice1) {
                                        wrongMessage();
                                        System.out.println("    Do not forget that it is not allowed ");
                                        System.out.println("to repeat the same previously selected request");
                                        System.out.println("_____________________________________________");
                                        continue s2;
                                    }
                                    Meal.Execution(mealsCompany, choice1, choice2);
                                } else if (again == 2) {
                                    Meal.Execution(mealsCompany, choice1, choice2);
                                } else if (again != 1 & again != 2) {
                                    wrongMessage();
                                    continue s2;
                                }
                            } while (choice2 > 5 | choice2 < 0 | choice2 == choice1);

                            break;
                    }

                } else if (YesOrNo == 2) {
                    trips.setYesOrNo(YesOrNo);
                } else if (YesOrNo != 1 & YesOrNo != 2) {
                    wrongMessage();
                    continue meals;
                }

            } while (YesOrNo != 1 & YesOrNo != 2);

            // 3- Baggage
            System.out.println(" ___________________________________________ ");
            System.out.println("|            Baggage Information            |");
            System.out.println("|___________________________________________|\n");
            System.out.println("Do you want Baggage service?\n"
                    + "[1] Yes\n"
                    + "[2] No");
            int wantOrNot = 0;
            boolean z = true;
            while (z) {
                wantOrNot = k.nextInt();
                if (!(wantOrNot == 1 | wantOrNot == 2)) {
                    System.out.println("       ______________________________________");
                    System.out.println("     /\\                                     |");
                    System.out.println("    /  \\              Sorry                 |");
                    System.out.println("   / ): \\    You have to enter 1 or 2       |");
                    System.out.println("  /      \\     Please enter a valid number  |");
                    System.out.println(" /________\\_________________________________|");
                } else {
                    baggage.setWantOrNot(wantOrNot);
                    z = false;
                }
            }
            switch (wantOrNot) {
                case 1://yes
                    System.out.println("Type of Baggage:\n"
                            + "[1] Carry-on\n"
                            + "[2] Checked-in\n");
                    int usertypeOfBaggage_I = 0;
                    boolean dd = true;
                    while (dd) {
                        usertypeOfBaggage_I = k.nextInt();
                        if (!(usertypeOfBaggage_I == 1 | usertypeOfBaggage_I == 2)) {
                            System.out.println("       ______________________________________");
                            System.out.println("     /\\                                     |");
                            System.out.println("    /  \\              Sorry                 |");
                            System.out.println("   / ): \\    You have to enter 1 or 2       |");
                            System.out.println("  /      \\     Please enter a valid number  |");
                            System.out.println(" /________\\_________________________________|");
                        } else {
                            String usertypeOfBaggage_S;

                            switch (usertypeOfBaggage_I) {
                                case 1:
                                    usertypeOfBaggage_S = "Carry-on";
                                    break;
                                case 2:
                                    usertypeOfBaggage_S = "Checked-in";
                                    break;
                            }
                            baggage.setTypeOfBaggage_I(usertypeOfBaggage_I);
                            baggage.setTypeOfBaggage_S(usertypeOfBaggage_I);
                            dd = false;
                        }
                    }

                    int numberOfBags_COn = 0;
                    int numberOfBags_ChI = 0;
                    double[] waightBaggage_COn;
                    double[] waightBaggage_ChI;

                    switch (usertypeOfBaggage_I) {

                        case 1://Carry-on
                            baggage.printBaggageInformation(usertypeOfBaggage_I);
                            boolean aa = true;
                            while (aa) {
                                System.out.println("How many CARRY-ON bags?");
                                numberOfBags_COn = k.nextInt();
                                if (!(numberOfBags_COn == 1 | numberOfBags_COn == 2)) {
                                    System.out.println("       ______________________________________");
                                    System.out.println("     /\\                                     |");
                                    System.out.println("    /  \\              Sorry                 |");
                                    System.out.println("   / ): \\    2 bags or less are allowed.    |");
                                    System.out.println("  /      \\     Please enter a valid number  |");
                                    System.out.println(" /________\\_________________________________|");
                                } else {
                                    baggage.setNumberOfBaggage(numberOfBags_COn);
                                    aa = false;
                                }
                            }
                            waightBaggage_COn = new double[numberOfBags_COn];
                            for (int i = 0; i < waightBaggage_COn.length; i++) {
                                boolean bb = true;
                                while (bb) {
                                    System.out.println("How many waight of bag(" + (i + 1) + ") in Kg :");
                                    waightBaggage_COn[i] = k.nextDouble();
                                    if (!(waightBaggage_COn[i] >= 0 & waightBaggage_COn[i] <= 10000)) {
                                        System.out.println("       _______________________________________________________");
                                        System.out.println("     /\\                                                      |");
                                        System.out.println("    /  \\              Sorry                                  |");
                                        System.out.println("   / ): \\  resure to enter the waight in Kg (ex: 4kg/7kg/..) |");
                                        System.out.println("  /      \\     Please enter a valid waight.                  |");
                                        System.out.println(" /________\\__________________________________________________|");
                                    } else {
                                        bb = false;
                                    }
                                }
                            }
                            baggage.setWeightOfBaggage(waightBaggage_COn);
                            baggage.setPriceOfBaggage(waightBaggage_COn, usertypeOfBaggage_I);

                            break;

                        case 2://Checked-in
                            baggage.printBaggageInformation(usertypeOfBaggage_I);
                            boolean cc = true;
                            while (cc) {
                                System.out.println("How many Checked-in bags?");
                                numberOfBags_ChI = k.nextInt();
                                if (!(numberOfBags_ChI >= 1 & numberOfBags_ChI <= 4)) {
                                    System.out.println("       ______________________________________");
                                    System.out.println("     /\\                                     |");
                                    System.out.println("    /  \\              Sorry                 |");
                                    System.out.println("   / ): \\    4 bags or less are allowed.    |");
                                    System.out.println("  /      \\     Please enter a valid number  |");
                                    System.out.println(" /________\\_________________________________|");
                                } else {
                                    baggage.setNumberOfBaggage(numberOfBags_ChI);
                                    cc = false;
                                }
                            }
                            waightBaggage_ChI = new double[numberOfBags_ChI];
                            for (int i = 0; i < waightBaggage_ChI.length; i++) {
                                boolean gg = true;
                                while (gg) {
                                    System.out.println("How many waight of bag(" + (i + 1) + ") in Kg :");
                                    waightBaggage_ChI[i] = k.nextDouble();
                                    switch (seats.getSeatGrade()) {
                                        case "First grade","Business degree":
                                            if (!(waightBaggage_ChI[i] >= 0 & waightBaggage_ChI[i] <= 100)) {
                                                System.out.println("       _______________________________________________________");
                                                System.out.println("     /\\                                                      |");
                                                System.out.println("    /  \\              Sorry                                  |");
                                                System.out.println("   / ): \\  resure to enter the waight in Kg (ex: 4kg/20kg/..)|");
                                                System.out.println("  /      \\     Please enter a valid waight.                  |");
                                                System.out.println(" /________\\__________________________________________________|");
                                            } else {
                                                gg = false;
                                            }
                                            break;
                                        case "Economy grade":
                                            if (!(waightBaggage_ChI[i] >= 0 & waightBaggage_ChI[i] <= 100)) {
                                                System.out.println("       _______________________________________________________");
                                                System.out.println("     /\\                                                      |");
                                                System.out.println("    /  \\              Sorry                                  |");
                                                System.out.println("   / ): \\  resure to enter the waight in Kg (ex: 4kg/20kg/..)|");
                                                System.out.println("  /      \\     Please enter a valid waight.                  |");
                                                System.out.println(" /________\\__________________________________________________|");
                                            } else {
                                                gg = false;
                                            }
                                            break;
                                    }
                                }
                            }
                            baggage.setWeightOfBaggage(waightBaggage_ChI);
                            baggage.setPriceOfBaggage(waightBaggage_ChI, usertypeOfBaggage_I);

                            break;

                        default:
                    }
                    break;

                case 2: //no
                    break;
                default:
                    wrongMessage();
            }//end baggage

            RiyadhHotels Ri = new RiyadhHotels();
            KuwaitHotels K = new KuwaitHotels();
            ParisHotels Pa = new ParisHotels();
            RomeHotels Ro = new RomeHotels();

            //suggestions & booking
            Hotels hotels = new Hotels(trips.getIATACodeOfDestination());
            Resturants resturant = new Resturants(trips.getIATACodeOfDestination());
            Sightseeing sightseeing = new Sightseeing(trips.getIATACodeOfDestination());
            Suggestions suggestions = new Suggestions(hotels, resturant, sightseeing);

            System.out.println(" ___________________________________________ ");
            System.out.println("|           Suggested information           |");
            System.out.println("|___________________________________________|\n");
            System.out.println("These are some suggestions you may like in your destination:");
            System.out.println("********************************************************\n");
            suggestions.PrintSug();
            System.out.println("\n********************************************************\n\n");

            System.out.println("> Would you like to BOOK in one of suggested HOTELS? \n"
                    + "[1] Yes\n"
                    + "[2] No ");
            int choise = input.nextInt();
            suggestions.setNeedOrnot(choise);
            for (; choise < 1 & choise > 2;) {
                System.out.println("\n       ______________________________________");
                System.out.println("     /\\                                     |");
                System.out.println("    /  \\              Sorry                 |");
                System.out.println("   / ): \\    You have to enter 1 or 2       |");
                System.out.println("  /      \\     Please enter a valid number  |");
                System.out.println(" /________\\_________________________________|");
                System.out.println("\n\n> Would you like to BOOK in one of suggested HOTELS? \n"
                        + "[1] Yes\n"
                        + "[2] No ");
                choise = input.nextInt();
            }
            switch (choise) {
                case 1://yes
                    System.out.println("Which one of of these hotels you would like to book in?");
                    String[] copy = new String[3];
                    copy = suggestions.sug[0].ChoosenCity();
                    int j = 0;
                    System.out.print("1- " + copy[j] + ", ");
                    System.out.print("2- " + copy[j + 1] + ", ");
                    System.out.print("3- " + copy[j + 2] + ".");
                    System.out.println();
                    int hotelchoise = input.nextInt();
                    switch (hotelchoise) {
                        case 1:
                            if (trips.getIATACodeOfDestination() == "RUH") {
                                Ri.bookCityHotel(hotelchoise);
                            } else if (trips.getIATACodeOfDestination() == "KWI") {
                                K.bookCityHotel(hotelchoise);
                            } else if (trips.getIATACodeOfDestination() == "FCO") {
                                Pa.bookCityHotel(hotelchoise);
                            } else if (trips.getIATACodeOfDestination() == "CDG") {
                                Ro.bookCityHotel(hotelchoise);
                            }
                            break;

                        case 2:
                            if (trips.getIATACodeOfDestination() == "RUH") {
                                Ri.bookCityHotel(hotelchoise);
                            } else if (trips.getIATACodeOfDestination() == "KWI") {
                                K.bookCityHotel(hotelchoise);
                            } else if (trips.getIATACodeOfDestination() == "FCO") {
                                Pa.bookCityHotel(hotelchoise);
                            } else if (trips.getIATACodeOfDestination() == "CDG") {
                                Ro.bookCityHotel(hotelchoise);
                            }
                            break;

                        case 3:
                            if (trips.getIATACodeOfDestination() == "RUH") {
                                Ri.bookCityHotel(hotelchoise);
                            } else if (trips.getIATACodeOfDestination() == "KWI") {
                                K.bookCityHotel(hotelchoise);
                            } else if (trips.getIATACodeOfDestination() == "FCO") {
                                Pa.bookCityHotel(hotelchoise);
                            } else if (trips.getIATACodeOfDestination() == "CDG") {
                                Ro.bookCityHotel(hotelchoise);
                            }
                            break;
                    }
                    break;

                case 2://no
                    break;
            }

            RevHotel revHotel = new RevHotel(trips.getIATACodeOfDestination());
            Reservation reservation = new Reservation(trips, calendar, travelerInformation, name, age, passport, airPlane, suggestions, revHotel, seats, baggage, mealsCompany);

            if (trips.getIATACodeOfDestination() == "RUH") {
                reservation.setRUH_Hotels(Ri);
            } else if (trips.getIATACodeOfDestination() == "KWI") {
                reservation.setKWI_Hotels(K);
            } else if (trips.getIATACodeOfDestination() == "FCO") {
                reservation.setFCO_Hotels(Pa);
            } else if (trips.getIATACodeOfDestination() == "CDG") {
                reservation.setCDG_Hotels(Ro);
            } else {

            }

            reservation.print_reservation();
            reservation.reservation_details();

            System.out.println("\n- Do you want to go back to the HOME PAGE?\n"
                    + "[1] Yes\n"
                    + "[2] No");
            boolean homepage = true;
            while (homepage)//while loop if the user enters an unacceptable value, the question will be asked again
            {//to open the loop while block

                int home = input.nextInt();//allows the user to enter the answer
                switch (home) {//to open the switch(home)
                    case 1:
                        FlyRest.SetNew(reservation);
                        homepage = false;
                        break;
                    case 2:
                        FlyRest.SetNew(reservation);
                        System.out.println("");
                        System.out.println(" ___________________________________________ ");
                        System.out.println("|          THE  REPORT  OF FLYREST          |");
                        System.out.println("|___________________________________________|\n");
                        System.out.println("\n[1] ");
                        ReportDeparture(FlyRest.getFlyrest());
                        System.out.println("[\n2] ");
                        ReportAirline(FlyRest.getFlyrest());
                        System.out.println("\n[3] ");
                        ReportSameDate(FlyRest.getFlyrest());
                        R = -1;
                        homepage = false;
                        break;
                    default:
                        System.out.println("       ______________________________________");
                        System.out.println("     /\\                                      |");
                        System.out.println("    /  \\              Sorry                  |");
                        System.out.println("   / ): \\   You have to enter Either 1 or 2  |");
                        System.out.println("  /      \\     Please enter a valid number   |");
                        System.out.println(" /________\\__________________________________|");

                }//to close the switch(home)

            }

        }//end for loop
    }//ِend main

//Methods 
    public static boolean isValid(String email) {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);

        if (email == null) {
            return false;
        }

        return pat.matcher(email).matches();

    }

    public static String TestToday(int day, String Month, Calendar calendar) {

        Scanner s = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat Compare;
        String Day = "";
        String presentday;
        int ReturnCompare = 0;
        //---------------------------------------------------
        if (day < 10) {
            Day = ("0" + day);
        } else {
            Day = (day + "");
        }

        Compare = new SimpleDateFormat("dd");
        presentday = Compare.format(date);
        ReturnCompare = Day.compareTo(presentday);

        if (ReturnCompare < 0) {
            do {
                System.out.println("       ______________________________________");
                System.out.println("     /\\                                      |");
                System.out.println("    /  \\              Sorry                  |");
                System.out.println("   / ): \\ All flights took off on the day    |");
                System.out.println("  /      \\          you selected             |");
                System.out.println(" /________\\__________________________________|");
                System.out.println("To change the reservation day, press the number: 1");
                System.out.println("To stop booking, press the number: 0");
                int select = s.nextInt();

                switch (select) {
                    case 1:
                        calendar.Calendar();
                        System.out.println("Please enter another date ");
                        day = s.nextInt();
                        Testday(day, Month, calendar);
                        if (day < 10) {
                            Day = ("0" + day);
                        } else {
                            Day = (day + "");
                        }

                        Compare = new SimpleDateFormat("dd");
                        presentday = Compare.format(date);
                        ReturnCompare = Day.compareTo(presentday);

                        break;
                    case 0:
                        System.out.println("Thank you");
                        System.exit(0);
                        break;
                }

            }//end do 
            while (ReturnCompare < 0);
        }//end  if 

        return Day;
    }

    public static int Testday(int day, String Month, Calendar calendar) {
        Scanner s = new Scanner(System.in);
        switch (Month) {
            case "1", "3", "5", "7","9", "11":
                if (day > 31 | day < 1) {
                    do {

                        System.out.println("       ______________________________________");
                        System.out.println("     /\\                                      |");
                        System.out.println("    /  \\              Sorry                  |");
                        System.out.println("   / ): \\ The current month does not contain |");
                        System.out.println("  /      \\  the date of the day you entered  |");
                        System.out.println(" /________\\__________________________________|");
                        System.out.println("\n");
                        calendar.Calendar();
                        System.out.println("Please enter another date         ");
                        day = s.nextInt();
                        TestToday(day, Month, calendar);
                    } while (day > 31 | day < 1);
                }
                break;
            case "4", "6", "8", "10", "12":
                if (day > 30 | day < 1) {
                    do {
                        System.out.println("       ______________________________________");
                        System.out.println("     /\\                                      |");
                        System.out.println("    /  \\              Sorry                  |");
                        System.out.println("   / ): \\ The current month does not contain |");
                        System.out.println("  /      \\  the date of the day you entered  |");
                        System.out.println(" /________\\__________________________________|");
                        System.out.println("\n");
                        calendar.Calendar();
                        System.out.println("Please enter another date         ");
                        day = s.nextInt();
                        TestToday(day, Month, calendar);
                    } while (day > 30 | day < 1);
                }
                break;
            case "2":
                if (day > 28 | day < 1) {
                    do {
                        System.out.println("       ______________________________________");
                        System.out.println("     /\\                                      |");
                        System.out.println("    /  \\              Sorry                  |");
                        System.out.println("   / ): \\ The current month does not contain |");
                        System.out.println("  /      \\  the date of the day you entered  |");
                        System.out.println(" /________\\__________________________________|");
                        System.out.println("\n");
                        calendar.Calendar();
                        System.out.println("Please enter another date"
                        );
                        day = s.nextInt();
                        TestToday(day, Month, calendar);
                    } while (day > 28 | day < 1);
                }
                break;

        }
        return (day);
    }

    public static int Testperiod(Trips trips, int period, String day) {
        Scanner s = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat Compare;
        int ReturnCompare;
        //--------------------------------
        Compare = new SimpleDateFormat("dd");
        String presentday = Compare.format(date);
        if (presentday.equals(day)) {

            Compare = new SimpleDateFormat("HH:mm");
            String presentTime = Compare.format(date);
            String DepartureTime = trips.FlightNumber(period);
            ReturnCompare = DepartureTime.compareTo(presentTime);

            if (ReturnCompare < 0) {
                do {
                    System.out.println("       ________________________________________________________");
                    System.out.println("     /\\                                                       |");
                    System.out.println("    /  \\                       Sorry                          |");
                    System.out.println("   / ): \\ The period you specified is not available because   |");
                    System.out.println("  /      \\the flight took off before you made the reservation |");
                    System.out.println(" /________\\___________________________________________________|");
                    System.out.println("         To change the selected period, press the number: 1");
                    System.out.println("         To change the reservation day, press the number: 2");
                    System.out.println("         To stop booking, press the number: 0");
                    int select = s.nextInt();

                    switch (select) {
                        case 1:

                            trips.periods(trips.getAirPlane());
                            System.out.println("Enter the number of the period in which you want to book");
                            period = s.nextInt();
                            Compare = new SimpleDateFormat("HH:mm");
                            presentTime = Compare.format(date);
                            DepartureTime = trips.FlightNumber(period);
                            ReturnCompare = DepartureTime.compareTo(presentTime);

                            break;
                        case 0:
                            System.out.println("Thank you");
                            System.exit(0);
                            break;
                        case 2:
                            ReturnCompare = 1000;
                            period = 1000;
                            break;

                    }

                }//end do 
                while (ReturnCompare < 0);
            }//end  if 
        }

        return period;
    }

    public static String printMobile_Number(String mobileNum) {

        Scanner keyboard = new Scanner(System.in);

        //Mobile Number (Valid or not valid):
        boolean isNotValidNumber = true;

        while (isNotValidNumber) {

            mobileNum = keyboard.nextLine();

            //The user must enter 10 digits
            if (mobileNum.length() == 10) {

                //The user must start number with "05"
                //If I use (mobileNum.substring(0,2) != "05") it will be always (true)!
                if (!mobileNum.substring(0, 2).equals("05")) {
                    System.out.print("SORRY! It Must be Start with \"05\", EX:(05********) : ");
                } else {
                    //Valid number
                    isNotValidNumber = false;
                }

            } else {
                System.out.print("SORRY! It Must be 10 digits, EX:(05********) : ");
            }
        }
        return mobileNum;
    }

    public static void wrongMessage() {

        System.out.println("       ______________________________________");
        System.out.println("     /\\                                      |");
        System.out.println("    /  \\              Sorry                  |");
        System.out.println("   / ): \\ The number you entered is incorrect|");
        System.out.println("  /      \\  Please enter the number again    |");
        System.out.println(" /________\\__________________________________|");
        System.out.println("\n");

    }

    public static String CheckName(String p) {
        Scanner input = new Scanner(System.in);
        boolean CheckName = true;
        String name;
        CheckName:
        do {
            System.out.println("   Please enter you'r " + p + " \n (write the name without writing numbers) ");
            name = input.next();
            CheckName = name.matches("[a-zA-Z]+");
            if (CheckName == false) {
                System.out.println("       _________________________________________");
                System.out.println("     /\\                                         |");
                System.out.println("    /  \\              Sorry                     |");
                System.out.println("   / ): \\ The entered " + p + " is incorrect.       |");
                System.out.println("  /      \\      Please enter again              |");
                System.out.println(" /________\\_____________________________________|");
                System.out.println("\n");
                continue CheckName;
            }
        } while (CheckName == false);

        return name;

    }

    public static String passport() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the PASSPORT (It must be 10 number long) : ");
        String passport = input.nextLine();
        boolean p = (passport.matches("[0-9]{10}"));
        if (p == true) {
            System.out.println("passport is valid\n");
        }//end of the  block if
        while (p == false) {
            System.out.println("       ______________________________________");
            System.out.println("     /\\                                      |");
            System.out.println("    /  \\              Sorry                  |");
            System.out.println("   / ): \\         passport is invalid        |");
            System.out.println("  /      \\  Please enter your passport again |");
            System.out.println(" /________\\__________________________________|");
            System.out.println("\n");
            System.out.println("Enter the passport (It must be 10 number long)");
            passport = input.nextLine();
            p = (passport.matches("[0-9]{10}"));
        }//end while
        return passport;

    }

    public static void printTicket(String Comp, String Name, String From, String to, String NumOfFly, String Date, String Time, String SeatN, String SeatG) {
        System.out.println("   ___________________________________________________________________________________________   ");
        System.out.print("  /   B O A R D I N G P A S S " + Comp);
        LengthRec("   B O A R D I N G P A S S " + Comp, 65);
        System.out.print("| ");
        LengthRec(" ", 24);
        System.out.println("\\");
        System.out.println(" |-------------------------------------------------------------------|-------------------------|  ");
        System.out.print(" |   " + Name);
        LengthRec(" |   " + Name, 57);
        System.out.print(SeatN);
        LengthRec(" |   " + SeatN, 15);
        System.out.print("| ");
        System.out.print(Name);
        LengthRec(" " + Name, 24);
        System.out.println("|");
        System.out.println(" |   NAME OF PASSENGER                                    SEAT       |                         |  ");
        System.out.println(" |                                                                   |                         |  ");
        System.out.print(" |  FROM: " + From);
        LengthRec(" |  FROM: " + From, 68);
        System.out.print("| ");
        System.out.print("From " + From);
        LengthRec(" " + From, 19);
        System.out.println("|");
        System.out.print(" |                                                      " + SeatG);
        LengthRec(" |                                                      " + SeatG, 64);
        System.out.print("| ");
        System.out.print("To " + to);
        LengthRec(" " + to, 21);
        System.out.println("|");
        System.out.print(" |  TO: " + to);
        LengthRec(" " + to, 50);
        System.out.print("CLASS      | FLIGHT NO " + NumOfFly);
        LengthRec("FLIGHT NO " + NumOfFly, 23);
        System.out.println("|");
        System.out.println(" |                                                                   |                         |  ");
        System.out.print(" | FLIGHT NO " + NumOfFly + " DATE " + Date);
        LengthRec(" | FLIGHT NO " + NumOfFly + " DATE " + Date, 68);
        System.out.print("| ");
        LengthRec("", 23);
        System.out.println("|");
        System.out.print(" \\ DEPARTURE TIME " + Time);
        LengthRec("\\ DEPARTURE TIME " + Time, 67);
        System.out.print("| " + Date + " " + Time);
        LengthRec("| " + Date + " " + Time, 24);
        System.out.println("/");
        System.out.println("  \\__________________________________________________________________|_______________________/ ");

    }

    private static void LengthRec(String a, int b) {//  to maintain the rectangular shape on the output console in the following methos 
        String c = " ";
        for (int j = a.length(); j < b; j++) {
            c += " ";
        }
        System.out.print(c);
    }

    public static void ReportDeparture(Reservation[] R) {
        int FlightsFromRUH = 0;
        for (int i = 0; i < R.length; i++) {
            if (R[i] != null) {
                if (R[i].getTrips().getIATACodeOfDeparture() == "RUH") {
                    FlightsFromRUH++;
                }
            }
        }
        System.out.println("Number Of Flights that Departure from King Khalid Airport : " + FlightsFromRUH);
    }

    public static void ReportAirline(Reservation[] R) {
        int Saudi = 0;
        int Flynas = 0;
        int wiz = 0;
        int FlyAdel = 0;
        int Jazeera = 0;
        for (int i = 0; i < R.length; i++) {
            if (R[i] != null) {
                if (R[i].getAirPlane().getSymbol() == "SV") {
                    Saudi++;
                } else if (R[i].getAirPlane().getSymbol() == "XY-") {
                    Flynas++;
                } else if (R[i].getAirPlane().getSymbol() == "F3-") {
                    FlyAdel++;
                } else if (R[i].getAirPlane().getSymbol() == "W6") {
                    wiz++;
                } else if (R[i].getAirPlane().getSymbol() == "J9-") {
                    Jazeera++;
                }
            }
        }
        System.out.println("Number Of Flights Opreate by Saudia Airline : " + Saudi);
        System.out.println("Number Of Flights Opreate by Flynas   : " + Flynas);
        System.out.println("Number Of Flights Opreate by Wizz     : " + wiz);
        System.out.println("Number Of Flights Opreate by FlyAdel  : " + FlyAdel);
        System.out.println("Number Of Flights Opreate by Jazeera  : " + Jazeera);

    }

    public static void ReportSameDate(Reservation[] R) {

        for (int i = 0; i < R.length; i++) {
            int count = 0;
            int count1 = 0;
            for (int j = 0; j < R.length; j++) {
                if (R[i].getCalendar().getDay() == R[j].getCalendar().getDay()) {
                    count++;
                }
            }
            for (int j = i - 1; j >= 0; j--) {
                if (R[i].getCalendar().getDay() == R[j].getCalendar().getDay()) {
                    count1++;
                }
            }
            if (count1 == 0) {
                System.out.println("The Day " + R[i].getCalendar().getDay() + " occurs :" + count + " Flights");
            }
        }
    }
}
