package pl.jwrabel.trainings.javandwro2;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.Files;
import com.google.common.io.Resources;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by RENT on 2017-03-11.
 */
public class GuavaDemo {
    public static void main(String[] args) throws IOException {
        List<String> linesInFile = Files.readLines(new File("test.txt"), Charsets.UTF_8); //mamy liste kazda linijka w pliku to inny string

        CharSink charSink = Files.asCharSink(new File("test.txt"), Charsets.UTF_8);
        //zapisanie stringa do pliku
        charSink.write("String");
        //zapisanie listy stringow do pliku
        List<String>stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("cdf");
        charSink.writeLines(stringList);//cala powyzsza liste mozna od razu zapisac do pliku

        //przeczytanie calego pliku do stringa
        String fileContent=Files.toString(new File("text.txt"),Charsets.UTF_8);
        //stworzenie pliku
        Files.touch(new File("newFile.txt"));

        //skopiowanie plików
        Files.copy(new File("a.txt"),new File("b.txt"));

        //przeniesienie do pliku
        Files.move(new File ("a.text"), new File("C:\\a.txt"));

        //przeczytanie zasobu
        URL resource = Resources.getResource("test.txt");
        String resourceAsString = Resources.toString(resource,Charsets.UTF_8);
    }
}
