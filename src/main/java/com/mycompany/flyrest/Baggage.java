package com.mycompany.flyrest;
public class Baggage {

    private boolean wantOrNot;
    private int numberOfBaggage;
    private double[] weightOfBaggage;
    private double[] sizeOfBaggage;
    private String typeOfBaggage_S;
    private int typeOfBaggage_I;
    private double priceOfBaggage;

    private Trips trips;
    private Seats seats;

    public Baggage() {
    }

    public Baggage(Trips trips, Seats seats) {
        this.trips = trips;
        this.seats = seats;
    }

    public Baggage(int numberOfBaggage) {
        this.numberOfBaggage = numberOfBaggage;
    }

    public Baggage(int numberOfBaggage, double[] weightOfBaggage) {
        this.numberOfBaggage = numberOfBaggage;
        this.weightOfBaggage = weightOfBaggage;
    }

    //wantOrNot
    public boolean getWantOrNot() {
        return wantOrNot;
    }

    public void setWantOrNot(int wantOrNot) {
        switch (wantOrNot) {
            case 1 -> // Yes
                this.wantOrNot = true;
            case 2 -> // No
                this.wantOrNot = false;
        }
    }

    //numberOfBaggage
    public int getNumberOfBaggage() {
        return numberOfBaggage;
    }

    public void setNumberOfBaggage(int numberOfBaggage) {
        this.numberOfBaggage = numberOfBaggage;
    }

    //weightOfBaggage
    public double[] getWeightOfBaggage() {
        return weightOfBaggage;
    }

    public void setWeightOfBaggage(double[] weightOfBaggage) {
        this.weightOfBaggage = weightOfBaggage;
    }

    //sizeOfBaggage
    public double[] getSizeOfBaggage() {
        return sizeOfBaggage;
    }

    public void setSizeOfBaggage(double[] sizeOfBaggage) {
        this.sizeOfBaggage = sizeOfBaggage;
    }

    //typeOfBaggage_S
    public String getTypeOfBaggage_S() {
        return typeOfBaggage_S;
    }

    public void setTypeOfBaggage_S(int usertypeOfBaggage) {
        switch (usertypeOfBaggage) {
            case 1:
                typeOfBaggage_S = "Carry-on baggage";
                break;
            case 2:
                typeOfBaggage_S = "Checked-in baggage";
                break;
        }
    }

    //typeOfBaggage_I
    public int getTypeOfBaggage_I() {
        return typeOfBaggage_I;
    }

    public void setTypeOfBaggage_I(int typeOfBaggage_I) {
        this.typeOfBaggage_I = typeOfBaggage_I;
    }

    //priceOfBaggage
    public double getPriceOfBaggage() {
        return priceOfBaggage;
    }

