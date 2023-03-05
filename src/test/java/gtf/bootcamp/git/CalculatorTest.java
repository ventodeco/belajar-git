package gtf.bootcamp.git;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
  @Test
  void testAddition_shouldSuccess_testing() {
    assertEquals(Calculator.add(2, 3), 5);
    assertEquals(Calculator.add(5, 3), 8);
  }
}
