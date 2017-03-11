package pl.jwrabel.trainings.javandwro2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

/**
 * Created by jakubwrabel on 11.03.2017.
 */
public class StreamsLesson {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello Worlds");

		// Strumień wyjścia
		PrintStream out = System.out;
		out.println("Strumień wyjściowy");
		System.out.println("Strumień wyjściowy");

		// Strumień błędów
		PrintStream err = System.err;
		err.println("Wystąpił błąd");
		System.err.println("Wystąpił błąd");

		// Strumień wejściowy
		int read = System.in.read();
		System.out.println(read);
		String line = new Scanner(System.in).nextLine();
		System.out.println("Przeczytana linia: " + line);



	}
}
