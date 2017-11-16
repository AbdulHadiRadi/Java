------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Event Finder
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS: Abdul Hadi
USER INSTRUCTIONS:

Build Instruction:
EventFinder class got main method which will run the entire program.


Please detail any assumptions you have made.
Assumption:
•	Co-ordinates are always integer value
•	50 events are created and stored in the system
•	ticket prize will vary from 5 to 50 dollar
•	User will never input error values

How might you change your program if you needed to support multiple events at the same location?
Ans:
We assumed that each co-ordinate can hold a maximum of one event. If we want multiple events each co-ordinate can hold then, instead of single Event object we will have an ArrayList of Event type object in the Coordinate class, example: ArrayList<Event> event.

public class Coordinate {

    //Instance variables declaration

    private ArrayList<Event> events; //arraylist of Event objects for the Co-ordinate
    private int x_axis; //x axis of the co-ordinates
    private int y_axis; //y axis of the co-ordinates

    //Constructor for creating Coordinate object

    public Coordinate(ArrayList<Event> events;, int x, int y){
	//initializing instance variables
        this.events = events;
        this.x_axis = x;
        this.y_axis = y;
    }

    //all the get methods for the instance variables.

    public ArrayList<Event> getEvent() {
        return event;
    }

    public int getX_axis() {
        return x_axis;
    }

    public int getY_axis() {
        return y_axis;
    }

}


How would you change your program if you were working with a much larger world size?
Ans:
In the current program, we are doing a linear search for getting the distance which will be inefficient if the range of the world is massive. In that case, to improve the efficiency of the program I would use some efficient search algorithm such as path finder algorithm. Also, constrict the search space would make the program pretty efficient such as depending on the x,y value we can get four parts of the world (x,y),(-x,y),(x,-y),(-x,-y) for search.
Resources Used:
•	StackOverFlow: https://stackoverflow.com/
•	Tutorialspoint: https://www.tutorialspoint.com/
•	YOUTUBE:  https
