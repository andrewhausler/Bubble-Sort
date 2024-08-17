package code;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleTest {

    @Test
    public void testBubble()
    {
        BubbleSort<Integer> myBubble = new BubbleSort<Integer>(new ArrayList<Integer>(Arrays.asList(1, 5, 2, 5, 6, 2, 1, 10, -1)));
        myBubble.sort();
        ArrayList<Integer> preSortedArray = new ArrayList<Integer>(Arrays.asList(-1, 1, 1, 2, 2, 5, 5, 6, 10));
        assertEquals(preSortedArray, myBubble.getArray());
    }
    
}
