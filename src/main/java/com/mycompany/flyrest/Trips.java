package com.mycompany.flyrest;

//----------------------

import java.util.Date;
import java.text.*;
//---------------------

/**
 *
 * @author msms1
 */
public class Trips {
    //-------data feild----------

    /**
     *
     * @Deprecated Stores the duration of the trip
     */
    private String FlightDuration;
    /**
     *
     * @Deprecated Stores the name of the airport from which the traveler will
     * depart
     */
    private String AirportOfDeparture;
    /**
     *
     * @Deprecated Stores the name of the airport to which the traveler will
     * arrive
     */
    private String AirportOfDestination;
    /**
     *
     * @Deprecated Stores the code of the city from which the traveler will
     * depart
     */
    private String IATACodeOfDeparture;
    /**
     *
     * @Deprecated Stores the city code to which the traveler will arrive
     */
    private String IATACodeOfDestination;
    /**
     *
     * @Deprecated Stores the take-off time of the aircraft
     */
    private String DepartureTime;
    /**
     *
     * @Deprecated Stores the arrival time of the aircraft
     */
    private String ArrivalTime;
    /**
     *
     * @Deprecated Stores the flight number
     */
    private String FlightNumber;
    /**
     *
     * @Deprecated Stores the price of the trip
     */
    private double tripPrice;
    /**
     *
     * @Deprecated Stores The number of booked flights departing from Riyadh
     */
    static int NumberOftripsFromRUH;
    private AirPlane airPlane;
    private boolean YesOrNo;

    //-------method ----------
    /**
     *
     * @param Company
     * @Deprecated to determine the time of departure and arrival of the
     * aircraft, according to the airline
     */
    public void periods(String Company) {
    }

    /**
     *
     * @param period
     * @Deprecated to determine the flight number and some of its
     * specifications, depending on the selected period
     */
    public String FlightNumber(int period) {
        return DepartureTime;
    }

    //-------constructor----------
    /**
     *
     */
    public Trips() {

    }

    //-------Getters methods----------
    /**
     *
     * @return FlightDuration
     */
    public String getFlightDuration() {
        return FlightDuration;
    }

    /**
     *
     * @return
     */
    public String getAirportOfDeparture() {
        return AirportOfDeparture;
    }

    /**
     *
     * @return AirportOfDestination
     */
    public String getAirportOfDestination() {
        return AirportOfDestination;
    }

    /**
     *
     * @return IATACodeOfDeparture
     */
    public String getIATACodeOfDeparture() {
        return IATACodeOfDeparture;
    }

    /**
     *
     * @return IATACodeOfDestination
     */
    public String getIATACodeOfDestination() {
        return IATACodeOfDestination;
    }

    /**
     *
     * @return DepartureTime
     */
    public String getDepartureTime() {
        return DepartureTime;
    }

    /**
     *
     * @return ArrivalTime
     */
    public String getArrivalTime() {
        return ArrivalTime;
    }

    /**
     *
     * @return airPlane
     */
    public AirPlane getAirPlaneCompany() {
        return airPlane;
    }

    /**
     *
     * @return FlightNumber
     */
    public String getFlightNumber() {
        return FlightNumber;
    }

    /**
     *
     * @return the name of the company in the airlines class
     */
    public String getAirPlane() {
        return airPlane.getCompName();
    }

    /**
     *
     * @return trip Price
     */
    public double getTripPrice() {
        return tripPrice;
    }

    /**
     *
     * @return
     */
    public boolean getYesOrNo() {
        return YesOrNo;
    }

    //-------setters methods----------
    /**
     *
     * @param FlightDuration
     */
    public void setFlightDuration(String FlightDuration) {
        this.FlightDuration = FlightDuration;
    }

    /**
     *
     * @param AirportOfDeparture
     */
    public void setAirportOfDeparture(String AirportOfDeparture) {
        this.AirportOfDeparture = AirportOfDeparture;
    }

    /**
     *
     * @param AirportOfDestination
     */
    public void setAirportOfDestination(String AirportOfDestination) {
        this.AirportOfDestination = AirportOfDestination;
    }

    /**
     *
     * @param IATACodeOfDeparture
     */
    public void setIATACodeOfDeparture(String IATACodeOfDeparture) {
        this.IATACodeOfDeparture = IATACodeOfDeparture;
    }

    /**
     *
     * @param IATACodeOfDestination
     */
    public void setIATACodeOfDestination(String IATACodeOfDestination) {
        this.IATACodeOfDestination = IATACodeOfDestination;
    }

    /**
     *
     * @param AirPlaneCompany
     */
    public void setAirPlaneCompany(AirPlane AirPlaneCompany) {
        this.airPlane = AirPlaneCompany;
    }

    /**
     *
     * @param DepartureTime
     */
    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    /**
     *
     * @param ArrivalTime
     */
    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    /**
     *
     * @param FlightNumber
     */
    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    /**
     *
     * @param tripPrice
     */
    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    /**
     *
     * @param YesOrNo
     * @Deprecated This method tests the number entered by the user and returns
     * a boolean value based on that
     */
    public void setYesOrNo(int YesOrNo) {
        if (YesOrNo == 1) {
            this.YesOrNo = true;
        } else if (YesOrNo == 2) {
            this.YesOrNo = false;
        }
    }

    public static void setNumberOftripsFromRUH(int NumberOftripsFromRUH) {
        Trips.NumberOftripsFromRUH = NumberOftripsFromRUH;
    }

    public void setAirPlane(AirPlane airPlane) {
        this.airPlane = airPlane;
    }

}
