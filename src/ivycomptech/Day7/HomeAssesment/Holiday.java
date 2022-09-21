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
