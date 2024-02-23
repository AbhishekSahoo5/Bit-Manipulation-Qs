package Bit_Manipulation.java;

public class _05_switchOFFithBit {
    public static int switchOFFI(int n, int i)
    {
        int mask=1<<i;
        mask=~mask;
        return n&mask;
    }
    public static void main(String[] args) {
        int n=36;
        int i=5;
        System.out.println(switchOFFI(n,i));
    }
}
