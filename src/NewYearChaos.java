import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int t=sc.nextInt();
            int a[]=new int[t];
            for(int q=0;q<t;q++){
                a[q]=sc.nextInt();
            }
            int bribe=0;
            boolean chaos=false;
            for(int k=0;k<t;k++){
                if(a[k]-(k+1)>2){
                    chaos=true;
                    break;
                }
                for(int j=Math.max(0,a[k]-2);j<k;j++){
                    if(a[j]>a[k])
                        bribe++;
                }
            }
            if(chaos==true)
                System.out.println("Too chaotic");
            else
                System.out.println(bribe);

        }
    }
}
