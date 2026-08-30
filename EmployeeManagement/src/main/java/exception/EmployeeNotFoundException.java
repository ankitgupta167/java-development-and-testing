//package exception;
//
//public class EmployeeNotFoundException {
//
//}
package exception;

public class EmployeeNotFoundException extends RuntimeException {
	
	public EmployeeNotFoundException(String message) {
		super(message);
	}

}