package Bit_Manipulation.java;

public class _13_swapEvenAndOddBits {

    //Question ----> WAP to swap the even and odd bits in a given number
    public static int  swapEvanOddBits(int n)
    {
        int evenBits=(n & 0xAAAAAAAA)>>>1;
        int oddBits=(n & 0x55555555)<<1;
        int swapBits=evenBits | oddBits;
        return swapBits;
    }
    public static void main(String[] args) {
        int n=181;
        System.out.println(swapEvanOddBits(n));
    }
}
