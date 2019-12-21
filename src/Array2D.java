
import java.util.*;

    public class Array2D {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int i,j;
            int[][] arr = new int[6][6];
            int maxVal = Integer.MIN_VALUE;

            for (i = 0; i < 6; i++) {
                for (j = 0; j < 6; j++) {
                    arr[i][j]=scanner.nextInt();
                }
            }
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if(i>3 || j>3) continue;
                    int max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    if(max>maxVal){
                        maxVal=max;
                    }
                }
            }
            System.out.println(maxVal);
        }
    }
}
