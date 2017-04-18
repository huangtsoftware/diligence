package file;

import org.junit.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2017/1/17.
 */
public class FileTest {



    @Test
    public void test() throws IOException {
        FileInputStream in = new FileInputStream(new File("D:\\opt\\logs\\tomcat\\log.log"));
        Scanner scanner = new Scanner(in);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        in.close();
        scanner.close();
    }
}
