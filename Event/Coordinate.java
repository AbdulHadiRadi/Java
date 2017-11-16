/*Assumptions:
    1- Co-ordinates will always have integer values
    2- Each Coordinate has one event. If we want multiple events then instead of single Event object we will have an ArrayList of Event type object,
      ArrayList<Event> event.
 */

//Coordinate class
public class Coordinate {

    //Instance variables declaration

    private Event event; //Event object for the Co-ordinate
    private int x_axis; //x axis of the co-ordinates
    private int y_axis; //y axis of the co-ordinates

    //Constructor for creating Coordinate object

    public Coordinate(Event event, int x, int y){
        //initializing instance variables
        this.event = event;
        this.x_axis = x;
        this.y_axis = y;
    }

    //all the get methods for the instance variables.

    public Event getEvent() {
        return event;
    }

    public int getX_axis() {
        return x_axis;
    }

    public int getY_axis() {
        return y_axis;
    }

}
