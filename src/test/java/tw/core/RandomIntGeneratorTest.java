package tw.core;


import org.junit.Test;
import tw.core.generator.RandomIntGenerator;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {

    @Test
    public void GenerateRandomIntegersTest() {
        Random mockRand = mock(Random.class);
        when(mockRand.nextInt(10)).thenReturn(0).thenReturn(9).thenReturn(8).thenReturn(7);

        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        randomIntGenerator.setRandom(mockRand);
        String result = randomIntGenerator.generateNums(10, 4);
        assertEquals(result, "0 9 8 7");
    }

    @Test
    public void GenerateRandomIntegersWithRepeatTest() {
        Random mockRand = mock(Random.class);
        when(mockRand.nextInt(10)).thenReturn(0).thenReturn(9).thenReturn(9).thenReturn(8).thenReturn(7);

        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        randomIntGenerator.setRandom(mockRand);
        String result = randomIntGenerator.generateNums(10, 4);
        assertEquals(result, "0 9 8 7");
    }
}