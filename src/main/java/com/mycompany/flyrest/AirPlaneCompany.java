package com.mycompany.flyrest;
/**
 *
 * @author Lamis
 */
public abstract class AirPlaneCompany {

    /**
     *
     */
    protected String CompName; // to give the company name

    /**
     *
     */
    protected String Symbol; // to give the symbol of company

    /**
     *
     */
    protected static int AllFlights; // to get the number of travelers for each company

    /**
     *
     */
    public AirPlaneCompany() {

    }

    /**
     *
     * @return
     */
    public String getCompName() {
        return CompName;
    }

    /**
     *
     * @return
     */
    public String getSymbol() {
        return Symbol;
    }

    /**
     *
     * @param CompName
     */
    public void setCompName(String CompName) {
        this.CompName = CompName;
    }

    /**
     *
     * @param Symbol
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     *
     * @return
     */
    public static int getAllFlights() {
        return AllFlights;
    }

    /**
     *
     */
    public abstract void CompInfo(); // to give the information about the choosen company

}
