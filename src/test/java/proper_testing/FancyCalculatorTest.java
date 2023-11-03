package proper_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FancyCalculatorTest {

  @Test
  public void testShouldAddTwoPositiveNumber(){
      //1. Given (kas yra duota?)
    FancyCalculator fc = new FancyCalculator();
    int expectedResult = 8; //hardcoded expected value, when 5 and 3 addition is made.

     //2. When (kai kas ivyksta?)
    int actualResult = fc.addTwoNumbers(5, 3); //I am not sure about the result.

    //3. Then (kas tada? ko yra tikimasi?)
    assertEquals(expectedResult, actualResult, "5 plus 3 three should always be 8. ");
  }

  @Test
  public void testShouldAddTwoNegativeNumber() {
    FancyCalculator fc = new FancyCalculator();
    int actualResult = fc.addTwoNumbers(-9, -2);
    assertEquals(-11, actualResult);
  }

  @Test
  public void testShouldAddOnePositiveandOneNegativeNumber(){
    FancyCalculator fc = new FancyCalculator();
    int actualResult = fc.addTwoNumbers(-9, -2);
    assertEquals(-11, actualResult);
  }

  //sukurti daugybos metoda ir jam parasyta 1 testa.

  @Test
  public void testShouldMultipleTwoPositiveNumber(){
    FancyCalculator fc = new FancyCalculator();
    int actualResult = fc.sudaugAbuNumber(4, 6);
    assertEquals(24, actualResult);
  }


}