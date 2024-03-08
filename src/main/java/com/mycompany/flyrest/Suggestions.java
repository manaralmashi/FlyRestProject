package com.mycompany.flyrest;
public class Suggestions {

    //obj
    CityMarks[] sug = new CityMarks[3];
    //attribute
    private boolean needOrnot;
    
    
    
    //constructor
    public Suggestions() {
    }

    public Suggestions(Hotels h, Resturants r, Sightseeing s) {
        sug[0] = h;
        sug[1] = r;
        sug[2] = s;
    }

    
    //setter & getter for needOrnot
    public boolean isNeedOrnot() {
        return needOrnot;
    }

    public void setNeedOrnot(int chosen) {
        switch (chosen) {
            case 1: //yes
                this.needOrnot = true;
                break;
            case 2: //No
                this.needOrnot = false;
                break;
        }  
    }
    
    
    //method: prints suggestions to the traveller for the city is heading for
    public void PrintSug() {
        for (int i = 0; i < 3; i++) {
            String a = "";
            if (i == 0) {
                a = "Hotels: ";
            } else if (i == 1) {
                a = "resturants: ";
            } else if (i == 2) {
                a = "Places: ";
            }
            System.out.print("*" + a);
            String[] copy = new String[3];
            copy = sug[i].ChoosenCity();
            int j = 0;
            System.out.print(copy[j] + ", ");
            System.out.print(copy[j + 1] + ", ");
            System.out.print(copy[j + 2] + ".");

//            for (int j = 0; j < 3; j++) {
//                System.out.print(copy[j] + ", ");
//            }
            System.out.println();

        }//End for

    }//End method
}//End class
