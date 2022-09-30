import java.util.Scanner;

public class eg1 {
    public static void main(String[] args) {
        System.out.println("hello");
//        Object[] arr = new Object[6];
//
//        arr[0] = new String("First Pair");
//        arr[1] = new Integer(1);
//        arr[2] = new String("Second Pair");
//        arr[3] = new Integer(2);
//        arr[4] = new String("Third Pair");
//        arr[5] = new Integer(3);
//        int x = (Integer)arr[3];
//        System.out.println(x);
//
//
//        Object[] a = new Object[]{1,2,3,"srk"};
//        for(Object o: a){
//            System.out.println();
//        }
//        double [] codes = new double[100];
//        int count = 100;
//        System.out.println(codes[count]);

//        int[] scores = new int [10];
//        System.out.print(scores.length);


        Scanner sc=new Scanner(System.in);


        int[][] hel=new int[4][4];
        for(int i=0;i<4;i++)
        {
            String s1=sc.nextLine();
            String[] s11;
            s11=s1.split(" ");
            for(int j=0;j<4;j++)
            {
                hel[i][j]=Integer.parseInt(s11[j]);
            }
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println(hel[i][j]);
            }
        }

    }
}


