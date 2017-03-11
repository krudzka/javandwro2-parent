package pl.jwrabel.trainings.javandwro2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by jakubwrabel on 11.03.2017.
 */
public class FileStreams {
	public static void main(String[] args) throws IOException {
		// FileOutputStream
//		FileOutputStream fos = new FileOutputStream("test.txt");

		// Strummień DODAJĄCY do pliku
		FileOutputStream fos = new FileOutputStream("test.txt", true);
		fos.write(97);

		String testString = "Lorem ipsum";
		byte[] bytes = testString.getBytes();
		fos.write(bytes);

		fos.write("abc".getBytes());

		fos.close();


		// FileInputStream
		FileInputStream fileInputStream = new FileInputStream("testIn.txt");
//		int read = fileInputStream.read();
//		System.out.println((char)read);

//		int read;
//		while ((read = fileInputStream.read()) > 0) {
//			System.out.println((char) read);
//		}

		byte[] array = new byte[4];
		fileInputStream.read(array);
		String s = new String(array);
		System.out.println(s);

		fileInputStream.close();


	}
}
