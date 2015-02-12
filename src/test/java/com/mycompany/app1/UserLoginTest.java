package com.mycompany.app1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserLoginTest {
	
	
    private static UserLogin userLogin;

    //@Before
    @BeforeClass
    public static void init() /* or setUp or ... */{
    	userLogin = new UserLoginImpl();
    }
    
    @Test
    public void testVerifyLogin()
    {
        Assert.assertTrue( userLogin.verifyLogin("toto", "pwd_toto") );
        Assert.assertFalse( userLogin.verifyLogin("toto", "wrong_pwd") );
    }
    
    @Test
    public void testgoodPassword()
    {
        Assert.assertEquals( userLogin.goodPasswordForUser("toto"), "pwd_toto" );
    }

}
