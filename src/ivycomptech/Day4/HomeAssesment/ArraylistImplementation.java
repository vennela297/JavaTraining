package ivycomptech.Day4.HomeAssesment;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistImplementation {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("blue");
        list.add("green");
        list.add("yellow");
        list.add("pink");
        list.add("orange");

        //TASK:3 insert element at first position
        list.add(1,"green");

        //TASK:4 iterate through the list
        for(String str:list)
        {
            System.out.println(str);
        }

        //TASK4 : print an element at a specified position
        System.out.println(list.get(2));
        //TASK5: update at a specific index
        System.out.println(list.set(1,"black"));

        //TASK 6: remove at the given index
        System.out.println(list.remove(3));

        //TASK 7 : search for an element in the array list
        System.out.println(list.contains("yellow"));

        //TASK 8: sorting
        Collections.sort(list);
        System.out.println(list);

        //TASK9: copy
        ArrayList<String> list2=new ArrayList<>(list);
        System.out.println(list2);

        //TASK 10 : shuffle all the elaments
        Collections.shuffle(list);
        System.out.println(list);

        //TASK 11: reverse the elements of the arraylist
        Collections.reverse(list);
        System.out.println(list);


        //TASK 12: get the sub list
        System.out.println(list.subList(1,3));


        //TASK 13: compare arraylist
        System.out.println(list.equals(list2));
        //TASK 14: swap 2 elements of an arraylist
        Collections.swap(list,1,3);
        System.out.println(list);

        //TASK 15: join 2 arraylists
        list.addAll(list2);
        System.out.println(list);

        //TASK 16: clone a list
        ArrayList<String> cloned_list
                = new ArrayList<String>(list);
        System.out.println(cloned_list);

        //TASK 17: empty a list
       cloned_list.removeAll(list);
        System.out.println(cloned_list);

        //TASK 18 : test if the arraylist is empty or not
        System.out.println(cloned_list.isEmpty());

        //TASK 19: trim to size
        list.trimToSize();
        System.out.println(list.size());

        //TASK 20: increase the size of an arraylist
        list2.ensureCapacity(500);
        System.out.println(list2.size());

        //TASK 22: replace the second element of the arraylist with the given element
        list2.set(2,"pale");
        System.out.println(list2);

        //TASK 22: find element at the given index
        System.out.println(list.get(2));
    }
}
