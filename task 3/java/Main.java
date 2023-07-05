import java.io.File;

public class Main {
    public static void main(String[] args) {
        String text = "dsdv sdf sd";
        File file = new File("dc.txt");
        Demo demo = new Demo();
        demo.accept(text,file);
    }
}
