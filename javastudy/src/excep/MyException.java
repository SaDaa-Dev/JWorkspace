package excep;

public class MyException extends Exception {

	String exMsg;
	
	public MyException (String msg) {
		exMsg = "MyException: " + msg ;
	}
	
	@Override
	public String getMessage() {
		return exMsg;
	}
	
	
}
