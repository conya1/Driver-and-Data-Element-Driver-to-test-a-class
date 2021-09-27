//this is the Scanner class that is used to create our scanner object
import java.util.Scanner;

/*this is the driver class that allows us to test the different 
 methods provided in the data element class called Movie class*/

public class MovieDriver {

    public static void main(String[] args) {
    	// creating an object or instance scanner which allows us to read from the keyboard 
        Scanner keyboard = new Scanner(System.in);

        String repeat = "y"; //if the answer is yes, we repeat the process all over again
        while (repeat.equalsIgnoreCase("y")){

        	//prompt user to enter movie title
            System.out.println("Enter the name of a movie");
            String movieName = keyboard.nextLine(); /*Collects all characters until encountering the
            next newline character and returns the characters collected as a string.*/
            
            //prompt user to enter movie rating
            System.out.println("Enter the rating of the movie");
            String rating = keyboard.nextLine(); //read in the line that the user types

            //prompt user to enter the number of tickets sold at a theater
            System.out.println("Enter the number of tickets sold for this movie");
            int ticketsSold = keyboard.nextInt(); 
            keyboard.nextLine();

            // Create an movie object from the Movie class constructor that takes data as imput and sets them
            Movie aMovie = new Movie(movieName,rating,ticketsSold);
            System.out.println(aMovie);

            System.out.println("Do you want to enter another? (y or n)");
            repeat = keyboard.nextLine();
        }
        System.out.println("Goodbye!!!!!");   //program ends 
        System.exit(0);
    }
}