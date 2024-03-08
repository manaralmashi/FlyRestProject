package com.mycompany.flyrest;
/**
 *
 * @author Sarah
 */
public class KuwaitHotels extends bookHotel {

    //attributes
    private static final int[] Marina_Royal = new int[100];
    static int MRhotel = 0; //counter 
    private static final int[] Hilton_Garden_Inn = new int[100];
    static int HGhotel = 0; //counter   
    private static final int[] Four_Seasons = new int[100];
    static int FShotel = 0; //counter

    //constructor
    public KuwaitHotels() {
        int i;
        for (i = 0; i < 100; i++) {
            Marina_Royal[i] = i + 1;
            Hilton_Garden_Inn[i] = i + 1;
            Four_Seasons[i] = i + 1;
        }//End for
    }//End constructor

    //methods
    public int bookCityHotel(int hotel) {
        switch (hotel) {
            case 1:
                if (MRhotel < Marina_Royal.length) {
                    roomNum = Marina_Royal[MRhotel];
                    //setHotelPrice("245SR ($65.30)");
                    setHotelPrice(245);      
                    setHotelName("Marina Royal");                   
                    setHotelLocation("77 Salmiya, 22007, Kuwait");
                    MRhotel++;

                } else {
                    System.out.println("Sorry, there is no available rooms in Marina Royal hotel");
                }
                break;

            case 2:
                if (HGhotel < Hilton_Garden_Inn.length) {
                    roomNum = Hilton_Garden_Inn[HGhotel];
                    //setHotelPrice("905SR ($241.20)");
                    setHotelPrice(905);             
                    setHotelName("Hilton Garden Inn");
                    setHotelLocation("Mutlaq Abbas Munawer Street, Kuwait City, Kuwait");
                    HGhotel++;
                } else {
                    System.out.println("Sorry, there is no available rooms in Hilton Garden Inn hotel");
                }
                break;

            case 3:
                if (FShotel < Four_Seasons.length) {
                    roomNum = Four_Seasons[FShotel];
                    //setHotelPrice("1,473SR ($392.59)");   //1,482SR ($394.98)
                    setHotelPrice(1473);   //1,482SR ($394.98)
                    setHotelName("Four Seasons");
                    setHotelLocation("Al Soor Street, Kuwait City, Kuwait");
                    FShotel++;
                } else {
                    System.out.println("Sorry, there is no available rooms in Four Seasons hotel");
                }
                break;
        }//End switch
        return roomNum;
    } //End method

}//End class