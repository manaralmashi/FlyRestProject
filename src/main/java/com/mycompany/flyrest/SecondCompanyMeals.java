package com.mycompany.flyrest;
public class SecondCompanyMeals extends MealsCompany implements TripMeals {

    //Flynas Meals
    //-------data feild----------
    /**
     * @Deprecated An array that stores the menu in Flynas
     */
    private String[] AdvanceReservationOfMeals
            = {"Halloumi Sandwich", "Classic Chicken club sandwich", "Apple juice drink", "Orange juice drink", "NESCAFE - GOLD CAPPUCCINO",
                "INSTANT ARABIC COFFEE", "TEA TIME "};
    /**
     * @Deprecated An array of the same length as the number of types of meals
     * available to the company, which stores the number of times passengers
     * choose each of these types
     */
    private int[] MealCounter = new int[6];
    /**
     * @Deprecated An array in which all food menu prices are stored
     */
    private int[] Price = {22, 22, 5, 5, 11, 7, 5};
    /**
     * @Deprecated This matrix stores the user's requests and their length,
     * because each user has the ability to reserve only two requests (whether
     * the request is a meal or a drink or selecting a type of food) and it is
     * not allowed to repeat one request
     */
    private String[] BookedMeal = new String[2];
    /**
     * @Deprecated Stores the total price of all user reservations for
     * restaurants
     */
    private int TotalMealPrice = 0;

    //-------method(Implementing Classes) ----------
    /**
     *
     * @Deprecated This method shows the types of food (meal terms) that can be
     * determined in advance with the flight
     */
    public void TypesOfMeals() {
        System.out.println(" ________________________________________________________________");
        System.out.println("| In the current period, we do not have a service that makes you  |");
        System.out.println("| choose specifications for a specific type of food, but you can  |");
        System.out.println("| choose and book your meal directly through the following menu   |");
        System.out.println(" ________________________________________________________________");
    }

    /**
     *
     * @Deprecated This method shows the types of food (meal terms) that can be
     * determined in advance with the flight
     */
    public void AdvanceReservationOfMeals() {

        System.out.println("---------------------------------MENU----------------");
        System.out.println("|SANDWICHES  :                                       |");
        System.out.println("|     1-" + AdvanceReservationOfMeals[0] + "                    22SR    |");
        System.out.println("|     2-" + AdvanceReservationOfMeals[1] + "        22SR    |");
        System.out.println("|COLD DRINKS :                                       |");
        System.out.println("|     3-" + AdvanceReservationOfMeals[2] + "                    5SR     |");
        System.out.println("|     4-" + AdvanceReservationOfMeals[3] + "                   5SR     |");
        System.out.println("|HOT DRINKS  :                                       |");
        System.out.println("|     5-" + AdvanceReservationOfMeals[4] + "            11SR    |");
        System.out.println("|     6-" + AdvanceReservationOfMeals[5] + "                 7SR    |");
        System.out.println("|     7-" + AdvanceReservationOfMeals[6] + "                             5SR    |");
        System.out.println(" ____________________________________________________");

    }

    /**
     *
     * @param choice1
     * @param choice2
     * @Deprecated This method determines the meal most requested by travelers
     * and the number of times it is requested (used when the user has booked
     * two meals)
     */
    public void MostBookedMeals(int choice1, int choice2) {
        int largest = 0;

        for (int i = 0; i < MealCounter.length; i++) {
            if (i == choice1 - 1 | i == choice2 - 1) {
                MealCounter[i] = MealCounter[i] + 1;
                setNumberOfMeals(MealCounter[i]);
            }
        }

        for (int i = 0; i < MealCounter.length; i++) {
            if (MealCounter[i] > largest) {
                setMostBookedMeals(AdvanceReservationOfMeals[i]);
            }
        }

    }

    /**
     *
     * @param choice1
     * @Deprecated This method determines the meal most requested by travelers
     * and the number of times it is requested (used when the user has booked
     * one meals)
     */
    public void MostBookedMeals(int choice1) {
        int largest = 0;

        for (int i = 0; i < MealCounter.length; i++) {
            if (i == choice1 - 1) {
                MealCounter[i] = MealCounter[i] + 1;
                setNumberOfMeals(MealCounter[i]);
            }
        }

        for (int i = 0; i < MealCounter.length; i++) {
            if (MealCounter[i] > largest) {
                setMostBookedMeals(AdvanceReservationOfMeals[i]);
            }
        }

    }

    /**
     *
     * @param choice1
     * @param choice2
     * @Deprecated This method stores the traveler's food and beverage
     * reservations (it is used if the user has booked two meals or two types of
     * food)
     */
    public void BookedMeals(int choice1, int choice2) {

        BookedMeal[0] = AdvanceReservationOfMeals[choice1 - 1];
        BookedMeal[1] = AdvanceReservationOfMeals[choice2 - 1];

        setBookedMeals(BookedMeal[0] + "\n" + BookedMeal[1]);

    }

    /**
     *
     * @param choice1
     * @Deprecated This method stores the traveler's food and beverage
     * reservations (it is used if the user has booked one meals or one type of
     * food)
     */
    public void BookedMeals(int choice1) {

        BookedMeal[0] = AdvanceReservationOfMeals[choice1 - 1];;

        setBookedMeals(BookedMeal[0]);

    }

    //-------Getters methods----------
    /**
     *
     * @return MostBookedMeals
     */
    public String getMostBookedMeals() {
        return getMostBookedMeals();
    }

    /**
     *
     * @return NumberOfMeals
     */
    public int getNumberOfMeals() {
        return getNumberOfMeals();
    }

    /**
     *
     * @return TotalMealPrice
     */
    public int getTotalMealPrice() {
        return TotalMealPrice;
    }

    /**
     *
     * @return BookedMeals
     */
    public String getBookedMeals() {

        return getBookedMeals();
    }
    //-------setter methods----------

    /**
     * @param choice1
     * @return BookedMeals
     * @Deprecated This method adds together the price of booked orders and
     * returns the total price
     */
    public void setTotalMealPrice(int choice1) {

        this.TotalMealPrice = TotalMealPrice + Price[choice1 - 1];

    }

}
