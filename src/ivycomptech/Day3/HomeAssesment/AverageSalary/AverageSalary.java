package ivycomptech.Day3.HomeAssesment.AverageSalary;



import static ivycomptech.Day3.HomeAssesment.AverageSalary.Test1.validateSal;
import static ivycomptech.Day3.HomeAssesment.AverageSalary.Test2.validateSalLength;

public class AverageSalary {
    public static void main(String[] args) {
        int [] salary={500,600,700,800};
        try{
            for(int i=0;i<salary.length;i++)
            {
                validateSalLength(salary[i]);
                validateSal(salary[i]);

            }

        }catch(InvalidSalException e)
        {
            System.out.println(e.getMessage());
        }catch(InvalidSalLengthException e)
        {
            System.out.println(e.getMessage());
        }

        int max = salary[0];
        int min = salary[0];

        // do for each array element
        for (int i = 1; i < salary.length; i++)
        {
            // if the current element is greater than the maximum found so far
            if (salary[i] > max) {
                max = salary[i];

            }

            // if the current element is smaller than the minimum found so far
            else if (salary[i] < min) {
                min = salary[i];

            }
        }
        int sum=0;
        int avg=0;
        for (int j = 0; j<salary.length; j++)
        {
            sum=sum+salary[j];
        }
        avg=(sum-(max+min))/ (salary.length-2);

        System.out.println(avg);

    }
}
