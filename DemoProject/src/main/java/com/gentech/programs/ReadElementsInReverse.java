package com.gentech.programs;

public class ReadElementsInReverse {
    public static void main(String[] args) {

        int arr[]={10,20,30,40,50,60};
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
