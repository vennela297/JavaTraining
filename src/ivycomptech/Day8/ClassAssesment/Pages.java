package ivycomptech.Day8.ClassAssesment;

import java.util.Scanner;

public class Pages {

    public int pageCount(int n,int p)
    {
        if(n-p>p)
        {
            return p/2;
        }

        return (n-p)/2;
    }

    public static void main(String[] args) {
        Pages book =new Pages();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the total number of pages in the book");
        int totalPages=scan.nextInt();
        System.out.println("Enter the page to search");
        int searchPage=scan.nextInt();
        System.out.println("The mininum no of pages are"+" "+book.pageCount(totalPages,searchPage));

    }
}
