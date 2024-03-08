package com.mycompany.flyrest;

public interface TripMeals {

    /**
     *
     *
     * @Deprecated This method shows the menu of food that can be booked in
     * advance with the flight
     */
    public void AdvanceReservationOfMeals();

    /**
     *
     * @Deprecated This method shows the types of food (meal terms) that can be
     * determined in advance with the flight
     */
    public void TypesOfMeals();

    /**
     *
     * @param choice1
     * @param choice2
     * @Deprecated This method determines the meal most requested by travelers
     * and the number of times it is requested (used when the user has booked
     * Tow meals)
     */
    public void MostBookedMeals(int choice1, int choice2);

    /**
     *
     * @param choice1
     * @Deprecated This method determines the meal most requested by travelers
     * and the number of times it is requested (used when the user has booked
     * one meal)
     */
    public void MostBookedMeals(int choice1);

    /**
     *
     * @param choice1
     * @param choice2
     * @Deprecated This method stores the traveler's food and beverage
     * reservations (it is used if the user has booked two meals or two types of
     * food)
     */
    public void BookedMeals(int choice1, int choice2);

    /**
     *
     * @param choice1
     * @Deprecated This method stores the traveler's food and beverage
     * reservations (it is used if the user has booked one meal or one types of
     * food)
     */
    public void BookedMeals(int choice1);

}
