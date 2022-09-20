package ivycomptech.Day6.HomeAssesment;

public class SolutionClass {
    public static void main(String[] args) {
        Books book=new Books("I am book class");
        Library<Books> receivingBooks=new Library<>(book);
        receivingBooks.store();

    }
}
