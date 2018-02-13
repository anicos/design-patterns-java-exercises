package pl.anicos.patterns.exercises.singleton.simple;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertSame;

public class ClassicSingletonTest {

    @Test
    public void shouldReturnAlwaysTheSameInstance() {
        ClassicSingleton firstCall = ClassicSingleton.getInstance();
        ClassicSingleton secondCall = ClassicSingleton.getInstance();

        assertSame(firstCall, secondCall);
    }

    @Test
    public void shouldReturnAlwaysTheSameInstanceInMultiThreadEnviroment() {
        List<ClassicSingleton> result = IntStream.range(0, 3).parallel()
                .mapToObj(i -> ClassicSingleton.getInstance())
                .collect(Collectors.toList());


        assertSame(result.get(0), result.get(1));
        assertSame(result.get(1), result.get(2));
    }
}