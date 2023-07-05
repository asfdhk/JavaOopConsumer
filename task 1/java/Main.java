import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {2,4,56,43,24};
        List<Integer> numbers = Arrays.asList(arr);
        System.out.println(numbers);
        Consumer<Integer> cons = a->{
            if (a%2 !=0){
                System.out.println(a);
            }
        };
        numbers.forEach(cons);

    }
}
