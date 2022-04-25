package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {

    @Test
    public void whenValidInput() {
        Input in = new StubInput(
                new String[] {"1"}
        );
        Input input = new ValidateInput(in, new StubOutput());
        int rsl = input.askInt("Enter menu");
        assertThat(rsl, is(1));
    }

    @Test
    public void whenMultiValidInput() {
        String[] answers = {"1", "2"};
        Input in = new StubInput(answers);
        Input input = new ValidateInput(in, new StubOutput());
        int rsl;
        for (String answer : answers) {
            rsl = input.askInt("Enter menu");
            assertThat(rsl, is(Integer.parseInt(answer)));
        }
    }

    @Test
    public void whenInvalidInput() {
        Input in = new StubInput(
                new String[] {"abc", "1"}
        );
        Input input = new ValidateInput(in, new StubOutput());
        int rsl = input.askInt("Enter menu");
        assertThat(rsl, is(1));
    }

    @Test
    public void whenInputMinus() {
        Input in = new StubInput(
                new String[] {"-1"}
        );
        Input input = new ValidateInput(in, new StubOutput());
        int rsl = input.askInt("Enter menu");
        assertThat(rsl, is(-1));
    }

}