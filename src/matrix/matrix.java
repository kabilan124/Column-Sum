package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class matrix {
    public static int[] Collsum(int arr[][],int N, int M) {
        int ar[]=new int[M];
        for(int j=0;j<M;j++) {
            int sum=0;
            for(int i=0;i<N;i++)
            {
                sum=sum+arr[i][j];
            }
            ar[j]=sum;
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int value[]=Collsum(arr,n,m);
        System.out.println(Arrays.toString(value));

    }

}
