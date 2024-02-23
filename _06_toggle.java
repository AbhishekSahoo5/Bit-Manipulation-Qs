package Bit_Manipulation.java;

public class _06_toggle {

    public static int toggle(int n,int i)
    {
        int tmask=1<<i;
        return n^tmask;
    }
    public static void main(String[] args) {
        System.out.println(toggle(36,0));
    }
}
