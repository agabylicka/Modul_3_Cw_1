import org.junit.jupiter.api.Test;
import org.trzcinska.Suma;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    private Suma testObject = new Suma();
    @Test
    public void sumEqualsNine(){
        int[] nums = new int[]{1,3,5};
        assertEquals(9,testObject.sumArray(nums));
    }

    @Test
    public void sumEqualsNegatives(){
        int[] nums = new int[]{-1,-3,-5};
        assertEquals(-9,testObject.sumArray(nums));
    }
}
