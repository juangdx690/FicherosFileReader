import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio {

	public static void main(String[] args) {
	
		try {
			FileReader f = new FileReader("C:\\Users\\juan\\Desktop\\f.txt");
			int c = f.read();
			while(c != -1) {
				
				System.out.print((char)c);
				c=f.read();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
