package ivycomptech.Day9_Assesment.OnlineElectronicStore_AfternoonAssesment;

import java.util.ArrayList;
import java.util.Scanner;

//1.	User/Customer
//a.	View products
//b.	Search product
//c.	Buy product
//d.	Log out
public class User implements Logout,ViewProduct {
    Scanner scan=new Scanner(System.in);
    EmployeesList list=new EmployeesList();
    Products products=new Products();

    @Override
    public void logout() {
        System.out.println("User Successfully logged out");
    }

    @Override
    public void viewProduct() {
        System.out.println("HERE ARE THE PRODUCTS");
        for(Object str: products.productsAvailable())
        {
            System.out.println(str);
        }
    }
    public void searchProducts()
    {
        System.out.println("Enter the Product name");
        String str=scan.nextLine();
        ArrayList<String> myList=products.productsAvailable();
        System.out.println(myList.contains((Object)str.toUpperCase()));


    }
    public void buyProduct()
    {
        System.out.println("here are the products with its cost");
        for(Object str: products.productsAvailable())
        {
            System.out.println(str);
        }

    }
}
