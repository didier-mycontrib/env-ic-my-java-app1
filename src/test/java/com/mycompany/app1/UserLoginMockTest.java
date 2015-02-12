package com.mycompany.app1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;


public class UserLoginMockTest {
	
    private static UserLogin userLogin;

    @BeforeClass
    public static void init(){
    	//userLogin=new UserLoginImpl();
    	//userLogin = Mockito.mock(UserLogin.class);
    	//userLogin = Mockito.mock(UserLoginImpl.class);
    	userLogin = Mockito.spy(new UserLoginImpl());
    }
    
    @Test 
    public void verifyCall(){
			userLogin.setSize(20); 
			//userLogin.getAuteur();
			//userLogin.setSize(15); //appel souvent indirect depuis le code caché d'un composant
			Mockito.verify(userLogin).setSize(Mockito.eq(20));
			Mockito.verify(userLogin, Mockito.never()).getAuteur();
    }
    
    @Test
    public void displayReturnValues(){
    	try {
			boolean pwdOk= userLogin.verifyLogin("toto", "pwd_toto");
			System.out.println("pwdOk="+pwdOk);
			
			String goodPwd= userLogin.goodPasswordForUser("toto");
			System.out.println("goodPwd="+goodPwd);
			
			String auteur = userLogin.getAuteur();
			System.out.println("auteur="+auteur);
			
			//Mockito.when(userLogin.getSize()).thenReturn(5);
			//Mockito.doNothing().when(userLogin).setSize(Mockito.anyInt());
			Mockito.doThrow(new IllegalArgumentException()).when(userLogin).setSize(Mockito.eq(-1));
			userLogin.setSize(20);
			int taille = userLogin.getSize();
			System.out.println("taille="+taille);
			//Mockito.when(userLogin.getSize()).thenCallRealMethod();
			//Mockito.doCallRealMethod().when(userLogin).setSize(Mockito.anyInt()); // existe Mockito.anyString() , ...
			//userLogin.setSize(20);
			//taille = userLogin.getSize();
			//System.out.println("taille="+taille);
			
			double  val = userLogin.getDoubleValue(3.2);
			System.out.println("val="+val);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void testVerifyLogin()
    {   //Mockito.when(userLogin.verifyLogin("toto", "pwd_toto")).thenReturn(true);
    	
    	boolean pwdOk= userLogin.verifyLogin("toto", "pwd_toto");
        //System.out.println("pwdOk="+pwdOk);
        Assert.assertTrue( pwdOk );
        
      
        
        Assert.assertFalse( userLogin.verifyLogin("toto", "wrong_pwd") );
    }
    
    @Test
    public void testgoodPassword()
    {
    	//Mockito.when(userLogin.goodPasswordForUser("toto")).thenReturn("pwd_toto");
    	
    	String goodPwd= userLogin.goodPasswordForUser("toto");
    	//System.out.println("goodPwd="+goodPwd);
        Assert.assertEquals( goodPwd, "pwd_toto" );
    }


}
