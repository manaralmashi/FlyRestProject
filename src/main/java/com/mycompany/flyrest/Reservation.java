package com.mycompany.flyrest;


import java.util.*;

public class Reservation {

    
    //_____________________________________________________Attributes________________________________________________________
    
    private Trips trips;
    private AirPlane airPlane;
    private Calendar calendar;

    //Traveler info
    private TravelerInformation travelerInformation;
    private Name name;
    private Age age;
    private Passport passport;

    //Suggestions info
    private Suggestions suggestions;
    private RevHotel revHotel;

    private RiyadhHotels riyadhHotels;
    private KuwaitHotels kuwaitHotels;
    private ParisHotels parisHotels;
    private RomeHotels romeHotels;

    //in airplane info
    private Seats seats;
    private Baggage baggage;
    private MealsCompany mealsCompany;

    //Reservation info
    private int reservation_number;
    public String reservation_details;
    public double reservation_price;
    public double reservation_tax;

    //_____________________________________________________Constructors________________________________________________________
    
    public Reservation() {
    }

    public Reservation(Trips trips, Calendar calendar, TravelerInformation travelerInformation, Name name, Age age, Passport passport, AirPlane airPlane,
            Suggestions suggestions, RevHotel revHotel, Seats seats, Baggage baggage, MealsCompany mealsCompany) {
        this.trips = trips;
        this.calendar = calendar;
        this.travelerInformation = travelerInformation;
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.airPlane = airPlane;
        this.suggestions = suggestions;
        this.revHotel = revHotel;
        this.seats = seats;
        this.baggage = baggage;
        this.mealsCompany = mealsCompany;
    }

    //______________________________________________________Getters_________________________________________________________________
    
    //Reservation
    public String getReservation_number() {
        String m = "" + new Random(System.currentTimeMillis()).nextInt(999999999);
        return m;
    }

    public double getReservation_price(double hotelPrice) {
        reservation_price = hotelPrice;
        if (mealsCompany != null) {
            reservation_price += mealsCompany.getTotalMealPrice();
        }
        if (seats != null) {
            reservation_price += seats.getPriceOfSeats();
        }
        if (baggage != null) {
            reservation_price += baggage.getPriceOfBaggage();
        }
        if (trips != null) {
            reservation_price += trips.getTripPrice();
        }
        return reservation_price;
    }

    public double getReservation_tax(double hotelPrice) {
        this.reservation_tax = (this.getReservation_price(hotelPrice)) * 15 / 100;
        return reservation_tax;
    }

    public String getReservation_details() {
        return reservation_details;
    }

    //Trips & Airplane
    public Trips getTrips() {
        return trips;
    }

