/*Assumptions:
   * Event id and number of ticket for the event always integer and ticket price double.
*/


//Event class
public class Event {

    //Instance variables declaration

    private int eventId; //unique numeric identifier for the event
    private int ticketNumber; // number of available ticket for the event
    private double ticketPrice; // per ticket price for the event

    //Event for creating Event object

    public Event(int id, int ticketNumb, double price){
        this.eventId = id;
        this.ticketNumber = ticketNumb;
        ticketPrice = price;
    }

    //get methods for all the instance variables

    public int getEventId() {
        return eventId;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

}
