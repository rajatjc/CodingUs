public class eg1 {
    public static void main(String[] args) {
        System.out.println("hello");
        Object[] arr = new Object[6];

        arr[0] = new String("First Pair");
        arr[1] = new Integer(1);
        arr[2] = new String("Second Pair");
        arr[3] = new Integer(2);
        arr[4] = new String("Third Pair");
        arr[5] = new Integer(3);
        int x = (Integer)arr[3];
        System.out.println(x);


        Object[] a = new Object[]{1,2,3,"srk"};
        for(Object o: a){
            System.out.println();
        }
    }
}


