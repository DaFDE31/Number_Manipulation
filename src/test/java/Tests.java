import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    Numbers tester = new Numbers();
    @Test
    public void isPrimeTest(){
        int [] values = new int[]{0,1,2,3,4,5,6,7,8,10,11,13,17,26,100};
        boolean[] answers = new boolean[]{false,false, true, true, false, true, false, true,false, false, true, true, true, false, true};

        //   1  ===>  false
        //   2  ===>  true
        //   3  ===>  true
        //   4  ===>  false
        //   5  ===>  true
        //   6  ===>  false
        //  10  ===>  false
        //  17  ===>  true
        for (int trial = 0; trial < values.length; trial ++){
            boolean expected = answers[trial];
            boolean actual = tester.isPrime(values[trial]);
            Assertions.assertEquals(expected, actual);
        }


    }
    public void FactorSumTest(){

    }


    public void pythagoreanTripleCountTest(){

    }
    public void sumOfDigits(){

    }
}
