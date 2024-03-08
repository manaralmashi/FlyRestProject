package com.mycompany.flyrest;

//----------------------------
import java.util.Date;
import java.text.*;
//----------------------------

public class FourthFlight extends Trips {

    public FourthFlight(AirPlane airPlane) {
        setAirPlane(airPlane);

        setIATACodeOfDeparture("CDG");
        setAirportOfDeparture("Paris Charles de Gaulle Airport");
        setIATACodeOfDestination("RUH");
        setAirportOfDestination("King Khalid International Airport");

    }
    //-------method overriding----------

    public void periods(String Company) {

        switch (Company) {
            case "Saudi Arabian Airlines":

                System.out.println("Available times for your selected airline : ");
                System.out.println("period 1: |11:25-19:35|");
                setFlightDuration("6h-10min");
                break;
        }//end switch(Airlines)
    }//end  

    public String FlightNumber(int period) {
        Date date = new Date();
        SimpleDateFormat time;

        if (getAirPlane() == "Saudi Arabian Airlines") {
            switch (period) {
                case 1:
                    time = new SimpleDateFormat("11:25");
                    setDepartureTime(time.format(date));
                    time = new SimpleDateFormat("19:35");
                    setArrivalTime(time.format(date));
                    setFlightNumber("144");
                    setTripPrice(3624.00);
                    break;
            }//end switch(period)
        }//end if  

        return getDepartureTime();

    }

}
