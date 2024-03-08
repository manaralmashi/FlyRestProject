package com.mycompany.flyrest;

/**
 *
 * @author Sarah
 */
public abstract class bookHotel {

    //attributes
    //protected String HotelPrice;
    protected double HotelPrice;
    protected int roomNum; //to store the booked room number
    protected String hotelName;
    protected String hotelLocation;

    //method
    public abstract int bookCityHotel(int hotel);

    //get&et
    public double getHotelPrice() {
        return HotelPrice;
    }

    public void setHotelPrice(double HotelPrice) {
        this.HotelPrice = HotelPrice;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

}//End class
