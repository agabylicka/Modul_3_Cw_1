import org.junit.jupiter.api.Test;
import org.trzcinska.Suma;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    private Suma testObject = new Suma();

    @Test
    public void test_sumEqualsNine() {
        int[] nums = new int[]{1, 3, 5};
        assertEquals(9, testObject.sumArray(nums));
    }

    @Test
    public void test_sumEqualsNegatives() {
        int[] nums = new int[]{-1, -3, -5};
        assertEquals(-9, testObject.sumArray(nums));
    }

    @Test
    public void test_maxValue() {
        int[] nums = new int[] {Integer.MAX_VALUE, 3, 5};
        assertEquals((Long.valueOf((long)Integer.MAX_VALUE + 8L)).intValue(), testObject.sumArray(nums));
    }

    @Test
    public void test_subtraction() {
        int[] nums = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        assertEquals(-1, testObject.sumArray(nums));
    }

    @Test
    public void test_sumEqualsZero() {
        int[] nums = new int[]{-1, 0, 1};
        assertEquals(0, testObject.sumArray(nums));
    }

    @Test
    public void test_withRandom() {
        // given
        int random = new Random().nextInt();
        int random2 = new Random().nextInt();
        int random3 = new Random().nextInt();
        int expected = random + random2 + random3;
        int[] nums = new int[]{random, random2, random3};
        // when-then
        assertEquals(expected, testObject.sumArray(nums));
    }
}



