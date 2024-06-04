public class model_movie {
    //Declare the attributes of the object Movie
    String name;
    int releaseDate;
    int duration;
    boolean available;

    //Access modifiers
    private double rating; //Private makes the variable undetectable to the common user
    private int totalRatings;

    int getTotalRatings(){
        return totalRatings;
    }

    void showMovie(){
        System.out.println("The name of the movie is: " + name);
        System.out.println("Release date: " + releaseDate);
        System.out.println("Duration: " + duration);
    }


    void rating(double rate){
        rating += rate;
        rating = rating + rate;
        totalRatings ++;
    }

    double average(){
        return rating / totalRatings;
    }
}
