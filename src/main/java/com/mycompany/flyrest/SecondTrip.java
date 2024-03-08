package com.mycompany.flyrest;

//-------------------------------

import java.util.Date;
import java.text.*;
//-------------------------------

public class SecondTrip extends Trips {

    public SecondTrip(AirPlane airPlane) {
        setAirPlane(airPlane);
        setIATACodeOfDeparture("KWI");
        setAirportOfDeparture("Kuwait international Airport");
        setIATACodeOfDestination("RUH");
        setAirportOfDestination("King Khalid International Airport");
        //AirPlaneCompany.GetCompName();
    }
    //-------method overriding----------

    public void periods(String Company) {

        switch (Company) {
            case "Saudi Arabian Airlines":

                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |10:50-12:15|");
                System.out.println("period 2: |18:20-19:45| ");
                System.out.println("period 3: |23:35-01:00|");
                setFlightDuration("1h-25min");
                break;
            case "Flynas":
                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |15:45-17:05|");
                setFlightDuration("1h-20min");
                break;
            case "Jazeera":
                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |12:10-13:25|");
        }//end switch(Airlines)  
        setFlightDuration("1h-20min");
    }//end  switch

    public String FlightNumber(int period) {
        Date date = new Date();
        SimpleDateFormat time;

        if (getAirPlane() == "Saudi Arabian Airlines") {
            switch (period) {
                case 1:
                    time = new SimpleDateFormat("10:50");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("12:15");
                    setArrivalTime(time.format(date));
                    setFlightNumber("513");
                    setTripPrice(408.00);
                    break;
                case 2:
                    time = new SimpleDateFormat("18:20");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("19:45");
                    setArrivalTime(time.format(date));
                    setFlightNumber("511");
                    setTripPrice(470.00);
                    break;
                case 3:
                    time = new SimpleDateFormat("23:35");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("01:00");
                    setArrivalTime(time.format(date));
                    setFlightNumber("515");
                    setTripPrice(408.00);
                    break;
            }//end switch(period)
        }//end if 
        else if (getAirPlane() == "Flynas") {
            switch (period) {
                case 1:
                    time = new SimpleDateFormat("15:45");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("17:05");
                    setArrivalTime(time.format(date));
                    setFlightNumber("232");
                    setTripPrice(249.00);
                    break;
            }//end switch(period)
        }//end if 
        else if (getAirPlane() == "Jazeera") {
            switch (period) {
                case 1:
                    time = new SimpleDateFormat("12:10");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("13:25");
                    setArrivalTime(time.format(date));
                    setFlightNumber("221");
                    setTripPrice(403.00);
                    break;
            }//end switch(period)
        }//end if   
        return getDepartureTime();

    }

}
