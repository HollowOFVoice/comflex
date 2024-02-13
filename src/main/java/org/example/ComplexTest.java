package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {


    Complex strrr = new Complex(5,5,4,4);





@Test

    public void testStr(){


    String opa = strrr.str();
    assertEquals("Результат метоода str: 5+5i", opa);

}

    @Test

    public void testAdd(){
        int opak = strrr.add();
        assertEquals(10, opak);

    }

    @Test

    public void testSub(){
        int ref = strrr.sub();
        assertEquals(0, ref);

    }

    @Test

    public void testMul(){
        int jija = strrr.mul();
        assertEquals(25, jija);

    }

    @Test

    public void testDiv(){
        int haski = strrr.div();
        assertEquals(1, haski);

    }


    @Test

    public void testAbs(){
        int basni = (int) strrr.abs();
        assertEquals(5, basni);

    }

}
