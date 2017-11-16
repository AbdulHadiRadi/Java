/*Assumptions:
    1-50 events are stored in the system
    2-ticket prize will vary from 5 to 50 dollar
    3-user input doesn't have any error
*/


import java.util.*;//importing util package.


//class for finding 5 closest events from the given co-ordinate.

public class EventFinder {

    //Main method for the program
    public static void main(String[] args){

        Map<Coordinate,Event> eventMap = new HashMap<>(); //HashMap for all the events where co-ordinate object is key and event object is value.

        //Randomly generated seed data ranges from -10 to +10 (Y axis), and -10 to +10 (X axis).
        for(int i=0; i<50; i++) {
            Random random = new Random();
            int x_axis = random.nextInt(11 + 10) - 10; // randomly generated x-axis
            int y_axis = random.nextInt(11 + 10) - 10; // randomly generated y-axis

            Event event = new Event(i,random.nextInt(),random.nextInt(51-5)+5); // creating event object assuming that ticket prize will vary from 5 to 50 dollar.
            Coordinate coordinate = new Coordinate(event,x_axis, y_axis); // creating co-ordinate object

            eventMap.put(coordinate, event); // adding event as value and co-ordinate as key into the the eventMap
        }


        Scanner scan = new Scanner(System.in);

        // taking input of user location as a pair of co- ordinates
        System.out.println("Please Input Coordinates Where X and Y Values are Separated by Comma:");

        String inputCoordinate = scan.nextLine().trim();//storing user's input into the string.
        String [] coordinates = inputCoordinate.split(",");//split the string by comma

            int x = Integer.parseInt(coordinates[0]);// storing x-axis from the user input
            int y = Integer.parseInt(coordinates[1]);// storing y-axis from the user input

        Map<Integer,Event> allEvent = new HashMap<>();//HashMap for all the events where distance integer value is key and event object is value.

        //loop through all the keys of evenMap where key represents the co-ordinate object.
        for ( Coordinate key : eventMap.keySet() ) {

            int distance =getManhattanDistance(x,y,key);//storing Manhattan distance
            allEvent.put(distance,eventMap.get(key));//adding distance integer as value and co-ordinate object as key into the the allEvent Map.

        }

        Event[] closesEvent = new Event[5]; //An array for closest five events
        int [] closestDistance = new int[5]; //An array for distance of five closest events from the given co-ordinate

        for(int i=0; i<5; i++){

            int key = findingClosetEvent(allEvent); // finding smallest key from allEvent map
            closestDistance[i] = key; // Storing found closest distance from the given co-ordinate
            closesEvent[i] = allEvent.get(key); // Storing event of closest distance from the given co-ordinate
            allEvent.remove(key); //removing the closest distance event for finding the next closest distance event

        }

        //Printing output for the given co-ordinate.
        System.out.println("Closest Events to ("+x+","+y+"):");

        //Printing 5 closest events with id, price and distance from the given co-ordinate
        for(int j=0; j<5; j++) {

            System.out.println("Events " + closesEvent[j].getEventId()+" - $"+closesEvent[j].getTicketPrice()+", Distance "+closestDistance[j]);

        }
    }

    //The method for calculating Manhattan distance
    public static int getManhattanDistance(int x,int y, Coordinate co){

        int x_difference = Math.abs (x-co.getX_axis()); //x-axis difference
        int y_difference = Math.abs (y-co.getY_axis()); //y-axis difference
        return ( x_difference +y_difference );

    }


    //a method for finding the smallest key value from the Map. Here key represent the distance.
    public static int findingClosetEvent(Map<Integer, Event> events){

        return Collections.min(events.keySet());

    }
}
