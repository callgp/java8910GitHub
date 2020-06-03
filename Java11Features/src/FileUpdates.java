import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUpdates {
	
	public static void main(String[] args) throws IOException {
		Path path = Files.writeString(Files.createTempFile("test", ".txt"),"java 11 is cool");
		
		System.out.println(path);
		String str = Files.readString(path);
		System.out.println(str);
	}

}


/*
 * C:\Users\gp\AppData\Local\Temp\test5316459060251099754.txt java 11 is cool
 */
