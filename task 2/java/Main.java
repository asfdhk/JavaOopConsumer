import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("asd","532","dfsa","knj45");
        Demo demo = new Demo();
        list.forEach(demo);
        List<String> newList = demo.getList();
        System.out.println(newList);
    }
}
