package Bit_Manipulation.java;

public class _04_switchONithBit {
    public static int switchOni(int n,int i)
    {
        int mask=1<<i;
        return n|mask;
    }
    public static void main(String[] args) {
        int n=36;
        int i=3;
        System.out.println(switchOni(n,i));
    }
}
