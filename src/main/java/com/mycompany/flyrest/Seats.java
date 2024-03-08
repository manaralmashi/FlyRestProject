package com.mycompany.flyrest;

public class Seats {

    private String seatGrade;
    private String seatNumber;
    private double priceOfSeats;
    private static int[] reserveSeat = new int[70];

    private DynamicArray FlyRest;
    private Trips trips;
    private Calendar calendar;

    public Seats() {
    }

    public Seats(String seatGrade, String seatNumber, DynamicArray flyRest) {
        this.seatGrade = seatGrade;
        this.seatNumber = seatNumber;
        this.FlyRest = flyRest;
    }

    public Seats(String seatGrade, String seatNumber, DynamicArray FlyRest, Trips trips, Calendar calendar) {
        this.seatGrade = seatGrade;
        this.seatNumber = seatNumber;
        this.FlyRest = FlyRest;
        this.trips = trips;
        this.calendar = calendar;
    }

    // Grade
    public String getSeatGrade() {
        return seatGrade;
    }

    public void setSeatGrade(int ChooseGrade) {
        switch (ChooseGrade) {
            case 1:
                this.seatGrade = "First grade";
                break;
            case 2:
                this.seatGrade = "Business degree";
                break;
            case 3:
                this.seatGrade = "Economy grade";
                break;
            default:
        }
    }

