package pl.jwrabel.trainings.javandwro2;

import com.google.common.base.Joiner;
import com.google.common.io.CharSink;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import org.apache.commons.io.Charsets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-11.
 */
public class PractiseFile {
    public static void main(String[] args) throws IOException {
        CharSink charSink = Files.asCharSink(new File("numbers.csv"), Charsets.UTF_8, FileWriteMode.APPEND);

        for (int i = 0; i <= 100; i++) {
            if (i == 100) {
                charSink.write("" + i);
            } else {
                charSink.write("" + i + " ,");
            }
        }

        //lub z uzyciem joinera
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            numbers.add("" +i);

        }

        String join = Joiner.on(",").join(numbers);
        charSink.write(join);

    }
}


//   charSink.writeLines(stringList);