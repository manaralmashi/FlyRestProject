package com.mycompany.flyrest;

/**
 *
 * @author Sarah
 */
public class RomeHotels extends bookHotel {

    //attributes
    private static final int[] Savoy_Roma = new int[100];
    static int SRhotel = 0; //counter 
    private static final int[] Cilicia = new int[100];
    static int Chotel = 0; //counter   
    private static final int[] Hotel_Colosseum = new int[100];
    static int HChotel = 0; //counter

    //constructor
    public RomeHotels() {
        int i;
        for (i = 0; i < 100; i++) {
            Savoy_Roma[i] = i + 1;
            Cilicia[i] = i + 1;
            Hotel_Colosseum[i] = i + 1;
        }//End for
    }//End constructor

    //methods
    public int bookCityHotel(int hotel) {
        switch (hotel) {
            case 1:
                if (SRhotel < Savoy_Roma.length) {
                    roomNum = Savoy_Roma[SRhotel];
                    //setHotelPrice("684SR ($182.30)");
                    setHotelPrice(684);
                    setHotelName("Savoy Roma");                    
                    setHotelLocation("Via Ludovisi 15, 00187 Roma RM, Italy");
                    SRhotel++;

                } else {
                    System.out.println("Sorry, there is no available rooms in Savoy Roma hotel");
                }
                break;

            case 2:
                if (Chotel < Cilicia.length) {
                    roomNum = Cilicia[Chotel];
                    //setHotelPrice("280SR ($74.62)");
                    setHotelPrice(280);                    
                    setHotelName("Cilicia");
                    setHotelLocation("Via Cilicia 7, 00179 Roma RM, Italy");
                    Chotel++;
                } else {
                    System.out.println("Sorry, there is no available rooms in Cilicia hotel");
                }
                break;

            case 3:
                if (HChotel < Hotel_Colosseum.length) {
                    roomNum = Hotel_Colosseum[HChotel];
                    //setHotelPrice("769SR ($204.95)");
                    setHotelPrice(769);
                    setHotelName("Hotel Colosseum");                  
                    setHotelLocation("Via Sforza 10, 00184 Roma RM, Italy");
                    HChotel++;
                } else {
                    System.out.println("Sorry, there is no available rooms in Hotel Colosseum hotel");
                }
                break;
        }//End switch
        return roomNum;
    } //End method

}//End class


