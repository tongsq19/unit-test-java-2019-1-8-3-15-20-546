package tw.core.generator;

import org.junit.Test;
import tw.core.Answer;
import tw.core.exception.OutOfRangeAnswerException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * 在AnswerGeneratorTest文件中完成AnswerGenerator中对应的单元测试
 */
public class AnswerGeneratorTest {

    @Test
    public void AnswerGeneratorSuccessTest() throws OutOfRangeAnswerException {

        RandomIntGenerator mockRandomIntGenerator = mock(RandomIntGenerator.class);
        AnswerGenerator answerGenerator = new AnswerGenerator(mockRandomIntGenerator);
        when(mockRandomIntGenerator.generateNums(10, 4)).thenReturn("1 2 3 4");

        Answer answer = answerGenerator.generate();
        assertEquals(answer.toString(), "1 2 3 4");
    }

    @Test
    public void AnswerGeneratorOrderTest() throws OutOfRangeAnswerException {

        RandomIntGenerator mockRandomIntGenerator = mock(RandomIntGenerator.class);
        AnswerGenerator answerGenerator = new AnswerGenerator(mockRandomIntGenerator);
        when(mockRandomIntGenerator.generateNums(10, 4)).thenReturn("4 2 3 1");

        Answer answer = answerGenerator.generate();
        assertEquals(answer.toString(), "4 2 3 1");
    }

    @Test(expected = OutOfRangeAnswerException.class)
    public void AnswerGeneratorFailTest1() throws OutOfRangeAnswerException {

        RandomIntGenerator mockRandomIntGenerator = mock(RandomIntGenerator.class);
        AnswerGenerator answerGenerator = new AnswerGenerator(mockRandomIntGenerator);
        when(mockRandomIntGenerator.generateNums(10, 4)).thenReturn("10 2 3 4");

        Answer answer = answerGenerator.generate();
    }

    @Test(expected = OutOfRangeAnswerException.class)
    public void AnswerGeneratorFailTest2() throws OutOfRangeAnswerException {

        RandomIntGenerator mockRandomIntGenerator = mock(RandomIntGenerator.class);
        AnswerGenerator answerGenerator = new AnswerGenerator(mockRandomIntGenerator);
        when(mockRandomIntGenerator.generateNums(10, 4)).thenReturn("2 2 3 4");

        Answer answer = answerGenerator.generate();
    }
}

