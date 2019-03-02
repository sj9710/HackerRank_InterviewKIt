/*
    John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

    For example, there are n = 7  socks with colors ar = [1,2,1,2,1,3,2] . There is one pair of color 1  and one of color 2 . There are three odd socks left, one of each color. The number of pairs is 2.
*/
import java.util.*;
import static java.lang.System.*;
class sockmerchant
{
    public static void main(String...s)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Hashtable <Integer , Integer> ob = new Hashtable<Integer , Integer>();
        out.println("Enter the size of the stock: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        out.println("Enter the elements in the array: ");
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < size ; i++)
        {
            if(ob.containsKey(arr[i]))
            {
                count++;
                ob.remove(arr[i]);
            }
            else
                ob.put(arr[i], i);
        }
        out.println(count);
    }
}
