package lesson1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestIterations {
    @Test
    public void test(){
        assertEquals(4,Iterations.solution(529));
        assertEquals(2,Iterations.solution(9));
        assertEquals(0,Iterations.solution(2));
        assertEquals(1,Iterations.solution(20));
        assertEquals(0,Iterations.solution(15));
        assertEquals(0,Iterations.solution(32));
        assertEquals(5,Iterations.solution(1041));
        assertEquals(0,Iterations.solution(32));
    }
}
