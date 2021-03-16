package airportSys;

import java.io.Serializable;

/** Class to store details of a single runway
 *
 * @author VSRedshift
 * @version Feb 2021
 */

public class Runway implements Serializable {

    // attributes
    private int number;
    private boolean allocated;

    /** Constructor sets the runway number
     * @params  numberIn            Used to set the runway number
     * @throws  AirportException    When the runway number is less than 1
     */
    public Runway(int numberIn) {
        if (numberIn < 1) {
            throw new AirportException("Invalid runway number " + numberIn);
        }
        this.number = numberIn;
        allocated = false;  // runway vacant initially
    }

    /**
     *  Returns the runway number
     */
    public int getNumber() {
        return number;
    }

    /**
     *  Checks if the runway is allocated
     */
    public boolean isAllocated() {
        return allocated;
    }

    /**
     * Records the runway as being booked
     */
    public void book() {
        allocated = true;
    }

    /**
     *  Records the runway as being vacant
     */
    public void vacate() {
        allocated = false;
    }

}
