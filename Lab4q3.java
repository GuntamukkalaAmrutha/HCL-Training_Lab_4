package Lab4q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Lab4q3 {
	public static void main(String[] args) {
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tester3.ser"));
			Employee employee = new Employee("Amrutha", 12345, "andhra", 17000.0);
			oos.writeObject(employee);
			employee.display();
			System.out.println("successfully serialized..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("tester3.ser"));
			Employee employeeObj = (Employee) ois.readObject();
			employeeObj.display();
			System.out.println("deserialized successfully...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}