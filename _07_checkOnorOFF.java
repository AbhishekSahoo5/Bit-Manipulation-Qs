package Bit_Manipulation.java;

public class _07_checkOnorOFF {
    public static int checkONorOFF(int n, int i)
    {
        int mask=1<<i;
        int check=n & mask;
        if(check==0)
            return 0;
        else
            return 1;
    }
    public static void main(String[] args) {
        System.out.println(checkONorOFF(36,2));
    }
}
