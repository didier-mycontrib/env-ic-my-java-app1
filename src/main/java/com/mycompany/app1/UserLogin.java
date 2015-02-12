package com.mycompany.app1;

public interface UserLogin {
	
	public boolean verifyLogin(String username,String password);
    public String goodPasswordForUser(String username);
    public void setSize(int size);
    //pour tester valeur de retour par défaut:
    public String getAuteur();
    public int getSize(); //return nbAccount ( >=0)
    public double getDoubleValue(double x); //return x * 2
}