    public AirPlane getAirPlane() {
        return airPlane;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    //Traveler
    public TravelerInformation getTravelerInformation() {
        return travelerInformation;
    }

    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public Passport getPassport() {
        return passport;
    }
    
    //Suggestions
    public Suggestions getSuggestions() {
        return suggestions;
    }

    public RevHotel getRevHotel() {
        return revHotel;
    }

    public RiyadhHotels getRiyadhHotels() {
        return riyadhHotels;
    }

    public KuwaitHotels getKuwaitHotels() {
        return kuwaitHotels;
    }

    public ParisHotels getParisHotels() {
        return parisHotels;
    }

    public RomeHotels getRomeHotels() {
        return romeHotels;
    }
    
    //Airplane info
    public Seats getSeats() {
        return seats;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public MealsCompany getMealsCompany() {
        return mealsCompany;
    }
    

    //________________________________________________________Setters____________________________________________________________________
    

    //Reservation
    public void setReservation_tax(double reservation_tax) {
        this.reservation_tax = reservation_tax;
    }
    
    public void setReservation_number(int reservation_number) {    
        this.reservation_number = reservation_number;
    }

    public void setReservation_price(double reservation_price) {
        this.reservation_price = reservation_price;
    }

    //Trips & Airplane
    public void setTrips(Trips trips) {
        this.trips = trips;
    }

    public void setAirPlane(AirPlane airPlane) {
        this.airPlane = airPlane;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
    
    //Traveler
    public void setTravelerInformation(TravelerInformation travelerInformation) {    
        this.travelerInformation = travelerInformation;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setAge(Age age) {
        this.age = age;
    }
    
    public void setPassport(Passport passport) {    
        this.passport = passport;
    }
    
    //Suggestions
    public void setSuggestions(Suggestions suggestions) {
        this.suggestions = suggestions;
    }
    
    public void setRevHotel(RevHotel revHotel) {    
        this.revHotel = revHotel;
    }

    public void setRUH_Hotels(RiyadhHotels riyadhHotels) {
        this.riyadhHotels = riyadhHotels;
    }

    public void setKWI_Hotels(KuwaitHotels kuwaitHotels) {
        this.kuwaitHotels = kuwaitHotels;
    }

    public void setFCO_Hotels(ParisHotels parisHotels) {
        this.parisHotels = parisHotels;
    }

    public void setCDG_Hotels(RomeHotels romeHotels) {
        this.romeHotels = romeHotels;
    }

    //Airplane info
    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public void setMealsCompany(MealsCompany mealsCompany) {
        this.mealsCompany = mealsCompany;
    }
    
    
    
    //________________________________________________________Methods____________________________________________________________________
    
    
    public void reservation_details() {
        System.out.println("\n_______________________________________[  R E S E R V A T I O N   D E T A I L S ]________________________________________________\n"
                + "\n* You can make any adjustments to the date or time of the flight 3 hours before the departure time."
                + "\n* We would like to remind you that if you do not travel, the reservation will be CANCELED and no refund will be made."
                + "\n* To change the time and day of the booked flight, please CALL 0553245893. Additional fees and any additions to "
                + "\n  the price difference will apply if the flight date is changed."
                + "\n* It is NOT allowed to change the name of the passenger");
    }

//    public void print_reservation() {
//
//        System.out.println("   ___________________________________________________________________________________________   ");
//        System.out.println("  /                                                                                           \\  ");
//        System.out.println(" /                    (  R  E  S  E  R  V  A  T  I  O  N      I  N  F  O  )                    \\");
//        System.out.println("|                                                                                               |");
//        System.out.println("|                                                                                               |");
//        System.out.println("| ------------------------------------[   TRIP INFORMATION  ]-----------------------------------|");
//        System.out.println("|                                                                                               ");
//        System.out.println("|                  ( Departure )              =====>            ( Destination )                 ");
//        System.out.println("|                                                                                               ");
//        System.out.println("|       " + trips.getAirportOfDeparture() + "              " + trips.getAirportOfDestination() + "         ");
//        System.out.println("|                   (" + trips.getIATACodeOfDeparture() + ")                                    (" + trips.getIATACodeOfDestination() + ")                    ");
//        System.out.println("|              " + trips.getDepartureTime() + "                                       " + trips.getArrivalTime() + "                                          ");
//        System.out.println("|                                                                                               ");
//        System.out.println("|    - Airplane Company : " + trips.getAirPlane() + "                                                                  ");
//        System.out.println("|    - Flight Number    : " + (airPlane.getSymbol() + trips.getFlightNumber()) + "                                                                  ");
//        System.out.println("|    - Flight Date      : " + calendar.getDay() + "                                                           ");
//        System.out.println("|    - Flight Duration  : " + trips.getFlightDuration() + "                                                                                     ");
//        System.out.println("|                                                                                               ");
//        System.out.println("| ------------------------------------[PASSENGER INFORMATION]-----------------------------------|");
//        System.out.println("|                                                                                               ");
//        System.out.println("|    - Full Name        : " + name.getFname() + " " + name.getMname() + " " + name.getLname() + "                ");
//        System.out.println("|    - The Gender       : " + travelerInformation.getGender() + "                |");
//        System.out.println("|    - Date of birth    : " + age.getDay() + "/" + age.getMonth() + "/" + age.getYear() + "                                                                         |");
//        System.out.println("|    - E-mail Address   : " + travelerInformation.getEmail() + "                                                                             ");
//        System.out.println("|    - Mobilr number    : " + travelerInformation.getPhoneNumber() + "                                       ");
//        System.out.println("|    - City             : " + travelerInformation.getCity() + "                                                ");
//        System.out.println("|    - Passport         : " + passport.getPassport() + "                                                      ");
//        System.out.println("|                                                                                               ");
//        System.out.println("|                                                                                               ");
//        System.out.println("| -----------------------------------[RESERVATION INFORMATION]----------------------------------|");
//        System.out.println("|                                                                                               ");
//        System.out.println("|    - Reservation Number : " + getReservation_number() + "                                                                                           |");
//        System.out.println("|    - Reservation Date   : " + calendar.getDateOfReservation() + "                                                          |");
//        System.out.println("|                                                                                               ");
//        System.out.println("|                                                                                               ");
//        System.out.println("|    * Seat\\                                                                                   ");
//        System.out.println("|    - Grade of Seat      : " + seats.getSeatGrade() + "                                                    ");
//        System.out.println("|    - Number of Seat     : " + seats.getSeatNumber() + "                                                  ");
//        System.out.println("|                                                                                               ");
//        if (baggage.getWantOrNot()) {
//            System.out.println("|    * Baggage\\                                                                                ");
//            System.out.println("|    - Type of Baggage    : " + baggage.getTypeOfBaggage_S() + "                                                      ");
//            System.out.println("|    - Number of " + baggage.getTypeOfBaggage_S() + " : " + baggage.getNumberOfBaggage() + " bags                                                  ");
//            System.out.println("|                                                                                               ");
//        }
//        if (trips.getYesOrNo()) {
//            System.out.println("|    * Meals\\                                                                                ");
//            System.out.println("|    - Price of Meals     : " + ((double) mealsCompany.getTotalMealPrice()) + " SR                                                     ");
//            System.out.println("|                                                                                                 ");
//        }
//        if (suggestions.isNeedOrnot()) {
//            if (this.riyadhHotels != null) {
//                System.out.println("|    * Hotel\\                                                                                   ");
//                System.out.println("|    - Name of Hotel      : " + riyadhHotels.getHotelName() + "                                                    ");
//                System.out.println("|    - Number of Room     : " + riyadhHotels.getRoomNum() + "                                                    ");
//                System.out.println("|    - Location of Hotel  : " + riyadhHotels.getHotelLocation() + "                                                  ");
//            }
//            if (this.kuwaitHotels != null) {
//                System.out.println("|    * Hotel\\                                                                                   |");
//                System.out.println("|    - Name of Hotel      : " + kuwaitHotels.getHotelName() + "                                                    ");
//                System.out.println("|    - Number of Room     : " + kuwaitHotels.getRoomNum() + "                                                    ");
//                System.out.println("|    - Location of Hotel  : " + kuwaitHotels.getHotelLocation() + "                                                  ");
//            }
//            if (this.parisHotels != null) {
//                System.out.println("|    * Hotel\\                                                                                   ");
//                System.out.println("|    - Name of Hotel      : " + parisHotels.getHotelName() + "                                                    ");
//                System.out.println("|    - Number of Room     : " + parisHotels.getRoomNum() + "                                                    ");
//                System.out.println("|    - Location of Hotel  : " + parisHotels.getHotelLocation() + "                                                  ");
//            }
//            if (this.romeHotels != null) {
//                System.out.println("|    * Hotel\\                                                                                   ");
//                System.out.println("|    - Name of Hotel      : " + romeHotels.getHotelName() + "                                                    ");
//                System.out.println("|    - Number of Room     : " + romeHotels.getRoomNum() + "                                                    ");
//                System.out.println("|    - Location of Hotel  : " + romeHotels.getHotelLocation() + "                                                  ");
//            }
//        }
//        System.out.println("|                                                                                               ");
//        System.out.println("| -----------------------------------[     PRICE  DETAILS    ]----------------------------------|");
//        System.out.println("|                                                                                               ");
//        System.out.println("|    - Trip price     : " + trips.getTripPrice() + " SR                                                                                          ");
//        System.out.println("|    - Seat price     : " + seats.getPriceOfSeats() + " SR                                                                                          ");
//        if (baggage.getWantOrNot() && baggage != null) {
//            System.out.println("|    - Baggage price  : " + baggage.getPriceOfBaggage() + " SR                                                     ");
//        }
//        if (trips.getYesOrNo() && mealsCompany != null) {
//            System.out.println("|    - Meals price    : " + ((double) mealsCompany.getTotalMealPrice()) + " SR                                                     ");
//        }
//        if (suggestions.isNeedOrnot()) {
//            if (this.riyadhHotels != null) {
//                System.out.println("|    - Hotel price    : " + riyadhHotels.getHotelPrice() + " SR                                                                                          ");
//                System.out.println("|    - Tax price (%)  : " + this.getReservation_tax(riyadhHotels.getHotelPrice()));
//            }
//            if (this.kuwaitHotels != null) {
//                System.out.println("|    - Hotel price    : " + kuwaitHotels.getHotelPrice() + " SR                                                                                          ");
//                System.out.println("|    - Tax price (%)  : " + this.getReservation_tax(kuwaitHotels.getHotelPrice()));
//            }
//            if (this.parisHotels != null) {
//                System.out.println("|    - Hotel price    : " + parisHotels.getHotelPrice() + " SR                                                                                          ");
//                System.out.println("|    - Tax price (%)  : " + this.getReservation_tax(parisHotels.getHotelPrice()));
//            }
//            if (this.romeHotels != null) {
//                System.out.println("|    - Hotel price    : " + romeHotels.getHotelPrice() + " SR                                                                                          ");
//                System.out.println("|    - Tax price (%)  : " + this.getReservation_tax(romeHotels.getHotelPrice()));
//            }
//        }
//        System.out.println("|                                                                                               ");
//        System.out.println("|    - TOTAL PRICE of reservation : " + (reservation_tax + reservation_price) + " SR                                          ");
//        System.out.println("|                                                                                               ");
//        System.out.println("|                                                                                               |");
//        System.out.println("\\                                                                                               /");
//        System.out.println(" \\_____________________________________________________________________________________________/ ");
//    }
    public void print_reservation() {
        
        System.out.println("   ___________________________________________________________________________________________   ");
        System.out.println("  /                                                                                           \\  ");
        System.out.println(" /                    (  R  E  S  E  R  V  A  T  I  O  N      I  N  F  O  )                    \\");
        System.out.println("|                                                                                               |");
        System.out.println("|                                                                                               |");
        System.out.println("| ------------------------------------[   TRIP INFORMATION  ]-----------------------------------|");
        System.out.println("|                                                                                               |");
        System.out.println("|                  ( Departure )              =====>            ( Destination )                 |");
        System.out.println("|                                                                                               |");
        System.out.print("|            "+trips.getAirportOfDeparture());
        LengthRec("|            "+trips.getAirportOfDeparture(),56);
        System.out.print(trips.getAirportOfDestination());
        LengthRec(trips.getAirportOfDestination(),39);
        System.out.print("|");
        System.out.println();
        System.out.print("|                     ("+trips.getIATACodeOfDeparture());
        System.out.print(")");
        LengthRec("|                     (("+")"+trips.getIATACodeOfDeparture(),67);
        System.out.print("("+trips.getIATACodeOfDestination());
        System.out.print(")");
        LengthRec("("+trips.getIATACodeOfDestination(),27);
        System.out.print("|");
        System.out.println();
        System.out.print("|                      "+trips.getDepartureTime());
        LengthRec("|                       "+trips.getDepartureTime(),68);
        System.out.print(trips.getArrivalTime());
        LengthRec(trips.getArrivalTime(),27);
        System.out.println("|");
        System.out.println("|                                                                                               |");
        System.out.print("|    - Airplane Company : "+trips.getAirPlane());
        LengthRec("|    - Airplane Company : "+trips.getAirPlane(),95);
        System.out.println("|");
        System.out.print("|    - Flight Number    : "+(airPlane.getSymbol()+trips.getFlightNumber()));
        LengthRec("|    - Flight Number    : "+(airPlane.getSymbol()+trips.getFlightNumber()),95);
        System.out.println("|");
        System.out.print("|    - Flight Date      : "+calendar.getDay());
        LengthRec("|    - Flight Date      : "+calendar.getDay(),95);
        System.out.println("|");
        System.out.print("|    - Flight Duration  : "+trips.getFlightDuration());
        LengthRec("|    - Flight Duration  : "+trips.getFlightDuration(),95);
        System.out.println("|");
        System.out.println("|                                                                                               |");
        System.out.println("| ------------------------------------[PASSENGER INFORMATION]-----------------------------------|");
        System.out.println("|                                                                                               |");
        System.out.print("|    - Full Name        : "+name.getFname() +" "+ name.getMname() +" "+ name.getLname());
        LengthRec("|    - Full Name        : "+ name.getFname() +" "+ name.getMname() +" "+ name.getLname(),95);
        System.out.println("|");
        System.out.print("|    - The Gender       : " + travelerInformation.getGender());
        LengthRec("|    - The Gender       : " + travelerInformation.getGender(),95);
        System.out.println("|");
        System.out.print("|    - Date of birth    : " + age.getDay() + "/" + age.getMonth() + "/" + age.getYear());
        LengthRec("|    - Date of birth    : " + age.getDay() + "/" + age.getMonth() + "/" + age.getYear(),95);
        System.out.println("|");
        System.out.print("|    - E-mail Address   :"+travelerInformation.getEmail());
        LengthRec("|    - E-mail Address   :"+travelerInformation.getEmail(),95);
        System.out.println("|");
        System.out.print("|    - Mobilr number    :"+ travelerInformation.getPhoneNumber());
        LengthRec("|    - Mobilr number    :"+ travelerInformation.getPhoneNumber(),95);
        System.out.println("|");
        System.out.print("|    - City             :"+ travelerInformation.getCity());
        LengthRec("|    - City             :"+ travelerInformation.getCity(),95);
        System.out.println("|");
        System.out.print("|    - Passport         : " + passport.getPassport());
        LengthRec("|    - Passport         : " + passport.getPassport(),95);
        System.out.println("|");
        System.out.println("|                                                                                               |");
        System.out.println("|                                                                                               |");
        System.out.println("| -----------------------------------[RESERVATION INFORMATION]----------------------------------|");
        System.out.println("|                                                                                               |");
        System.out.print("|    - Reservation Number : "+ getReservation_number());
        LengthRec("|    - Reservation Number : "+ getReservation_number(),95);
        System.out.println("|");   
        System.out.print("|    - Reservation Date   : "+ calendar.getDateOfReservation() );
        LengthRec("|    - Reservation Date   : "+ calendar.getDateOfReservation() ,95);
        System.out.println("|"); 
        System.out.println("|                                                                                               |");
        System.out.println("|                                                                                               |");
        System.out.println("|    * Seat\\                                                                                   |");
        System.out.print("|    - Grade of Seat      : "+seats.getSeatGrade());
        LengthRec("|    - Grade of Seat      : "+seats.getSeatGrade() ,95);
        System.out.println("|");
        System.out.print("|    - Number of Seat     : "+seats.getSeatNumber());
        LengthRec("|    - Number of Seat     : "+seats.getSeatNumber() ,95);
        System.out.println("|");
        System.out.println("|                                                                                               |");
        // ------------------------------------------------------------------------------------------
        if (baggage.getWantOrNot()) {
        System.out.println("|    * Baggage\\                                                                                |");
        System.out.print("|    - Type of Baggage    : "+baggage.getTypeOfBaggage_S());
        LengthRec("|    - Type of Baggage    : "+baggage.getTypeOfBaggage_S(),96);
        System.out.println("|");
        System.out.print("|    - Number of "+baggage.getTypeOfBaggage_S()+" : "+baggage.getNumberOfBaggage()+" bags");
        LengthRec("|    - Number of "+baggage.getTypeOfBaggage_S()+" : "+baggage.getNumberOfBaggage()+" bags",95);
        System.out.println("|");
        System.out.println("|                                                                                               |");
        }
        if (trips.getYesOrNo()) {
        System.out.println("|    * Meals\\                                                                                  |");
        System.out.print("|    - Price of Meals     : "+((double) mealsCompany.getTotalMealPrice()));
        LengthRec("|    - Price of Meals     : "+((double) mealsCompany.getTotalMealPrice()),98);
        System.out.println("|");
        System.out.println("|                                                                                               |");
        }
        if (suggestions.isNeedOrnot()) {
            if (this.riyadhHotels != null){
                System.out.println("|    * Hotel\\                                                                                  |");
                System.out.print("|    - Name of Hotel      : "+riyadhHotels.getHotelName());
                LengthRec("|    - Name of Hotel      : "+riyadhHotels.getHotelName(),95);
                System.out.println("|");
                System.out.print("|    - Number of Room     : "+riyadhHotels.getRoomNum());
                LengthRec("|    - Number of Room     : "+riyadhHotels.getRoomNum(),95);
                System.out.println("|");
                System.out.print("|    - Location of Hotel  : "+riyadhHotels.getHotelLocation());
                LengthRec("|    - Location of Hotel  : "+riyadhHotels.getHotelLocation(),95);
                System.out.println("|");
            }
            if (this.kuwaitHotels != null){
                System.out.println("|    * Hotel\\                                                                                  |");
                System.out.print("|    - Name of Hotel      : "+kuwaitHotels.getHotelName());
                LengthRec("|    - Name of Hotel      : "+kuwaitHotels.getHotelName(),95);
                System.out.println("|");
                System.out.print("|    - Number of Room     : "+kuwaitHotels.getRoomNum());
                LengthRec("|    - Number of Room     : "+kuwaitHotels.getRoomNum(),95);
                System.out.println("|");
                System.out.print("|    - Location of Hotel  : "+kuwaitHotels.getHotelLocation());
                LengthRec("|    - Location of Hotel  : "+kuwaitHotels.getHotelLocation(),95);
                System.out.println("|");
            }
            if (this.parisHotels != null){
                System.out.println("|    * Hotel\\                                                                                   |");
                System.out.print("|    - Name of Hotel      : "+parisHotels.getHotelName());
                 LengthRec("|    - Name of Hotel      : "+parisHotels.getHotelName(),95);
                System.out.println("|");
                System.out.print("|    - Number of Room     : "+parisHotels.getRoomNum());
                 LengthRec("|    - Number of Room     : "+parisHotels.getRoomNum(),95);
                System.out.println("|");
                System.out.print("|    - Location of Hotel  : "+parisHotels.getHotelLocation());
                LengthRec("|    - Location of Hotel  : "+parisHotels.getHotelLocation(),95);
                System.out.println("|");
            }
            if (this.romeHotels != null){
                System.out.println("|    * Hotel\\                                                                                   |");
                System.out.print("|    - Name of Hotel      : "+romeHotels.getHotelName());
                LengthRec("|    - Name of Hotel      : "+romeHotels.getHotelName(),95);
                System.out.println("|");
                System.out.print("|    - Number of Room     : "+romeHotels.getRoomNum());
                LengthRec("|    - Number of Room     : "+romeHotels.getRoomNum(),95);
                System.out.println("|");
                System.out.print("|    - Location of Hotel  : "+romeHotels.getHotelLocation());
                 LengthRec("|    - Location of Hotel  : "+romeHotels.getHotelLocation(),95);
                System.out.println("|");
            }
        }
        //----------------------------------------------------------------------------------------
        System.out.println("|                                                                                               |");
        System.out.println("| -----------------------------------[     PRICE  DETAILS    ]----------------------------------|");
        System.out.println("|                                                                                               |");
        System.out.print("|    - Trip price     : "+ trips.getTripPrice() +" SR");   
        LengthRec("|    - Trip price     : "+ trips.getTripPrice() +" SR" ,95);
        System.out.println("|");
        System.out.print("|    - Seat price     : "+ seats.getPriceOfSeats() +" SR");
         LengthRec("|    - Seat price     : "+ seats.getPriceOfSeats() +" SR" ,95);
        System.out.println("|");
        //--------------------------------------------------------------
        if (baggage.getWantOrNot() && baggage != null) {
        System.out.print("|    - Baggage price  : "+baggage.getPriceOfBaggage()+" SR");
        LengthRec("|    - Baggage price  : "+baggage.getPriceOfBaggage()+" SR",95);
        System.out.println("|");
        }
        if (trips.getYesOrNo() && mealsCompany != null) {
            System.out.print("|    - Meals price    : "+((double) mealsCompany.getTotalMealPrice())+" SR");
            LengthRec("|    - Meals price    : "+((double) mealsCompany.getTotalMealPrice())+" SR",95);
            System.out.println("|");
        }
        if (suggestions.isNeedOrnot()) {
            if (this.riyadhHotels != null){
                System.out.print("|    - Hotel price    : "+ riyadhHotels.getHotelPrice() +" SR");
            LengthRec("|    - Hotel price    : "+ riyadhHotels.getHotelPrice() +" SR",95);
            System.out.println("|");
            System.out.print("|    - Tax price (%)  : "+ this.getReservation_tax(riyadhHotels.getHotelPrice()));
            LengthRec("|    - Tax price (%)  : "+ this.getReservation_tax(riyadhHotels.getHotelPrice()),95);
            System.out.println("|");
            }
            if (this.kuwaitHotels != null){
                System.out.print("|    - Hotel price    : "+ kuwaitHotels.getHotelPrice() +" SR");
                LengthRec("|    - Hotel price    : "+ kuwaitHotels.getHotelPrice() +" SR",95);
                System.out.println("|");
                System.out.print("|    - Tax price (%)  : "+ this.getReservation_tax(kuwaitHotels.getHotelPrice()));
                LengthRec("|    - Tax price (%)  : "+ this.getReservation_tax(kuwaitHotels.getHotelPrice()),95);
                System.out.println("|");
            }
            if (this.parisHotels != null){
                System.out.print("|    - Hotel price    : "+ parisHotels.getHotelPrice() +" SR");
                 LengthRec("|    - Hotel price    : "+ parisHotels.getHotelPrice() +" SR",95);
                System.out.println("|");
                System.out.print("|    - Tax price (%)  : "+ this.getReservation_tax(parisHotels.getHotelPrice()));
                LengthRec("|    - Tax price (%)  : "+ this.getReservation_tax(parisHotels.getHotelPrice()),95);
                System.out.println("|");
            }
            if (this.romeHotels != null){
                System.out.print("|    - Hotel price    : "+ romeHotels.getHotelPrice() +" SR");
                LengthRec("|    - Hotel price    : "+ romeHotels.getHotelPrice() +" SR",95);
                System.out.println("|");
                System.out.print("|    - Tax price (%)  : "+ this.getReservation_tax(romeHotels.getHotelPrice()));
                LengthRec("|    - Tax price (%)  : "+ this.getReservation_tax(romeHotels.getHotelPrice()),95);
                System.out.println("|");
            }
        }
        //----------------------------------------------------------------
        System.out.println("|                                                                                               |");
        System.out.print("|    - TOTAL PRICE of reservation : "+ (reservation_tax + reservation_price));
         LengthRec("|    - TOTAL PRICE of reservation : "+ (reservation_tax + reservation_price),95);
        System.out.println("|");
        System.out.println("|                                                                                               |");
        System.out.println("|                                                                                               |");
        System.out.println("\\                                                                                               /");
        System.out.println(" \\_____________________________________________________________________________________________/ ");
}
     private static void LengthRec(String a, int b){//  to maintain the rectangular shape on the output console in the following methos 
       String c=" ";
       for (int j = a.length(); j < b; j++) {
       c +=" ";
       } 
       System.out.print(c);
   }
}
