package Bit_Manipulation.java;
import java.util.*;
public class _11_lonelyInteger {

    //Question---->Given an array of integer, whereall elements
     //               but one occur twice, find the unique element.
    public static int lonelyInteger(int []arr)
    {
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-2;i=i+2)
        {
            if(arr[i]!=arr[i+1])
            {
                return arr[i];
            }
        }
        return arr[n-1];
    }
    public static int lonelyInteger2(int []arr){
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i : arr){
            if(set.contains(i)){
                set.remove(i);
            }else {
                set.add(i);
            }
        }
        for(int i:set){
            return i;
        }
        return -1;
    }
    public static int lonelyInteger3(int []arr)
    {
          int result=0;
          for(int i=0;i<arr.length;i++)
        {
            result^=arr[i];
        }
         return result;
    }
    public static void main(String[] args) {
        int arr[]={3,1,4,4,5,3,1};
        System.out.println(lonelyInteger(arr));
        System.out.println(lonelyInteger2(arr));
        System.out.println(lonelyInteger3(arr));
    }
}
