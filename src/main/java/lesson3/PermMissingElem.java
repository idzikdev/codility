package lesson3;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        int [] array={2,3,1,5};
        System.out.println(solution(array));
    }
    public static int solution(int[] A){
        int suma=0;
        int sum=0;
        if (A.length>1){
            Arrays.sort(A);
            int a=A[0];
            int b=A[A.length-1];

            for (int i = 0; i < A.length; i++) {
                suma=suma+A[i];
            }
            sum=((a+b)/2)*(A.length+1);
        }
        return (int)(sum-suma);
    }
}
