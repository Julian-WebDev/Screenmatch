public class main_class {
    // Main method
    public static void main(String [] args){
        // Class instance
        model_movie movie = new model_movie();

        movie.name = "The Lord of the Rings";
        movie.releaseDate = 2001;
        movie.duration = 178;

        System.out.println("My movie is: " + movie.name);
        System.out.println("Release date: " + movie.releaseDate);
        System.out.println("Duration: " + movie.duration);

        // Create another movie
        model_movie second_movie = new model_movie();
        second_movie.name = "Shrek";
        second_movie.releaseDate = 2001;
        second_movie.duration = 92;

        System.out.println("My second movie is: " + second_movie.name);
        System.out.println("Release date: " + second_movie.releaseDate);
        System.out.println("Duration" + second_movie.duration);
    }
}
