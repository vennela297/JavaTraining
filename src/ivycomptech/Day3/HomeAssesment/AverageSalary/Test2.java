package ivycomptech.Day3.HomeAssesment.AverageSalary;

public class Test2 {
    public static void validateSalLength (int sal) throws InvalidSalLengthException {
        int length = String.valueOf(sal).length();
        if(length<3||length>100){

            // throw an object of user defined exception
            throw new InvalidSalLengthException("salary length not valid");
        }

    }
}
