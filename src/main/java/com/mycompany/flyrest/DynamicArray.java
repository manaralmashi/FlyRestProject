package com.mycompany.flyrest;
import java.util.Arrays;

/**
 *
 * @author Lamis
 *
 */
public class DynamicArray {

    // Attributes
    private Reservation flyrest[];
    static int size = 1;

    /**
     * DynamicArray
     *
     * @description Constructor
     */
    public DynamicArray() {
        flyrest = new Reservation[size];
    }

    /**
     * getNew
     *
     * @param index
     * @return an object -Reservation-
     */
    public Reservation getNew(int index) {
        return flyrest[index];
    }

    /**
     * SetNew
     *
     * @param Traveller
     */
    public void SetNew(Reservation Traveller) {
        if (flyrest[0] == null) {
            flyrest[0] = Traveller;
        } else {
            ensureCapacity(size + 1);
            flyrest[size++] = Traveller;
        }
    }

    /**
     * ensureCapacity
     *
     * @param Capcity
     * @description to make sure that the array the has an empty index to fill
     * with that object, if not it will double the size of the array and copy
     * all the data stored in the old array to the new array size
     */
    public void ensureCapacity(int Capcity) {
        int newCapacity = 1;
        int oldCapacity = flyrest.length;
        if (Capcity >= oldCapacity) {
            newCapacity = oldCapacity * 2;
        }
        flyrest = Arrays.copyOf(flyrest, newCapacity);
    }

    /**
     * getFlyrest
     *
     * @return
     */
    public Reservation[] getFlyrest() {
        return flyrest;
    }

    /**
     * setFlyrest
     *
     * @param flyrest
     */
    public void setFlyrest(Reservation[] flyrest) {
        this.flyrest = flyrest;
    }

    /**
     * getSize
     *
     * @return
     */
    public static int getSize() {
        return size;
    }

    /**
     * setSize
     *
     * @param size
     */
    public static void setSize(int size) {
        DynamicArray.size = size;
    }

}
