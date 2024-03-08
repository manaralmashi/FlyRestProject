package com.mycompany.flyrest;

public class Passport {

    private String Passport;
    private String CityOfPassport;
    private String PassportNumber;
    private int dayofPassport;
    private int monthofPassport;
    private int yearofPassport;

    public Passport() {
    }

    public Passport(String Passport) {
        this.Passport = Passport;
    }

    public Passport(String Passport, String PassportNumber) {
        this.Passport = Passport;
        this.PassportNumber = PassportNumber;

    }

    public Passport(String Passport, String CityOfPassport, String PassportNumber) {
        this.Passport = Passport;
        this.CityOfPassport = CityOfPassport;
        this.PassportNumber = PassportNumber;
    }

    public void setPassport(String Passport) {
        this.Passport = Passport;
    }

    public void setCityOfPassport(String CityOfPassport) {
        this.CityOfPassport = CityOfPassport;
    }

    public void setPassportNumber(String PassportNumber) {
        this.PassportNumber = PassportNumber;
    }

    public String getPassport() {
        return Passport;
    }

    public String getCityOfPassport() {
        return CityOfPassport;
    }

    public String getPassportNumber() {
        return PassportNumber;
    }

}
