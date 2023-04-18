
public class Numbers {


        // Determine if the given positive integer is prime or not
        // Examples:
        //   1  ===>  false
        //   2  ===>  true
        //   3  ===>  true
        //   4  ===>  false
        //   5  ===>  true
        //   6  ===>  false
        //  10  ===>  false
        //  17  ===>  true
        public boolean isPrime(int n) {

            return true;// TODO
        }


        // Calculate the sum of all factors of the positive integer n
        // Examples:
        //   1  ===>  1                = 1
        //   2  ===>  1 + 2            = 3
        //   3  ===>  1 + 3            = 4
        //   4  ===>  1 + 2 + 4        = 7
        //   5  ===>  1 + 5            = 6
        //   6  ===>  1 + 2 + 3 + 6    = 12
        //  10  ===>  1 + 2 + 5 + 10   = 18
        public int factorSum(int n) {

            return 0;// TODO
        }

        // Calculate the number of triples of integers a,b,c such that:
        //      0 < a < b < c <= n    and    a*a + b*b = c*c
        // Examples:
        // n=10  ===>  3,4,5                                                       ===>  count=1
        // n=16  ===>  3,4,5  5,12,13  6,8,10  9,12,15                             ===>  count=4
        // n=17  ===>  3,4,5  5,12,13  6,8,10  8,15,17  9,12,15                    ===>  count=5
        // n=40  ===>  3,4,5  5,12,13  6,8,10  ...  20,21,29  21,28,35  24,32,40   ===>  count=16
        // n=100 ===>  3,4,5  5,12,13  6,8,10  ...  60,63,87  60,80,100  65,72,97  ===>  count=52
        public int pythagoreanTripleCount(int n) {
            return 0;// TODO
        }

        // Add all the digits in the given positive integer
        // NOTE: the number is given as a string, not as an integer!
        // Examples:
        // ""         ==>  0
        // "3"        ==>  3
        // "45"       ==>  9
        // "207"      ==>  9
        // "12345"    ==>  15
        // "9710000000000000000000000000000006"  ==>  23
        public int sumOfDigits(String num) {

            return 0;// TODO
        }

}