    // Number
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumberChoose) {

        int[][] IntegerSeatArray = {{1, 2, 3, 4, 5, 6, 7},
        {8, 9, 10, 11, 12, 13, 14},
        {15, 16, 17, 18, 19, 20, 21},
        {22, 23, 24, 25, 26, 27, 28},
        {29, 30, 31, 32, 33, 34, 35},
        {36, 37, 38, 39, 40, 41, 42},
        {43, 44, 45, 46, 47, 48, 49},
        {50, 51, 52, 53, 54, 55, 56},
        {57, 58, 59, 60, 61, 62, 63},
        {64, 65, 66, 67, 68, 69, 70}};

        String[][] StringSeatArray = {{"1A", "1B", "1C", "1D", "1E", "1F", "1G"},
        {"2A", "2B", "2C", "2D", "2E", "2F", "2G"},
        {"3A", "3B", "3C", "3D", "3E", "3F", "3G"},
        {"4A", "4B", "4C", "4D", "4E", "4F", "4G"},
        {"5A", "5B", "5C", "5D", "5E", "5F", "5G"},
        {"6A", "6B", "6C", "6D", "6E", "6F", "6G"},
        {"7A", "7B", "7C", "7D", "7E", "7F", "7G"},
        {"8A", "8B", "8C", "8D", "8E", "8F", "8G"},
        {"9A", "9B", "9C", "9D", "9E", "9F", "9G"},
        {"0A", "0B", "0C", "0D", "0E", "0F", "0G"}};

        for (int i = 0; i < IntegerSeatArray.length; i++) {
            for (int j = 0; j < IntegerSeatArray[i].length; j++) {
                if (seatNumberChoose == IntegerSeatArray[i][j]) {
                    seatNumber = StringSeatArray[i][j];
                }
            }
        }
    }

    //price of seats
    public double getPriceOfSeats() {
        return priceOfSeats;
    }

    public void setPriceOfSeats(int gradeChoose) {

        if (!(seatNumber.contains("A") | seatNumber.contains("G") | seatNumber.contains("1") | seatNumber.contains("0"))) {
            priceOfSeats = 20.0;
        } else {
            switch (gradeChoose) {
                case 1: //First grade
                    priceOfSeats = 50.0;
                    break;
                case 2: //Business degree
                    priceOfSeats = 10.0;
                    break;
                case 3: //Economy grade
                    priceOfSeats = 10.0;
                    break;
            }
        }
    }

    // Rsesrve seat or not?
    public boolean isValidSeat(int seatNumberChoose) {

//        for (int i = 0; i < reserveSeat.length; i++) {
//            if (reserveSeat[i] == seatNumberChoose) {
//                return false;
//            } else {
//                return true;
//            }
//        }
//        return equals(this);

        if (FlyRest != null) {
            for (int i = 0; i < FlyRest.getFlyrest().length; i++) {

                //Is it the same plane?
                if (FlyRest.getFlyrest()[i].getTrips().getAirPlane() == trips.getAirPlane()
                        & FlyRest.getFlyrest()[i].getCalendar().getDay() == calendar.getDay()
                        & FlyRest.getFlyrest()[i].getTrips().getFlightNumber() == trips.getFlightNumber()) {
                    //Are the seats the same?
                    if (FlyRest.getFlyrest()[i].getSeats().getSeatNumber() == this.seatNumber) {
                        //reserved seat.. (INVALID seat)
                        System.out.println("NOT Valid");
                        return false;
                    } else {
                        //seat available.. (VALID seat)
                        System.out.println(" Valid");
                        return true;
                    }
                    
                } else {
                    return true;
                }
            }
        }
        return equals(this);
    }

    public void setReseverArray(int seatNumberChoose) {
        reserveSeat[seatNumberChoose - 1] = seatNumberChoose;
    }

    // Print
    public void printsSeatGrade() {
        System.out.println("                                  ______                        ");
        System.out.println("                                 /      \\                      ");
        System.out.println("                                /        \\                     ");
        System.out.println("                               /          \\                    ");
        System.out.println("                              /            \\                   ");
        System.out.println("                             /              \\                  ");
        System.out.println("                            /                \\                 ");
        System.out.println("                           |   First grade    |                 ");
        System.out.println("                           | [][] [][][] [][] |                 ");
        System.out.println("                          /|                  |\\               ");
        System.out.println("                         / | [][] [][][] [][] | \\              ");
        System.out.println("                        /  |                  |  \\             ");
        System.out.println("                       /   | Business degree  |   \\            ");
        System.out.println("                      /    | [][] [][][] [][] |    \\           ");
        System.out.println("                     /     |                  |     \\          ");
        System.out.println("                    /      | [][] [][][] [][] |      \\         ");
        System.out.println("                   /       |                  |       \\        ");
        System.out.println("                  /        |  Economy grade   |        \\       ");
        System.out.println("                 /         | [][] [][][] [][] |         \\      ");
        System.out.println("                /         /|                  |\\         \\    ");
        System.out.println("               /         / | [][] [][][] [][] | \\         \\   ");
        System.out.println("              /        /   |                  |   \\        \\  ");
        System.out.println("             /       /     | [][] [][][] [][] |     \\       \\ ");
        System.out.println("            /      /       |                  |       \\      \\");
        System.out.println("           |     /         | [][] [][][] [][] |         \\     |");
        System.out.println("           |   /           |                  |           \\   |");
        System.out.println("            ---            | [][] [][][] [][] |            ---  ");
        System.out.println("                           |                  |                 ");
        System.out.println("                           | [][] [][][] [][] |                 ");
        System.out.println("                           \\                  /                ");
        System.out.println("                            \\                /                 ");
        System.out.println("                             \\              /                  ");
        System.out.println("                              \\            /                   ");
        System.out.println("                               \\__________/                    ");

    }

    public void printsSeatNumber() {
        System.out.println("                                              ________                                    ");
        System.out.println("                                             /        \\                                  ");
        System.out.println("                                           /            \\                                ");
        System.out.println("                                         /                \\                              ");
        System.out.println("                                       /                    \\                            ");
        System.out.println("                                     /                        \\                          ");
        System.out.println("                                   /                            \\                        ");
        System.out.println("                                  /         FIRST grade          \\                       ");
        System.out.println("                                 |                                |                       ");
        System.out.println("                                 | [01][02] [03][04][05] [06][07] |                       ");
        System.out.println("                                 |                                |                       ");
        System.out.println("                                /| [08][09] [10][11][12] [13][14] |\\                     ");
        System.out.println("                               / |                                | \\                    ");
        System.out.println("                              /  |                                |  \\                   ");
        System.out.println("                             /   |        BUSINESS degree         |   \\                  ");
        System.out.println("                            /    |                                |    \\                 ");
        System.out.println("                           /     | [15][16] [17][18][19] [20][21] |     \\                ");
        System.out.println("                          /      |                                |      \\               ");
        System.out.println("                         /       | [22][23] [24][25][26] [27][28] |       \\              ");
        System.out.println("                        /        |                                |        \\             ");
        System.out.println("                       /         |                                |         \\            ");
        System.out.println("                      /          |         ECONOMY grade          |          \\           ");
        System.out.println("                     /           |                                |           \\          ");
        System.out.println("                    /           /| [29][30] [31][32][33] [34][35] |\\           \\        ");
        System.out.println("                   /          /  |                                |  \\          \\       ");
        System.out.println("                  /         /    | [36][37] [38][39][40] [41][42] |    \\         \\      ");
        System.out.println("                 /        /      |                                |      \\        \\     ");
        System.out.println("                /       /        | [43][44] [45][46][47] [48][49] |        \\       \\    ");
        System.out.println("               /      /          |                                |          \\      \\   ");
        System.out.println("              /     /            | [50][51] [52][53][54] [55][56] |            \\     \\  ");
        System.out.println("             |     /             |                                |             \\     |  ");
        System.out.println("             |    |              | [57][58] [59][60][61] [62][63] |              |    |   ");
        System.out.println("             |___/               |                                |               \\___|  ");
        System.out.println("                                 | [64][65] [66][67][68] [69][70] |                       ");
        System.out.println("                                 |                                |                       ");
        System.out.println("                                 |                                |                       ");
        System.out.println("                                 |                                |                       ");
        System.out.println("                                  \\                              /                       ");
        System.out.println("                                   \\                            /                        ");
        System.out.println("                                    \\                          /                         ");
        System.out.println("                                     \\________________________/                          ");
    }

}
