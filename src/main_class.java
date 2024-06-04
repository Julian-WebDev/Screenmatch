public class main_class {
    // Main method
    public static void main(String [] args){
        // Class instance
        model_movie movie = new model_movie();

        movie.name = "The Lord of the Rings";
        movie.releaseDate = 2001;
        movie.duration = 178;

        movie.showMovie();
        movie.rating(8);
        movie.rating(10);
        movie.rating(9);
        // Create another movie
        model_movie second_movie = new model_movie();

        second_movie.name = "Shrek";
        second_movie.releaseDate = 2001;
        second_movie.duration = 92;
        System.out.println(movie.rating);

        System.out.println("Average: " + movie.average());

        //System.out.println("My second movie is: " + second_movie.name);
        //System.out.println("Release date: " + second_movie.releaseDate);
        //System.out.println("Duration" + second_movie.duration);

        second_movie.showMovie();
        second_movie.rating(8);
        second_movie.rating(7);
        second_movie.rating(6);
        System.out.println(second_movie.rating);

    }
}
