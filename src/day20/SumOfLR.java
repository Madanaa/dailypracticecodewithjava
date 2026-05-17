package day20;

import java.util.Scanner;

public class SumOfLR {
    public static int sumOfLR(int[] arr, int l,int r){
        int sum = 0;
        for (int i = l; i <= r; i++){
            if(isPrime(i)) {
                sum = sum + arr[i];
            }
        }
        return sum;

    }
    public static boolean isPrime(int n){
        for(int i= 2; i*i<=n; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int l = 2;
        int r = 6;
        System.out.println(sumOfLR(arr,l,r));
    }

}
