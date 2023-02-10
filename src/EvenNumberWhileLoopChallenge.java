public class EvenNumberWhileLoopChallenge {
    /* Create a method called isEvenNumber, that takes a parameter of type int
        it should determine if the argument to the method is an even number or not.
        Return true from the method if it's an even number, otherwise return false
        Next, use a while loop to test a range of numbers from 5 to 20, but printing
        out only even numbers, determined by the call to the isEvenNumber method.
     */
    public static void main(String[] args) {
        int number = 4;
        int endNumber = 20;
        while (number <= endNumber) {
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println(number + " is an even number");
        }
    }
    public static boolean isEvenNumber(int number) {

           if (number % 2 == 0) {
               return true;
           } else {
               return false;
           }
    }
}
