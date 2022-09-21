package ivycomptech.Day7.HomeAssesment;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String title;
    public String studio;
    public String rating;

    Movie()
    {

    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating="PG";
    }
    public String[] getPG(ArrayList<Movie> movieList)
    {
        int i=0;
        String [] arr=new String[movieList.size()];
        for(Movie movie:movieList)
        {
            if(movie.rating=="PG")
            {
                arr[i]=movie.title;
                i++;
            }

        }
        return arr;

    }

    public static void main(String[] args) {
        Movie movie1=new Movie();
        Movie film1=new Movie("Maharshi","GMB","G");
        Movie film4=new Movie("intestellar","tiger","G");
        Movie film5=new Movie("xmen","tiger","G");
        Movie film2=new Movie("Avengers","lion");
        Movie film6=new Movie("Casino Royale","Eon Productions","PG-13");


        Movie film3=new Movie("Bahubali","moon");
        ArrayList<Movie> movieList=new ArrayList<>();
        movieList.add(film1);
        movieList.add(film2);
        movieList.add(film3);
        movieList.add(film4);
        movieList.add(film5);

        System.out.println(Arrays.toString(movie1.getPG(movieList)));
        System.out.println(film6.title=" "+film6.studio+" "+film6.rating);



    }
}
