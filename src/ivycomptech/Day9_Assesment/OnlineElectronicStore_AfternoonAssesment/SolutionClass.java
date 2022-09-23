package ivycomptech.Day9_Assesment.OnlineElectronicStore_AfternoonAssesment;
//a.	View products
//b.	View employee
//c.	Add new employee
//d.	Add new product
//e.	Remove product
//f.	Remove employee
//g.	Log out
import java.util.Scanner;

public class SolutionClass {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your email Userid , password,  , and your role");

        String email=scan.nextLine();
        String userid=scan.nextLine();
        String password=scan.nextLine();
        System.out.println("Enter the role");
        String role=scan.nextLine();

        switch (role.toLowerCase()) {
            case "user", "customer" -> {
                User userAccess = new User();
                System.out.println("Enter 1 for viewing product ,2 for Buying product , 3 for searching product and 4 for exit");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1 -> userAccess.viewProduct();
                    case 2 -> userAccess.buyProduct();
                    case 3 -> userAccess.searchProducts();
                }

            }
            case "admin" -> {
                Admin adminAccess = new Admin();
                System.out.println("a for View products /nb View employee c.	Add new employee/n d.	Add new product e./n	Remove product/n f.	Remove employee/n g for logout"
                );
                String str = scan.nextLine();
                switch (str) {
                    case "a" -> adminAccess.viewProduct();
                    case "b" -> adminAccess.viewEmployee();
                    case "c" -> adminAccess.AddNewEmployee();
                    case "d" -> adminAccess.addNewProduct();
                    case "e" -> adminAccess.removeProducts();
                    case "f" -> adminAccess.removeEmployee();
                    case "g" -> adminAccess.logout();
                }

            }
            case "employee" -> {
                Employee empAccess = new Employee();
                System.out.println("a.\tView products\n" +
                        "b.\tShip a product\n" +
                        "c.\tUpdate quantity of a product\n" +
                        "d.\tlogout\n");
                String choice = scan.nextLine();
                switch (choice) {
                    case "a" -> empAccess.viewProduct();
                    case "b" -> empAccess.shipAProduct();
                    case "c" -> empAccess.updateProducts();
                    case "d" -> empAccess.logout();
                }
            }
        }
    }
}
