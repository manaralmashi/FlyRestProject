package com.mycompany.flyrest;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class FifthCompanyMeals extends MealsCompany implements TripMeals {

    //WIZZ AIR Meals
    //-------data feild----------
    /**
     * @Deprecated An array that stores the types of meals in WIZZ AIR
     */
    private String[] TypesOfMeals = {"DBML", "CHML", "LCML", "GFML", "A meal without conditions"};
    /**
     * @Deprecated An array of the same length as the number of types of meals
     * available to the company, which stores the number of times passengers
     * choose each of these types
     */
    private int[] MealCounter = new int[5];
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
        System.out.println(" _____________________________________");
        System.out.println("|            Special Meals            | ");
        System.out.println("|_____________________________________|");
        System.out.println("| [1]" + TypesOfMeals[0] + " |       Diabetic meals      |");
        System.out.println("| [2]" + TypesOfMeals[1] + " |       children Meals      |");
        System.out.println("| [3]" + TypesOfMeals[2] + "|       Low calorie meals   |");
        System.out.println("| [4]" + TypesOfMeals[3] + " |       Gluten-free meals   |");
        System.out.println("| [5] " + TypesOfMeals[4] + "       |");
        System.out.println("|_____________________________________|");

    }

    /**
     *
     * @Deprecated This method shows the types of food (meal terms) that can be
     * determined in advance with the flight
     */
    public void AdvanceReservationOfMeals() {

        System.out.println("At the present time, reservations for meals are on board,"
                + "\n  meaning that there is no prior reservation available in the WIZZ AIR airline");

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

        BookedMeal[0] = TypesOfMeals[choice1 - 1];
        BookedMeal[1] = TypesOfMeals[choice2 - 1];

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

        BookedMeal[0] = TypesOfMeals[choice1 - 1];

        setBookedMeals(BookedMeal[0]);

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
                setMostBookedMeals(TypesOfMeals[i]);
            }
        }

    }

    /**
     *
     * @param choice1
     * @Deprecated This method determines the meal most requested by travelers
     * and the number of times it is requested (used when the user has booked
     * one meal)
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
                setMostBookedMeals(TypesOfMeals[i]);
            }
        }

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
     * @returnNumberOfMeals
     */
    public int getNumberOfMeals() {
        return getNumberOfMeals();
    }

    /**
     *
     * @return BookedMeals
     */
    public String getBookedMeals() {
        return getBookedMeals();
    }

    /**
     *
     * @return TotalMealPrice
     */
    public int getTotalMealPrice() {
        return TotalMealPrice;
    }
    
    //-------Setters methods----------
    public void setTotalMealPrice(int choice1) {
        this.TotalMealPrice = TotalMealPrice;
    }

}
