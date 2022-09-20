package ivycomptech.Day3.HomeAssesment.AverageSalary;

public class Test1 {
    public static void validateSal (int sal) throws InvalidSalException {
        if(sal>=1000||sal<=106){

            // throw an object of user defined exception
            throw new InvalidSalException("salary not valid");
        }

    }
}
