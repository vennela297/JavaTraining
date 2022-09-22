//The Java class called Holiday is started below. An object of class Holiday represents a holiday during the year. This class has three instance variables:
//name, which is a String representing the name of the holiday
//day, which is an int representing the day of the month of the holiday
//month, which is a String representing the month the holiday is in
//Write a constructor for the class Holiday, which takes a String representing the name, an int representing the day, and a String representing the month as its arguments, and sets the class variables to these values.
//
//Write a method inSameMonth, which compares two instances of the class Holiday, and returns the Boolean value true if they have the same month, and false if they do not.
//
//Write a method avgDate which takes an array of base type Holiday as its argument, and returns a double that is the average of the day variables in the Holiday instances in the array. You may assume that the array is full (i.e. does not have any null entries).
//
//Write a piece of code that creates a Holiday instance with the name


package ivycomptech.Day7.HomeAssesment;

import java.util.ArrayList;

public class Holiday {
    public String name;
    public int day;
    public String month;
    Holiday()
    {

    }

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday h1,Holiday h2)
    {
        if((h1.month.toLowerCase()).equals(h2.month.toLowerCase()))
            return true;
      return false;
    }
    int sum=0;
    public double avgDate(ArrayList<Holiday> list)
    {
        for(Holiday event:list)
        {
            sum=sum+event.day;

        }

        return (double) sum/list.size();
    }

    public static void main(String[] args) {
        Holiday holiday=new Holiday();
        Holiday h1=new Holiday("Holi",5,"March");
        Holiday h2=new Holiday("Birthday",26,"March");
        Holiday h3=new Holiday("Birthday",06,"Feb");
        Holiday h4=new Holiday("ramzan",06,"Nov");
        Holiday h5=new Holiday("Diwali",26,"Nov");
        Holiday h6=new Holiday("Independence Day",4,"July");

        ArrayList<Holiday> list=new ArrayList<>();
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);

        System.out.println(holiday.inSameMonth(h1,h2));
        System.out.println(holiday.avgDate(list));
        System.out.println(h6.name+" "+h6.day+" "+h6.month);
    }
}
