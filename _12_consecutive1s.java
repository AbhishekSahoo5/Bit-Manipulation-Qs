package Bit_Manipulation.java;

public class _12_consecutive1s {

    //Question-----> Find the length of consequtive 1s in the binary representation of a number.


    //to check that consecutive 1s exist or not
    public static boolean isConsequtive(int n)
    {
        if((n&(n<<1))!=0)
        {
            return true;
        }else {
            return false;
        }
    }

    //To count the no. of consequtive 1s
    public static int noOfConsequtive1s(int n)
    {
        int count=0;
        while(n>0){
            n=n&(n<<1);
            count++;
        }
        return count;

    }
    public static void main(String[] args) {
        int n=255;
        System.out.println(isConsequtive(n));
        System.out.println(noOfConsequtive1s(n));
    }
}
