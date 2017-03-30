package pl.jwrabel.trainings.javandwro2;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.SizeFileComparator;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by RENT on 2017-03-11.
 */
public class CommonsIODemo {
    public static void main(String[] args) throws IOException {
        //przeczytanie wszystkich linii z pliku
        List<String> stringList = FileUtils.readLines(new File("test,txt"), Charsets.UTF_8);

        SizeFileComparator sizeFileComparator = new SizeFileComparator();
        File[] files = {new File("test.txt"), new File("b.txt")};
        sizeFileComparator.sort(files);

        //sizeFilesComparator.compare();

        long freeSpaceKb = FileSystemUtils.freeSpaceKb("C:\\");

        FileUtils.cleanDirectory(new File("myDir"));// czysci wszystko w bibliotece mydir

    }
}
