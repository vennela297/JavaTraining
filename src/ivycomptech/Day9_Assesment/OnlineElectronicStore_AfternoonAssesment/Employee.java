package ivycomptech.Day9_Assesment.OnlineElectronicStore_AfternoonAssesment;

import java.util.Scanner;

//a.	View products
//b.	Ship a product
//c.	Update quantity of a product
//d.	logout
public class Employee implements Logout,ViewProduct {
    Scanner scan =new Scanner(System.in);

    EmployeesList list=new EmployeesList();
    Products products=new Products();
    @Override
    public void logout() {
        System.out.println("Employee successfully logged out");
    }

    @Override
    public void viewProduct() {
        System.out.println("Here are the product details");
        for(Object str: products.productsAvailable())
        {
            System.out.println(str);
        }

    }

    public void updateProducts()
    {
        System.out.println("Enter the product name");
        String str=scan.nextLine();
        products.productsAvailable().add((Object) str);

    }
    public void shipAProduct()
    {
        System.out.println("PRODUCT SHIPPED");
    }
}
