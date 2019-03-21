package tw.core;

import org.junit.Test;
import tw.validator.InputValidator;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;

/**
 * 在InputValidatorTest文件中完成InputValidator中对应的单元测试
 */
public class InputValidatorTest {
    @Test
    public void InputValid_Test() {
        assertTrue(new InputValidator().validate("1 2 3 4"));
        assertTrue(new InputValidator().validate("5 6 7 8"));
        assertTrue(new InputValidator().validate("7 8 9 0"));

        assertFalse(new InputValidator().validate("1 1 3 4"));
        assertFalse(new InputValidator().validate("1 2 1 4"));
        assertFalse(new InputValidator().validate("1 2 3 1"));

        assertFalse(new InputValidator().validate("10 2 3 4"));
        assertFalse(new InputValidator().validate("1 20 3 4"));
        assertFalse(new InputValidator().validate("1 2 30 4"));
        assertFalse(new InputValidator().validate("1 2 3 40"));

        assertFalse(new InputValidator().validate("1 2- 3 4"));
        assertFalse(new InputValidator().validate("1 2 3"));
    }

}
