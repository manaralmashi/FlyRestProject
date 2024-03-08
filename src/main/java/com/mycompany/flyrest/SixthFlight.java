package com.mycompany.flyrest;
//-----------------------------
import java.util.Date;
import java.text.*;
//-----------------------------

public class SixthFlight extends Trips {

    public SixthFlight(AirPlane airPlane) {
        setAirPlane(airPlane);

        setIATACodeOfDeparture("FCO");
        setAirportOfDeparture("Leonardo da Vinci Airport");
        setIATACodeOfDestination("RUH");
        setAirportOfDestination("King Khalid International Airport");

    }
    //-------method overriding----------

    public void periods(String Company) {

        switch (Company) {
            case "Saudi Arabian Airlines":

                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |15:30 – 22: 35|");
                setFlightDuration("5h-05min");
                break;
            case "Wiz Air":

                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |11:35 – 19:00 |");
                System.out.println("period 2: |11:55 – 19:20 |");
                setFlightDuration("5h-25min");
                break;
        }//end switch(Airlines)
    }//end 

    public String FlightNumber(int period) {
        Date date = new Date();
        SimpleDateFormat time;

        if (getAirPlane() == "Saudi Arabian Airlines") {
            switch (period) {
                case 1:
                    time = new SimpleDateFormat("15:30");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("22: 35");
                    setArrivalTime(time.format(date));
                    setFlightNumber("208");
                    setTripPrice(2187.00);
                    break;

            }//end switch(period)
        }//end if   
        else if (getAirPlane() == "Wiz Air") {
            switch (period) {
                case 1:
                    time = new SimpleDateFormat("11:35");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("19:00");
                    setArrivalTime(time.format(date));
                    setFlightNumber("8393");
                    setTripPrice(159.82);
                    break;
                case 2:
                    time = new SimpleDateFormat("11:55");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("19:20");
                    setArrivalTime(time.format(date));
                    setFlightNumber("83932");
                    setTripPrice(201.00);
                    break;
            }//end switch(period)
        }//end if    
        return getDepartureTime();

    }

}
