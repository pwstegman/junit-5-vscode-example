import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalcTest {
    @Test
    public void addTest() {
        int result = Calc.add(5, 6);
        assertEquals(11, result);
    }
}
