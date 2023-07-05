import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo implements Consumer<String> {

    private List<String> list = new ArrayList<>();
    @Override
    public void accept(String s) {
        if (haveNumbers(s)){
            list.add(s);
        }
    }
    private boolean haveNumbers(String a){
        for (char symbol:a.toCharArray()){
            if (Character.isDigit(symbol)){
                return true;
            }
        }
        return false;
    }

    public List<String> getList() {
        return list;
    }
}
