package jp.co.lbn.study.ut;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {
    private Sample target;

    @BeforeEach
    public void init() {
        target = new Sample();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "world"})
    public void hello(String arg) {
        assertEquals(arg, target.returnOrigin(arg));
    }
}
