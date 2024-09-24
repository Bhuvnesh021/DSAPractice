import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                System.out.println("generating string fixing iss01");
                return "Hello Stream";
            }
        }).limit(30);
        stringStream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("printing stream " + s);
            }
        });

    }
}