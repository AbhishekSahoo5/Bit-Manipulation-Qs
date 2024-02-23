package Bit_Manipulation.java;
//Find the position of the right most set bit
import java.util.*;
public class _08_positionRightMostSetBit {

    public static int posOfRMSB(int n)
    {
        int m=1;
        int pos=0;
        if(n==0)
        {
            return -1;
        }
        while((n&m)==0){
            m=m<<1;
            pos++;
        }
        return pos+1;
    }
    public static int optiRMSB(int n)
    {
        int mask=n&(n-1);
        n=n^mask;
        //Math.log10---->return a double by default
        double pos=Math.log10(n)/Math.log10(2);
        return (int)(pos+1);
//Time complexity=O(1)

    }
    public static void main(String[] args) {
        System.out.println(posOfRMSB(0));
        System.out.println(optiRMSB(40));
    }
}
