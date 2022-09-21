import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
        Movie movie = new Movie();
        System.out.print("Enter the name of a movie: ");
        String title = scanner.nextLine();
        movie.setTitle(title);
        System.out.print("Enter the rating of the movie: ");
        String rating = scanner.nextLine();
        movie.setRating(rating);
        System.out.print("Enter the number of tickets sold for this movie: ");
        int SoldTickets = Integer.parseInt(scanner.nextLine());
        movie.setSoldTickets(SoldTickets);
        System.out.println(movie);
        System.out.println("Do you want to enter another? (y or n)");
        String option = scanner.nextLine();
        if(option.equalsIgnoreCase("y"))
        continue;
        else
        break;
        }
    {
        System.out.println("Goodbye");
    }
    

    }
    }
    


