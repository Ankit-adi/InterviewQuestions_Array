import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class  MinSwap {

    static int minimumSwaps(int[] arr) {
        int minswap=0;
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            if(i<arr[i]-1){
                swap(arr,i,Math.min(arr[i]-1,n));
                minswap++;
                i--;
            }
        }
        return minswap;
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<k;i++) {
            arr[i] = sc.nextInt();
        }
        int l=minimumSwaps(arr);
        System.out.println(l);
    }
}