import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.jupiter.api.Test;

import com.andrepaulino.Calculator;

public class CalculatorTests {

    @Test
    public void sumTwoPositiveNumbers() {
        Calculator calc = new Calculator();
        var sum = calc.sum(3, 2);

        assertThat(sum, equalTo(5));
    }

}