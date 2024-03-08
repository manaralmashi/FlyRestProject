package com.mycompany.flyrest;

public class TravelerInformation {

    private String Gender;
    Name name;
    Age age;
    private String phoneNumber;
    private String City;
    Passport passport;
    private String email;

    public TravelerInformation() {
    }

    public TravelerInformation(Name name) {
        this.name = name;
    }

    public TravelerInformation(Age age) {
        this.age = age;
    }

    public TravelerInformation(Passport passport) {
        this.passport = passport;
    }

    public TravelerInformation(String email) {
        this.email = email;

    }

    public TravelerInformation(String Gender, String phoneNumber, String City) {
        this.Gender = Gender;
        this.phoneNumber = phoneNumber;
        this.City = City;
    }

    public TravelerInformation(String Gender, Name name, Age age, String phoneNumber, String City, Passport passport, String email) {
        this.Gender = Gender;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.City = City;
        this.passport = passport;
        this.email = email;

    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return Gender;
    }

    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return City;
    }

    public Passport getPassport() {
        return passport;
    }

    public String getEmail() {
        return email;
    }

}
