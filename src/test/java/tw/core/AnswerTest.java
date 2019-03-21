package tw.core;

import org.junit.Test;
import tw.core.exception.OutOfRangeAnswerException;

import static org.junit.Assert.assertEquals;

/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {

    @Test
    public void AnswerCheck_0A0B_Test() throws OutOfRangeAnswerException {
        Answer actualAnswer =  Answer.createAnswer("1 2 3 4");
        actualAnswer.validate();

        Answer inputAnswer = Answer.createAnswer("5 6 7 8");
        inputAnswer.validate();

        int[] nAmB = actualAnswer.check(inputAnswer).getValue();
        assertEquals(nAmB[0], 0);
        assertEquals(nAmB[1], 0);
    }

    @Test
    public void AnswerCheck_1A0B_Test() throws OutOfRangeAnswerException {
        Answer actualAnswer =  Answer.createAnswer("1 2 3 4");
        actualAnswer.validate();

        Answer inputAnswer = Answer.createAnswer("1 5 6 7");
        inputAnswer.validate();

        int[] nAmB = actualAnswer.check(inputAnswer).getValue();
        assertEquals(nAmB[0], 1);
        assertEquals(nAmB[1], 0);
    }

    @Test
    public void AnswerCheck_2A0B_Test() throws OutOfRangeAnswerException {
        Answer actualAnswer =  Answer.createAnswer("1 2 3 4");
        actualAnswer.validate();

        Answer inputAnswer = Answer.createAnswer("1 2 6 7");
        inputAnswer.validate();

        int[] nAmB = actualAnswer.check(inputAnswer).getValue();
        assertEquals(nAmB[0], 2);
        assertEquals(nAmB[1], 0);
    }

    @Test
    public void AnswerCheck_3A0B_Test() throws OutOfRangeAnswerException {
        Answer actualAnswer =  Answer.createAnswer("1 2 3 4");
        actualAnswer.validate();

        Answer inputAnswer = Answer.createAnswer("1 2 3 7");
        inputAnswer.validate();

        int[] nAmB = actualAnswer.check(inputAnswer).getValue();
        assertEquals(nAmB[0], 3);
        assertEquals(nAmB[1], 0);
    }

    @Test
    public void AnswerCheck_4A0B_Test() throws OutOfRangeAnswerException {
        Answer actualAnswer =  Answer.createAnswer("1 2 3 4");
        actualAnswer.validate();

        Answer inputAnswer = Answer.createAnswer("1 2 3 4");
        inputAnswer.validate();

        int[] nAmB = actualAnswer.check(inputAnswer).getValue();
        assertEquals(nAmB[0], 4);
        assertEquals(nAmB[1], 0);
    }


    @Test
    public void AnswerCheck_0A1B_Test() throws OutOfRangeAnswerException {
        Answer actualAnswer =  Answer.createAnswer("1 2 3 4");
        actualAnswer.validate();

        Answer inputAnswer = Answer.createAnswer("2 5 7 6");
        inputAnswer.validate();

        int[] nAmB = actualAnswer.check(inputAnswer).getValue();
        assertEquals(nAmB[0], 0);
        assertEquals(nAmB[1], 1);
    }

    @Test
    public void AnswerCheck_0A2B_Test() throws OutOfRangeAnswerException {
        Answer actualAnswer =  Answer.createAnswer("1 2 3 4");
        actualAnswer.validate();

        Answer inputAnswer = Answer.createAnswer("2 3 5 6");
        inputAnswer.validate();

        int[] nAmB = actualAnswer.check(inputAnswer).getValue();
        assertEquals(nAmB[0], 0);
        assertEquals(nAmB[1], 2);
    }

    @Test
    public void AnswerCheck_0A3B_Test() throws OutOfRangeAnswerException {
        Answer actualAnswer =  Answer.createAnswer("1 2 3 4");
        actualAnswer.validate();

        Answer inputAnswer = Answer.createAnswer("2 3 4 6");
        inputAnswer.validate();

        int[] nAmB = actualAnswer.check(inputAnswer).getValue();
        assertEquals(nAmB[0], 0);
        assertEquals(nAmB[1], 3);
    }

    @Test
    public void AnswerCheck_0A4B_Test() throws OutOfRangeAnswerException {
        Answer actualAnswer =  Answer.createAnswer("1 2 3 4");
        actualAnswer.validate();

        Answer inputAnswer = Answer.createAnswer("2 3 4 1");
        inputAnswer.validate();

        int[] nAmB = actualAnswer.check(inputAnswer).getValue();
        assertEquals(nAmB[0], 0);
        assertEquals(nAmB[1], 4);
    }

    @Test
    public void AnswerCheck_mAnB_Test() throws OutOfRangeAnswerException {
        Answer actualAnswer =  Answer.createAnswer("1 2 3 4");
        actualAnswer.validate();

        Answer inputAnswer = Answer.createAnswer("5 2 4 1");
        inputAnswer.validate();

        int[] nAmB = actualAnswer.check(inputAnswer).getValue();
        assertEquals(nAmB[0], 1);
        assertEquals(nAmB[1], 2);
    }
}