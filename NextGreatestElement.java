package com.keyword;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreatestElement
{

    public static void Greatest(int size,int array[])
    {
        for(int i=0;i<size;i++)
        {
            int value=-1;
            for(int j=i+1;j<size;j++)
            {
                if(array[i]< array[j])
                {
                    value = array[j];
                    break;
                }
            }
            System.out.print(value+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
        {
            array[i]= in.nextInt();
        }
        System.out.println("User Entered Array is "+ Arrays.toString(array));
        Greatest(size,array);



    }
}
