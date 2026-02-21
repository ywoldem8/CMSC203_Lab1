
import java.util.Scanner;
public class MovieDriver_Task1 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		Movie movie = new Movie();
		
		System.out.println("Enter the title of a movie: ");
		movie.setTitle(userInput.nextLine());
		
		System.out.println("Enter movies rating: ");
		movie.setRating(userInput.nextLine());

		System.out.println("Enter the number of tickets sold at MC theater: ");
		movie.setSoldTickets(userInput.nextInt());
	
		System.out.println(movie);
		
	
		System.out.println("Program Ended.");	
		
		userInput.close();
	}

}