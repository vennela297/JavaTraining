package ivycomptech.Day9_Assesment.OnlineElectronicStore_AfternoonAssesment;

import java.util.Scanner;

//a.	View products
//b.	View employee
//c.	Add new employee
//d.	Add new product
//e.	Remove product
//f.	Remove employee
//g.	Log out
public class Admin implements ViewProduct,Logout{
    Scanner scan=new Scanner(System.in);
    EmployeesList list=new EmployeesList();
    Products products=new Products();
    @Override
    public void logout() {
        System.out.println("User logged out successfully");
    }

    @Override
    public void viewProduct() {
        System.out.println("Here are the products available");
        for(Object str: products.productsAvailable())
        {
            System.out.println(str);
        }

    }
    public void viewEmployee()
    {
        System.out.println("here are the employee details");
        for(Object str: list.employeesAvailable())
        {
            System.out.println(str);
        }
    }
    public void AddNewEmployee()
    {
        System.out.println("Enter the new employee name");
        String name=scan.nextLine();
        list.employeesAvailable().add((Object) name);

    }
    public void removeProducts()
    {
        System.out.println("Enter the name of the product to remove");
        String productName=scan.nextLine();
        products.productsAvailable().remove((Object) productName);

    }
    public  void addNewProduct()
    {
        System.out.println("Enter the details of the new product");
        String productName=scan.nextLine();
        products.productsAvailable().add((Object) productName);
    }
    public void removeEmployee()
    {
        System.out.println("mention the employee name");
        String empName=scan.nextLine();
        list.employeesAvailable().remove((Object) empName);

    }
}
