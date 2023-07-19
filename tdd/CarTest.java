import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    @Test
    public void testCarCanBeCreated() {
        car car = new car();
        car isOn = new car();
        assertTrue((BooleanSupplier) isOn);
    }
}


