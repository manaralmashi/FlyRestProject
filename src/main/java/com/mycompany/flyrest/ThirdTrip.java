package com.mycompany.flyrest;

//-----------------------------

import java.util.Date;
import java.text.*;
//-----------------------------

public class ThirdTrip extends Trips {

    public ThirdTrip(AirPlane airPlane) {

        setAirPlane(airPlane);

        setIATACodeOfDeparture("RUH");
        setAirportOfDeparture("King Khalid International Airport");
        setIATACodeOfDestination("CDG");
        setAirportOfDestination("Paris Charles de Gaulle Airport");
        NumberOftripsFromRUH++;
    }
    //-------method overriding----------

    public void periods(String Company) {

        switch (Company) {
            case "Saudi Arabian Airlines":

                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |2:05:7:00|");
                setFlightDuration("6h-55min");
                break;
        }//end  switch
    }

    public String FlightNumber(int period) {
        Date date = new Date();
        SimpleDateFormat time;

        if (getAirPlane() == "Saudi Arabian Airlines") {
            switch (period) {
                case 1:

                    time = new SimpleDateFormat("02:05");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("07:00");
                    setArrivalTime(time.format(date));
                    setFlightNumber("143");
                    setTripPrice(4083.00);
                    break;
            }//end switch(period)
        }//end if 

        return getDepartureTime();

    }

}
