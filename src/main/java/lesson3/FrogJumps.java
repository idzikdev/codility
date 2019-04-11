package lesson3;

public class FrogJumps {
    public static void main(String[] args) {
        System.out.println(solution(1,5,2));
    }
    public static int solution(int X, int Y, int D){
        int result=0;
        while (X<Y){
            X=X+D;
            result++;
        }
        return result;
    }
}
