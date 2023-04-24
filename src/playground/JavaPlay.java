package playground;

import java.io.FileReader;
import java.io.IOException;

public class JavaPlay {

    public static void main(String[] args) throws IOException {
        String path = "/Users/yaw.a/IdeaProjects/DataStructures/src/playground/test.txt";
        FileReader reader = new FileReader(path);
        int count = 0;

        while ((count = reader.read()) != -1) {
            System.out.print((char) count);
        }
        reader.close();
    }
}
