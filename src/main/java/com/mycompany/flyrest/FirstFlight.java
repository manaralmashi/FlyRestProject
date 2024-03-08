package com.mycompany.flyrest;

//--------------------------
import java.util.Date;
import java.text.*;
//--------------------------


public class FirstFlight extends Trips {

    /**
     *
     * @param airPlane
     */
    public FirstFlight(AirPlane airPlane) {

        setAirPlane( airPlane);
        setIATACodeOfDeparture ( "RUH");
        setAirportOfDeparture ("King Khalid International Airport");
        setIATACodeOfDestination ("KWI");
        setAirportOfDestination ( "Kuwait international Airport");
        setFlightDuration ( "1h-20min");
        NumberOftripsFromRUH++;
    }
 //-------method overriding----------

    /**
     *
     * @param Company
     */
    public void periods(String Company) {

        switch (Company) {
            case "Saudi Arabian Airlines":

                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |08:35-09:55|");
                System.out.println("period 2: |16:05-17:25| ");
                System.out.println("period 3: |21:20-22:40|");

                break;
            case "Flynas":
                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |13:35-14:55|");

                break;
            case "Flyadeal":
                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |12:45-14:00|");
        }//end switch(Airlines)

    }//end switch  

    /**
     *
     * @param period
     * @return
     */
    public String FlightNumber(int period) {
        Date date = new Date();
        SimpleDateFormat time;

        if (getAirPlane() == "Saudi Arabian Airlines") {
            switch (period) {
                case 1:

                    time = new SimpleDateFormat("08:35");
                    setDepartureTime (time.format(date));
                    time = new SimpleDateFormat("09:55");
                    setArrivalTime(time.format(date));
                    setFlightNumber("512");
                    setTripPrice(505.00);
                    break;
                case 2:
                    time = new SimpleDateFormat("16:05");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("17:25");
                    setArrivalTime(time.format(date));
                    setFlightNumber("510");
                    setTripPrice(937.00);
                    break;
                case 3:
                    time = new SimpleDateFormat("21:20");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("22:40");
                    setArrivalTime(time.format(date));
                    setFlightNumber("514");
                    setTripPrice(505.00);
                    break;
            }//end switch(period)
        }//end if 
        else if (getAirPlane() == "Flynas") {
            switch (period) {
                case 1:

                    time = new SimpleDateFormat("13:35");
                    setDepartureTime ( time.format(date));
                    time = new SimpleDateFormat("14:55");
                    setArrivalTime ( time.format(date));
                    setFlightNumber ( "231");
                    setTripPrice(249.00);
                    break;
            }//end switch(period)
        }//end if 
        else if (getAirPlane() == "Flyadeal") {
            switch (period) {
                case 1:
                    time = new SimpleDateFormat("12:45");
                    setDepartureTime ( time.format(date));
                    time = new SimpleDateFormat("14:00");
                    setArrivalTime ( time.format(date));
                    setFlightNumber ( "521");
                    setTripPrice(259.00);
                    break;
            }//end switch(period)
        }//end if    
        return getDepartureTime();

    }

}