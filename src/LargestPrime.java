public class LargestPrime {
    public static int getLargestPrime (int number){
        if (number <= 1){
            return -1;
        }

        int nextNum = 0;
        int largestNum = 0;

        int i = 2;
        while (i <= number){
            if ((number % i) == 0) {
                number /= i;
                nextNum = i;
                i = 2;

                //to check prime number

                //extra method is not accepted for assignment
                if (isPrimeNumber(nextNum)) {
                    if (nextNum > largestNum) {
                        largestNum = nextNum;
                    }
                }
            }
            i++;
        }

        return largestNum;
    }

     public static boolean isPrimeNumber (int number){
        if (number == 2){
            return true;
        }

        int j = 2;
        while (j < number){
            if ((number % j) == 0){
                return false;
            }
            j++;
        }
        return true;
     }
}

//Write a method named getLargestPrime with one parameter of type int named number.
//
//If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
//
//
//The method should calculate the largest prime factor of a given number and return it.
//
//
//EXAMPLE INPUT/OUTPUT:
//
//* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
//
//* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
//
//* getLargestPrime (0); should return -1 since 0 does not have any prime numbers
//
//* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
//
//* getLargestPrime (-1); should return -1 since the parameter is negative
//
//
//HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
//
//NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
//
//NOTE: Do not add a main method to the solution code.
