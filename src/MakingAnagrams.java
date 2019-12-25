import java .util.*;
public class MakingAnagrams {
    static int count(String str1,String str2,int n1,int n2){
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        Arrays.fill(freq1,0);
        Arrays.fill(freq2,0);
        int count=0;
        for(int i=0;i<n1;i++){
            freq1[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<n2;i++){
            freq2[str2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            count+=Math.min(freq1[i],freq2[i]);
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        String a=sc.nextLine();
        String b=sc.nextLine();
        n1=a.length();
        n2=b.length();
        int fin,kin;
        int res=count(a,b,n1,n2);
        fin=n1-res;
        kin=n2-res;
        System.out.println(fin+kin);
    }
}
