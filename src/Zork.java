import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Zork {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("zork.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}