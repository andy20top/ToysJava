import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public void createFile() {
        try (FileWriter writer = new FileWriter("Winner")) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    public void writeFile(String toyString) {
       try (FileWriter fWrite = new FileWriter("Winner", true)){
           fWrite.write(toyString + ";");
           fWrite.append("\n");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }

}
