package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 * Completed lab on 10/29/21 12:03 AM. haven't slept in days
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {
        return x > y;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {
        return x < y;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        return x >= y;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {
        return x <= y;
    }


    /**
     * @return true
     */
    public Boolean returnTrue() {
        return true;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        return false;
    }

}