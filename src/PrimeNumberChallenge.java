public class PrimeNumberChallenge {
    public static void main(String[] args) {
        /* Create a prime number counter variable, that will keep count of how many prime numbers were found
            Create a for statement, using any range of numbers, where the maximum number is <= 1000.
            For each number in the range, check to see if it is a prime number using the isPrime method
            If the number is prime, print it out and increment the prime number counter variable
            once the prime number counter equals 3, exit the loop using break statement
         */
        int count = 0;

        for (int i = 10; i <= 50; i++){
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
                // this is optional...just a way to check for the first 3 numbers only
                if (count == 3) {
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }

            }
        }
        System.out.println("Total number of prime numbers between 10 and 20 is " + count);
    }
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber/2; divisor++) {
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
