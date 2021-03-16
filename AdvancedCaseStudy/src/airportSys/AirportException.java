package airportSys;

/** Application specific exception
 *
 *  @author VSRedshift
 *  @version Feb 2021
 */

public class AirportException extends RuntimeException{

    /**
     *  Default Constructor
     */

    public AirportException() {
        super("Error: Airport System Violation");
    }

    /**
     *  Constructor that accepts error message
     */

    public AirportException(String msg) {
        super(msg);
    }
}
