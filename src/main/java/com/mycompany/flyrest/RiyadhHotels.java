package com.mycompany.flyrest;

/**
 *
 * @author Sarah
 */
public class RiyadhHotels extends bookHotel {

    //attributes
    protected static final int[] Centro_Waha = new int[100];
    static int CHhotel = 0; //counter 
    protected static final int[] Hilton = new int[100];
    static int Hhotel = 0; //counter
    protected static final int[] Marriott = new int[100];
    static int Mhotel = 0; //counter

    //constructor
    public RiyadhHotels() {
        int i;
        for (i = 0; i < 100; i++) {
            Centro_Waha[i] = i + 1;
            Hilton[i] = i + 1;
            Marriott[i] = i + 1;
        }//End for
    }//End constructor

    //methods
    public int bookCityHotel(int hotel) {
        switch (hotel) {
            case 1:
                if (CHhotel < Centro_Waha.length) {
                    roomNum = Centro_Waha[CHhotel];
                    //setHotelPrice("411SR ($109.54)");
                    setHotelPrice(411);
                    setHotelName("Centro Waha");
                    setHotelLocation("Olaya Street, Al Muruj, Riyadh 11564");
                    CHhotel++;

                } else {
                    System.out.println("Sorry, there is no available rooms in Centro Waha hotel");
                }
                break;

            case 2:
                if (Hhotel < Hilton.length) {
                    roomNum = Hilton[Hhotel];
                    //setHotelPrice("826SR ($220.14)");
                    setHotelPrice(826);                    
                    setHotelName("Hilton");                   
                    setHotelLocation("6623 Eastern Ring Road, Granada, Riyadh 13241");
                    Hhotel++;
                } else {
                    System.out.println("Sorry, there is no available rooms in Hilton hotel");
                }
                break;

            case 3:
                if (Mhotel < Marriott.length) {
                    roomNum = Marriott[Mhotel];
                    //setHotelPrice("599SR ($159.64)");
                    setHotelPrice(599);    
                    setHotelName("Marriott");                    
                    setHotelLocation("District 8333 King Saud Road, Ministries, Riyadh 12622");
                    Mhotel++;
                } else {
                    System.out.println("Sorry, there is no available rooms in Marriott hotel");
                }
                break;
        }//End switch
        return roomNum;
    } //End method

}//End class

