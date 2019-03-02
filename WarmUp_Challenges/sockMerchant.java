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
