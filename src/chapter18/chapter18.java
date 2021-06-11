package chapter18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class chapter18 {
    public static void main(String[] args) {

        File file = new File("outfile");
        file.mkdir();
        FileWriter fw = null;
        try {
            fw = new FileWriter(file.getPath() + "/data.txt");
            fw.write("そ\n");
            fw.write("れ\n");
            fw.write("で\n");
            fw.write("は\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
