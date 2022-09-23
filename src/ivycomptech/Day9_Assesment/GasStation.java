package ivycomptech.Day9_Assesment;

import java.util.Scanner;



public class GasStation {
    int costRemaining=0;
    int costTonextStation=0;

    public int isGasStation(int [] gas,int [] cost)
    {


        int totalCostRemaining=0;
        int afterOneRoundTrip=0;
        int startIndex=0;
        for(int i=0;i<gas.length;i++)
        {
            costRemaining=gas[i]-cost[i];
            if(costRemaining>=0)
            {
                totalCostRemaining=totalCostRemaining+costRemaining;
            }
            else {
                totalCostRemaining=costRemaining;
                startIndex=i;

            }
            afterOneRoundTrip=afterOneRoundTrip+costRemaining;


        }
        //System.out.println(afterOneRoundTrip);

        if(afterOneRoundTrip>=0)
        {
            return 1;
        }

     return -1;
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] gas={1,2,3,4,5};
        int [] cost={3,4,5,1,2};
        GasStation roundTrip=new GasStation();

        System.out.println(roundTrip.isGasStation(gas,cost));


    }
}
