import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class TestMonkey {
    //@Mock

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGenerateIdCase1() {
        int offset = 223492;
        int n = 1;
        int expected = n + offset;
        int observed = new Monkey().generateId(n);
        assertEquals(observed, expected);
    }

    @Test
    public void testGenerateIdCase2() {
        int offset = 223492;
        int n = 484;
        int expected = n + offset;
        int observed = new Monkey().generateId(n);
        assertEquals(observed, expected);
    }

    @Test
    public void testGenerateIdCase3() {
        int offset = 223492;
        int n = 1300;
        int expected = n + offset;
        int observed = new Monkey().generateId(n);
        assertEquals(observed, expected);
    }

}