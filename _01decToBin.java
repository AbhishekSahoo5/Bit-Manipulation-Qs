package Bit_Manipulation.java;

public class _01decToBin {
    public static String decimalToBinary(int n)
    {
        String b="";
        while(n>=1)
        {
            int x=n%2;
            n=n/2;
            b=x+b;
        }
        return b;
    }
    public static void main(String[] args) {
        int n=104;
        System.out.println(decimalToBinary(n));
    }
}
