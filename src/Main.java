import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        char x=' ';

        for (;x!='q';) {
            x = (char) System.in.read();
            switch (x) {
                case 's' -> System.out.println("s");

                default -> {

                    System.out.println(x);
                }
            }
        }


    }
}