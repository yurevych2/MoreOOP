package lotr;
import java.util.Random;

public class AttributesGenerator {
    public static int GenerateFromTo(int from, int to){
        Random random = new Random();
        return random.nextInt(to - from) + from;
    }
}
