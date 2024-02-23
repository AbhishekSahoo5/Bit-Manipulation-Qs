package Bit_Manipulation.java;

public class _10_checkPowerOf2 {
    public static boolean powerOf2(int n)
    {
        if(n==0)
        {
            return false;
        }
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(powerOf2(2));
        System.out.println(powerOf2(4));
        System.out.println(powerOf2(16));
        System.out.println(powerOf2(128));
        System.out.println(powerOf2(24));
    }
}
