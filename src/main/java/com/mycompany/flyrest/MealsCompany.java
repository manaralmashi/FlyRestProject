package com.mycompany.flyrest;

public abstract class MealsCompany implements TripMeals {
    //-------data feild----------

    //Stocks your most requested meal
    private String MostBookedMeals;
    //Stores the number of times the most requested meal was ordered
    private int NumberOfMeals;
    //Stores the final price for booking meals
    private int TotalMealPrice;
    //Stores all orders for a single traveler
    private String BookedMeals;
    //Stores either yes or no (according to the user's desire to reserve meals or not)
    private boolean YesOrNo;

    //-------Getters methods----------
    public String getMostBookedMeals() {
        return MostBookedMeals;
    }

    public int getNumberOfMeals() {
        return NumberOfMeals;
    }

    public int getTotalMealPrice() {
        return TotalMealPrice;
    }

    public String getBookedMeals() {
        return BookedMeals;
    }

    public void setTotalMealPrice(int i) {

    }
//-------setters methods----------

    public void setMostBookedMeals(String MostBookedMeals) {
        this.MostBookedMeals = MostBookedMeals;
    }

    public void setNumberOfMeals(int NumberOfMeals) {
        this.NumberOfMeals = NumberOfMeals;
    }

    public void setBookedMeals(String BookedMeals) {
        this.BookedMeals = BookedMeals;
    }

    public void setYesOrNo(boolean YesOrNo) {
        this.YesOrNo = YesOrNo;
    }

}
