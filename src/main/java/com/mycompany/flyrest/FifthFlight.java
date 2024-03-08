package com.mycompany.flyrest;

//---------------------------

import java.util.Date;
import java.text.*;
//----------------------------

public class FifthFlight extends Trips {

    public FifthFlight(AirPlane airPlane) {

        setAirPlane(airPlane);

        setIATACodeOfDeparture("RUH");
        setAirportOfDeparture("King Khalid International Airport");
        setIATACodeOfDestination("FCO");
        setAirportOfDestination("Leonardo da Vinci Airport");
        NumberOftripsFromRUH++;
    }
    //-------method overriding----------

    public void periods(String Company) {

        switch (Company) {
            case "Saudi Arabian Airlines":

                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |9:50-14:00|");
                setFlightDuration("6h-10min");

                break;
            case "Wiz Air":

                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |7:55-11:40|");
                setFlightDuration("5h-45min");

                break;
        }//end switch(Airlines)
    }//end periods

    public String FlightNumber(int period) {
        Date date = new Date();
        SimpleDateFormat time;

        if (getAirPlane() == "Saudi Arabian Airlines") {
            switch (period) {
                case 1:
                    time = new SimpleDateFormat("9:50");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("14:00");
                    setArrivalTime(time.format(date));
                    setFlightNumber("207");
                    setTripPrice(4347.00);
                    break;
            }//end switch(period)
        }//end if 
        else if (getAirPlane() == "Wiz Air") {
            switch (period) {
                case 1:
                    time = new SimpleDateFormat("7:55");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("11:40");
                    setArrivalTime(time.format(date));
                    setFlightNumber("8394");
                    setTripPrice(288.98);
                    break;
            }
        }
        return getDepartureTime();
    }

}
