import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.BiConsumer;

public class Demo implements BiConsumer<String,File> {

    @Override
    public void accept(String s, File file) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(s);
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
