/* Dynamic Insert/Delete Simulation */

import java.util.*;
public class prog3{
    public static void main(String args[])
    {    
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println("");
        System.out.println("Created an Array with 0-5 numbers!");
        System.out.println("");
        System.out.println("Select the operation you want to perform->");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Show Array");
        System.out.println("4. Exit and Show Final Array!");
        System.out.println("");
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
        while(input!=4)
        {
            if(input==1)
            {
                System.out.println("Enter Number to Insert:");
                int number = sc.nextInt();
                array.add(number);
                System.out.println("Number Inserted!");
                System.out.println("");
            }
            else if(input==2)
            {
                System.out.println("Enter Number to Delete:");
                int number =  sc.nextInt();
                if(array.contains(number))
                {
                    array.remove(Integer.valueOf(number));
                    System.out.println("Number Deleted!");
                    System.out.println("");
                }
            }
            else if(input==3)
            {
                System.out.println("Current Array:");
                System.out.println(array);
                System.out.println("");
            }
            System.out.println("Select the operation you want to perform->");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Show Array");
            System.out.println("4. Exit and Show Final Array!");
            System.out.println("");
            input = sc.nextInt();
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Final Array:");
        System.out.println(array);
        System.out.println("");
        System.out.println("Exiting...");
        sc.close();
    }
}