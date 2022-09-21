import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    {
        System.out.println("Goodbye");
    }
    

    }
    }
    


