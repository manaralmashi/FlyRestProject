package com.mycompany.flyrest;

/**
 *
 * @author Sarah
 */
public class ParisHotels extends bookHotel {

    //attributes
    private static final int[] Le_metropolitan = new int[100];
    static int LEhotel = 0; //counter 
    private static final int[] Magda_Champs_Elysees = new int[100];
    static int MCEhotel = 0; //counter   
    private static final int[] Chalgrin_Boutique = new int[100];
    static int CBhotel = 0; //counter

    //constructor
    public ParisHotels() {
        int i;
        for (i = 0; i < 100; i++) {
            Le_metropolitan[i] = i + 1;
            Magda_Champs_Elysees[i] = i + 1;
            Chalgrin_Boutique[i] = i + 1;
        }//End for
    }//End constructor

    //methods
    public int bookCityHotel(int hotel) {
        switch (hotel) {
            case 1:
                if (LEhotel < Le_metropolitan.length) {
                    roomNum = Le_metropolitan[LEhotel];
                    //setHotelPrice("1,812.0SR ($482.92)");  //1733SR ($461.87)
                    setHotelPrice(1812);  
                    setHotelName("Le metropolitan");
                    setHotelLocation("10 pl. de Mexico, 75116 Paris, France");
                    LEhotel++;

                } else {
                    System.out.println("Sorry, there is no available rooms in Le metropolitan hotel");
                }
                break;

            case 2:
                if (MCEhotel < Magda_Champs_Elysees.length) {
                    roomNum = Magda_Champs_Elysees[MCEhotel];
                    //setHotelPrice("530SR ($141.25)");
                    setHotelPrice(530);      
                    setHotelName("Magda Champs Elysees");                   
                    setHotelLocation("7 Rue Troyon, 75017 Paris, France");
                    MCEhotel++;
                } else {
                    System.out.println("Sorry, there is no available rooms in Magda Champs Elysees hotel");
                }
                break;

            case 3:
                if (CBhotel < Chalgrin_Boutique.length) {
                    roomNum = Chalgrin_Boutique[CBhotel];
                    //setHotelPrice("940.0SR ($250.53)");
                    setHotelPrice(940);
                    setHotelName("Chalgrin Boutique");                    
                    setHotelLocation("1 Rue d'Argentine, 75116 Paris, France");
                    CBhotel++;
                } else {
                    System.out.println("Sorry, there is no available rooms in Chalgrin Boutique hotel");
                }
                break;
        }//End switch
        return roomNum;
    } //End method

}//End class

