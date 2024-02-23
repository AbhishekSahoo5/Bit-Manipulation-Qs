package Bit_Manipulation.java;

public class _02_binToDec {
    public static int binaryToDecimal(String b)
    {
        int result=0;
        int powerOf2=1;           //2 to the power 0 = 1
        for(int i=b.length()-1;i>=0;i--)
        {
            if(b.charAt(i)=='1')
            {
                result+=powerOf2;
            }
            powerOf2*=2;
        }
        return result;
    }
    public static void main(String[] args) {
        String b="10101";
        System.out.println(binaryToDecimal(b));
    }
}
