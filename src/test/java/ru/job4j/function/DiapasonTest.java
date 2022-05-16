package ru.job4j.function;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> rsl = Diapason.diapason(1, 3, x -> x + 1);
        List<Double> exp = Arrays.asList(2D, 3D, 4D);
        assertThat(rsl, is(exp));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> rsl = Diapason.diapason(2, 3, x -> x * x + 2);
        List<Double> exp = Arrays.asList(6D, 11D);
        assertThat(rsl, is(exp));
    }

    @Test
    public void whenDemonstrationFunctionThenDemonstrationResults() {
        List<Double> rsl = Diapason.diapason(1, 2, x -> Math.pow(2, x) - 1);
        List<Double> exp = Arrays.asList(1D, 3D);
        assertThat(rsl, is(exp));
    }
}