package com.mycompany.app1;



import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * JUnit 4 test for simple Calculateur.
 */
public class CalculateurTest 
{
    //private Calculateur c; // with @Before on setUp()
    private static Calculateur c;

    //@Before
    @BeforeClass
    public static void init() /* or setUp or ... */{
      c = new Calculateur();
    }
    
    @Test
    public void testAdd()
    {
        Assert.assertEquals( c.add(5,6) , 11 , 0.000001 );
    }
    
    @Test
    public void testMult()
    {
        Assert.assertEquals( c.mult(5,6) , 30 , 0.000001 );
    }
}
