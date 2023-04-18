import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    Numbers tester = new Numbers();
    @Test
    public void isPrimeTest(){
        int [] values = new int[]{0,1,2,3,4,5,6,7,8,10,11,13,17,26,100};
        boolean[] answers = new boolean[]{false,false, true, true, false, true, false, true,false, false, true, true, true, false, false};

        for (int trial = 0; trial < values.length; trial ++){
            boolean expected = answers[trial];
            boolean actual = tester.isPrime(values[trial]);
            Assertions.assertEquals(expected, actual);
        }


    }
    @Test
    public void FactorSumTest(){
        int expected = 1;
        int actual = tester.factorSum(1);
        Assertions.assertEquals(expected, actual);
        expected = 3;
        actual = tester.factorSum(2);
        Assertions.assertEquals(expected, actual);
        expected = 12;
        actual = tester.factorSum(6);
        Assertions.assertEquals(expected, actual);
        expected = 18;
        actual = tester.factorSum(10);
        Assertions.assertEquals(expected, actual);
        expected = 42;
        actual = tester.factorSum(20);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void pythagoreanTripleCountTest(){
        int [] values = new int[]{10, 16, 17, 40, 100};
        int[] answers = new int[]{2, 4, 5, 16, 52};

        for (int trial = 0; trial < values.length; trial ++){
            int expected = answers[trial];
            int actual = tester.pythagoreanTripleCount(values[trial]);
            Assertions.assertEquals(expected, actual, "Only "+actual +" combination(s) found out of " + expected);
        }


    }
    @Test
    public void sumOfDigits(){
        String [] values = new String[]{"", "3", "45", "207", "12345", "9710000000000000000000000000000006"};
        int[] answers = new int[]{0,3,9,9,15,23};

        for (int trial = 0; trial < values.length; trial ++){
            int expected = answers[trial];
            int actual = tester.sumOfDigits(values[trial]);
            Assertions.assertEquals(expected, actual);
        }

    }
}
