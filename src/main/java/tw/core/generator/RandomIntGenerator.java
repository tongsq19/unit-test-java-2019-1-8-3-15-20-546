package tw.core.generator;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by jxzhong on 2017/5/17.
 */
public class RandomIntGenerator {

    private Random rng;
    public RandomIntGenerator() {
        rng = new Random();
    }

    public void setRandom(Random random) {
        rng = random;
    }

    public String generateNums(Integer digitmax, Integer numbersOfNeed) {

        if (digitmax < numbersOfNeed) {
            throw new IllegalArgumentException("Can't ask for more numbers than are available");
        }

        Set<String> generated = new LinkedHashSet<>();
        while (generated.size() < numbersOfNeed) {
            Integer next = rng.nextInt(digitmax);
            generated.add(next.toString());
        }
        return String.join(" ", generated);
    }
}
