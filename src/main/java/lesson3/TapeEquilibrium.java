package lesson3;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int [] array={3,1,2,4,3};
        System.out.println(solution(array));
    }
    public static int solution(int[] A){
        int main=0;
        for (int i = 0; i < A.length; i++) {
            main=main+A[i];
        }
        int min=main;
        int second=0;
        int first=0;
        for (int i = 1; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                second=second+A[j];
            }
            first=main-second;
            if (Math.abs(first-second)<min){
                min=Math.abs(first-second);
                second=0;
            }
        }
        return min;
    }
}
