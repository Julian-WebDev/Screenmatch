import com.aluracursos.screenmatch.models.model_movie;

public class main_class {
    // Main method
    public static void main(String [] args){
        // Class instance
        model_movie movie = new model_movie();

        movie.setName("The Lord of the Rings");
        movie.setReleaseDate(2001);
        movie.setDuration(178);

        movie.showMovie();
        movie.rating(8);
        movie.rating(10);
        movie.rating(9);
        System.out.println("Total ratings: " + movie.getTotalRatings());
        System.out.println("Average: " + movie.average());

        System.out.println("************************");

//        // Create another movie
//        model_movie second_movie = new model_movie();
//
//        second_movie.getName();
//        second_movie.getReleaseDate() ;
//        second_movie.getDuration();
//
//        second_movie.showMovie();
//        second_movie.rating(8);
//        second_movie.rating(7);
//        second_movie.rating(6);
//
//        System.out.println("Total ratings: " + second_movie.getTotalRatings());
//        System.out.println("Average: " + second_movie.average());
    }
}
