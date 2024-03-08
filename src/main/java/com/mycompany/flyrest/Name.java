package com.mycompany.flyrest;
public class Name {

    private String Fname;
    private String Mname;
    private String Lname;

    public Name(String Fname) {
        this.Fname = Fname;
    }

    public Name(String Fname, String Mname, String Lname) {
        this.Fname = Fname;
        this.Mname = Mname;
        this.Lname = Lname;

    }

    public Name() {
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setMname(String Mname) {
        this.Mname = Mname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getFname() {
        return Fname;
    }

    public String getMname() {
        return Mname;
    }

    public String getLname() {
        return Lname;
    }
    
    public String getFullName() {
        return Fname+" "+Mname+" "+Lname;
    }
}
