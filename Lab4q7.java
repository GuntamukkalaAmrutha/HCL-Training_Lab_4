package Lab4q7;
import java.io.IOException;
import Lab4q6.InputException;
public class Lab4q7 {
	public static void main(String[] args) {
		Exception exception = new Exception();
		try {
			exception.throwException();
		} catch (InputException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

