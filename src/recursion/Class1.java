package recursion;

public class Class1 {
    public static void main(String[] args) {

        printIncreasing(5,9);
        System.out.println();
        printDecreasing(5,9);
        System.out.println();
        printDecreasing1(5,9);
        System.out.println();
        printIncreasingDecreasing(5,9);
        System.out.println();
       // printOddEven(5,9);
    }
    public static void printIncreasing(int a ,int b)
    {
        if(a>b)
            return;
        System.out.print(a+" ");
        printIncreasing(a+1,b);
    }

    public static void printDecreasing(int a ,int b)
    {
        if(a>b)
            return;
        System.out.print(b+" ");
        printDecreasing(a,b-1);
    }

    public static void printDecreasing1(int a ,int b)
    {
        if(a>b)
            return;
        printDecreasing1(a+1,b);
        System.out.print(a+" ");

    }

    public static void printIncreasingDecreasing(int a ,int b)
    {
        printIncreasing(a,b);
        printDecreasing(a,b);
    }

    public static void printOddEven(int a ,int b)
    {



    }
}
