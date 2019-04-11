package lesson2;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int []array={9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(array));
    }
    public static int solution(int[] A){
        BigInteger el=BigInteger.ZERO;
        long result=0;
        HashMap<BigInteger,Integer> mapa=new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (mapa.containsKey(A[i])) mapa.put(new BigInteger(String.valueOf(A[i])),mapa.get(new BigInteger(String.valueOf(A[i])).add(BigInteger.ONE)));
            else mapa.put(new BigInteger(String.valueOf(A[i])),1);
        }
        System.out.println(mapa);
        for (Map.Entry<BigInteger,Integer> element:mapa.entrySet()
             ) {
            if (element.getValue()==1) el=element.getKey();
        }
        return (int)el.longValue();
    }
}
