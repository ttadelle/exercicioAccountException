package model.Exceptions;

public class AccountExceptions extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public AccountExceptions (String msg) {
		super(msg);
	}
}
