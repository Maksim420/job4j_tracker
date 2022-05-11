package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class JobTest {

    @Test
    public void whenComparatorAscByName() {
        int rsl = new JobAscByName().compare(
                new Job("First", 0),
                new Job("First", 1)
        );
        assertThat(rsl, equalTo(0));
    }

    @Test
    public void whenComparatorAscByPriority() {
        int rsl = new JobAscByPriority().compare(
                new Job("First", 0),
                new Job("First", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByName() {
        int rsl = new JobDescByName().compare(
                new Job("First", 0),
                new Job("Second", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorDescByPriority() {
        int rsl = new JobDescByPriority().compare(
                new Job("First", 0),
                new Job("Second", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscByPriorityAndDescByName() {
        Comparator<Job> cmpPriorityName = new JobAscByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("First", 1),
                new Job("Second", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}