import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;


public class ListUtilsTest {
    private ListUtils utils;    
    
    @Before
    public void setUp() {
        utils = new ListUtils();
    }
    
    @Test
    public void testSort() {
        ArrayList<Integer> list = 
                new ArrayList<>(Arrays.asList(5, 4, 10, -3, 23, 2, 2, 4));
        assertEquals(Arrays.asList(-3, 2, 2, 4, 4, 5, 10, 23), utils.sort(list));
    }
    
    @Test
    public void testReverse() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), utils.reverse(list));
    }
    
    @Test
    public void testCheckMonotonous() {
        assertEquals(true, utils.checkMonotonous(Arrays.asList(1, 2, 3, 4 ,5, 6)));
        assertEquals(true, utils.checkMonotonous(Arrays.asList(6, 5, 4, 3, 2, 1, 1, 1)));
        assertEquals(false, utils.checkMonotonous(Arrays.asList(1, 2, 1, 4, 5,4 )));
    }
}
