package ivycomptech.Day6.HomeAssesment;

//Design a class that acts as a library for the following kinds of media: book, video, and newspaper.
// Provide one version of the class that uses generics and one that does not



public class Library<T> {
    T whattodo;

    Library(T whattodo)
    {
        this.whattodo=whattodo;
    }

    public void store()
    {
        System.out.println("I Store");
    }

}