    public void setPriceOfBaggage(double[] weightOfBaggage, int usertypeOfBaggage_I) {

        //int usertypeOfBaggage_I : (1- Carry-on), (2- Checked-in)
        
        for (int i = 0, total = 0; i < weightOfBaggage.length; i++) {
            switch (trips.getAirPlane()) {

                case "Saudi Arabian Airlines":
                    switch (usertypeOfBaggage_I) {

                        case 1://Carry-on
                            if (seats.getSeatGrade() == "Economy grade") {

                                if (weightOfBaggage[i] > 7.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 7.0) * 5 / 1;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }

                            } else { //First or Business grade
                                if (weightOfBaggage[i] > 9.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 9.0) * 2 / 1;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }
                            }
                            break;

                        case 2://Checked-in
                            if (seats.getSeatGrade() == "Economy grade") {

                                if (weightOfBaggage[i] > 23.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 23.0) * 200 / 25;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }

                            } else { //First or Business grade
                                if (weightOfBaggage[i] > 32.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 9.0) * 150 / 25;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }
                                priceOfBaggage = weightOfBaggage[i] * 150 / 25;
                                total += priceOfBaggage;
                            }
                            break;
                    }
                    break;

                case "Flynas":
                    switch (usertypeOfBaggage_I) {
                        case 1://Carry-on
                            if (seats.getSeatGrade() == "Economy grade") {

                                if (weightOfBaggage[i] > 7.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 7.0) * 5 / 1;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }

                            } else { //First or Business grade
                                if (weightOfBaggage[i] > 9.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 9.0) * 2 / 1;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }
                            }
                            break;

                        case 2://Checked-in
                            if (seats.getSeatGrade() == "Economy grade") {

                                if (weightOfBaggage[i] > 23.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 23.0) * 300 / 25;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }

                            } else { //First or Business grade
                                if (weightOfBaggage[i] > 32.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 9.0) * 220 / 15;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }
                            }
                            break;
                    }
                    break;

                case "Flyadeal":
                    switch (usertypeOfBaggage_I) {
                        case 1://Carry-on
                            if (seats.getSeatGrade() == "Economy grade") {

                                if (weightOfBaggage[i] > 7.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 7.0) * 5 / 1;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }

                            } else { //First or Business grade
                                if (weightOfBaggage[i] > 9.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 9.0) * 2 / 1;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }
                            }
                            break;

                        case 2://Checked-in
                            if (seats.getSeatGrade() == "Economy grade") {

                                if (weightOfBaggage[i] > 23.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 23.0) * 160 / 15;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }

                            } else { //First or Business grade
                                if (weightOfBaggage[i] > 32.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 9.0) * 150 / 15;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }
                            }
                            break;
                    }
                    break;

                case "Jazeera":
                    switch (usertypeOfBaggage_I) {
                        case 1://Carry-on
                            if (seats.getSeatGrade() == "Economy grade") {

                                if (weightOfBaggage[i] > 7.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 7.0) * 5 / 1;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }

                            } else { //First or Business grade
                                if (weightOfBaggage[i] > 9.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 9.0) * 2 / 1;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }
                            }
                            break;

                        case 2://Checked-in
                            if (seats.getSeatGrade() == "Economy grade") {

                                if (weightOfBaggage[i] > 23.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 23.0) * 300 / 25;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }

                            } else { //First or Business grade
                                if (weightOfBaggage[i] > 32.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 9.0) * 150 / 25;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }
                            }
                            break;
                    }
                    break;

                case "Wizz Air":
                    switch (usertypeOfBaggage_I) {
                        case 1://Carry-on
                            if (seats.getSeatGrade() == "Economy grade") {

                                if (weightOfBaggage[i] > 7.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 7.0) * 5 / 1;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }

                            } else { //First or Business grade
                                if (weightOfBaggage[i] > 9.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 9.0) * 2 / 1;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }
                            }
                            break;

                        case 2://Checked-in
                            if (seats.getSeatGrade() == "Economy grade") {

                                if (weightOfBaggage[i] > 23.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 23.0) * 50 / 20;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }

                            } else { //First or Business grade
                                if (weightOfBaggage[i] > 32.0) {
                                    priceOfBaggage = (weightOfBaggage[i] - 9.0) * 20 / 15;
                                    total += priceOfBaggage;
                                } else {
                                    priceOfBaggage = 0;
                                    total += priceOfBaggage;
                                }
                            }
                            break;
                    }
                    break;
            }
        }
    }

    //trips
    public Trips getTrips() {
        return trips;
    }

    public void setTrips(Trips trips) {
        this.trips = trips;
    }

    //seats
    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    //Print Baggage Information
    public void printBaggageInformation(int usertypeOfBaggage_I) {
        System.out.println(" _________________________________________ ");
        System.out.println("|            Baggage Information          |");
        System.out.println("|_________________________________________|");
        System.out.println("|                                         |");
        switch (usertypeOfBaggage_I) {

            case 1://carry-on
                System.out.println("| 1* Carry-on baggage                     |");
                System.out.println("|    > 2 bags or less are allowed.        |");
                System.out.println("|    > The maximum weight\\bag is 7kg      |");
                System.out.println("|      If you exceed it, you will pay an  |");
                System.out.println("|      additional fee.                    |");
                System.out.println("|                                         |");
                System.out.println("|_________________________________________|");
                break;
            case 2:
                System.out.println("| 2* Checked-in baggage                   |");
                System.out.println("|    > 4 bags or less are allowed.        |");
                System.out.println("|    > The maximum weight\\bag is 23kg     |");
                System.out.println("|      If you exceed it, you will pay an  |");
                System.out.println("|      additional fee.                    |");
                System.out.println("|                                         |");
                System.out.println("|_________________________________________|");
                break;
        }
    }

}
