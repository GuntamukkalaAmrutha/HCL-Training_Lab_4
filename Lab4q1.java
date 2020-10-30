import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Lab4q1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("file.txt");
			int line = 0;
			
			while((line = fis.read()) != 0) {
				System.out.print((char)line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			
		}
	}
}