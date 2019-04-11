package lesson1;

public class Iterations {
    public static void main(String[] args) {
        System.out.println(solution(2));
    }

    public static int solution(long N) {
        int counter=0;
        int max=0;
        boolean checking=false;
        String binary = Long.toBinaryString(N);
        System.out.println(binary);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i)=='0')
               if (checking) counter++;

            if (binary.charAt(i)=='1')
                if (checking) {
                    if (counter>max) {
                        max=counter;
                        counter=0;
                    }
                    checking=false;
                }
            else checking=true;

        }
        return max;
    }
}
