//import java.util.Map;

public class EnvVars {
    public static void main(String[] args) {
        System.out.println(Character.MAX_RADIX);
        for (Long i=0L; i < 1000; i++) {
            System.out.println(i.toString(i, 36));
        }


    }
}