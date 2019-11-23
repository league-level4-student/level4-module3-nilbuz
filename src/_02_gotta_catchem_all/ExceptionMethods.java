package _02_gotta_catchem_all;

public class ExceptionMethods {

	void divide(double a, double b) throws IllegalArgumentException {
		
		
		if (b == 0.0) {
			throw new IllegalArgumentException();
		}

	}

	String reverseString(String s) throws IllegalStateException {

		if (s.isEmpty()) {
			throw new IllegalStateException();
		}

		return s;
	}

}
