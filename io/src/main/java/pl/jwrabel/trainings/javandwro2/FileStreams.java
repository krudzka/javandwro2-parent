package pl.jwrabel.trainings.javandwro2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

//		byte[] array = new byte[4];
//		fileInputStream.read(array);
//		String s = new String(array);
//		System.out.println(s);
//
//		fileInputStream.close();
//

		// WCZYTYWANIE CYFRY Z PLIKU
//		FileInputStream fileInputStream1 = new FileInputStream("testLiczba.txt");
//
//		int value = fileInputStream1.read() - 48;
//		System.out.println(value);
//
//		fileInputStream1.close();

		// WCZYTYWANIE LICZBY Z PLIKU
//		FileInputStream fis = new FileInputStream("C:\\Users\\RENT\\Desktop\\testLiczba.txt");
		FileInputStream fis = new FileInputStream("testLiczba.txt");

		List<Integer> list = new ArrayList<>();
		int readValue;
		while ((readValue = fis.read()) > 0) {
			int numberValue = readValue - 48;
			list.add(numberValue);
		}

		int number = 0;
		int multiplier = 1;
		for (int i = list.size() - 1; i >= 0; i--) {
			number += list.get(i) * multiplier;
			multiplier *= 10;
//			multiplier = multiplier*10;
		}

		System.out.println(number);


		// SCIEŻKA WZGLĘDNA I BEZWZGLĘDNA
		// BEZWZGLĘDNA (ABSOLUTE PATH) C:\test\mojFolder\test.txt
		// WZGLEDNA (RELATIVE PATH)   mojFolder\test.txt

		// PRZECZYTANIE CAŁEGO PLIKU DO STRINGA
//		FileInputStream fisLoremIpsum = new FileInputStream("testLoremIpsum.txt");
//		StringBuilder stringBuilder = new StringBuilder();
//
//		int tmp;
//		while ((tmp = fisLoremIpsum.read()) > -1) {
////			if ((char) tmp != '\n') {
////				stringBuilder.append((char) tmp);
////			}
//			stringBuilder.append((char) tmp);
//		}
//
////		System.out.println(stringBuilder);
////		System.out.println(stringBuilder.toString().replaceAll("\n", ""));
//		System.out.println(stringBuilder.toString());


		// BufferedInputStream
		FileInputStream inputStreamToBuffer = new FileInputStream("testLoremIpsum.txt");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamToBuffer);

//		bufferedInputStream.read()


		bufferedInputStream.close();
		inputStreamToBuffer.close();

		// BufferedOutputStream jest lepszy od file od file po kolei wchodzi do kazzdego plikunp po kazdego chara a buffer sb bierze jakis bufor, np calego stringa i na nim operuje
		FileOutputStream fosToBuffer = new FileOutputStream("test.txt");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fosToBuffer);

		bufferedOutputStream.write(97);

		bufferedOutputStream.flush();
		bufferedOutputStream.close();
		fosToBuffer.close();


		// System.console()
		System.console().readLine();
		new Scanner(System.in).nextLine();


		// FileWriter
		FileWriter fileWriter = new FileWriter("test.txt");
//		FileWriter fileWriter = new FileWriter("test.txt", true);
		fileWriter.write("asdfghj");
		fileWriter.close();

		// FileReader
		FileReader fileReader = new FileReader("test.txt");
		int read = fileReader.read();
		fileReader.close();

		// BufferedWriter
		FileWriter out = new FileWriter("test.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(out);

		// BufferedReader

	}
}
