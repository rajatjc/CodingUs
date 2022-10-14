package com.company;

import java.util.Scanner;

public class triange {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        String input = s.nextLine();
        String[] arr = input.split(",");
        int count=1;
        int max = 0;
        int first = 0;
        if(arr.length==0)
            System.out.println(0);
        else if(arr.length==1)
            System.out.println(1);
        else {
            for (int i = 1; i < arr.length; i++) {
                if (Integer.parseInt(arr[i - 1]) < Integer.parseInt(arr[i]) && Integer.parseInt(arr[i])!= Integer.parseInt(arr[first]) ) {
                    count++;

                }
                else if(Integer.parseInt(arr[i - 1]) > Integer.parseInt(arr[i]) && Integer.parseInt(arr[i])!= Integer.parseInt(arr[first])) {
                    count++;
                }
                else if(i+1< Integer.parseInt(n) && ((Integer.parseInt(arr[i - 1]) < Integer.parseInt(arr[i]) && Integer.parseInt(arr[i+1]) > Integer.parseInt(arr[i]) && Integer.parseInt(arr[i])!= Integer.parseInt(arr[first])) || (Integer.parseInt(arr[i - 1]) > Integer.parseInt(arr[i]) && Integer.parseInt(arr[i+1]) < Integer.parseInt(arr[i]) && Integer.parseInt(arr[i])!= Integer.parseInt(arr[first])))  ) {
                    count++;
                }
                else{


                    if(max<=count){
                        if(Integer.parseInt(arr[i])== Integer.parseInt(arr[first]))
                        max = count+1;
                        else max = count;
                        }
                    count = 1;
                    first = i;
                }
            }
        }
        if(max<=count)
            max = count;
        System.out.println(max);
    }
}
/**
10
0,1,2,3,2,1,0,4,7,6

9
0,1,2,3,3,4,5,7,6

5
0,1,2,3,3

 */