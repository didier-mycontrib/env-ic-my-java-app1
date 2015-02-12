package com.mycompany.app1;

public class UserLoginImpl implements UserLogin {
	private int size=10;

	@Override
	public boolean verifyLogin(String username, String password) {
		boolean res=false;
		if(password !=null && password.equals("pwd_"+username))
			return true;
		return res;
	}

	@Override
	public String goodPasswordForUser(String username) {
			return "pwd_"+username;
	}
	
	@Override
	public void setSize(int size) {
		this.size=size;	
	}

	@Override
	public String getAuteur() {
		return "didier";
	}
	
	

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public double getDoubleValue(double x) {
		return 2 *x;
	}

	

}
