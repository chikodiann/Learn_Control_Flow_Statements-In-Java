public class ParsingValues {
    public static void main(String[] args) {
        String currentYear = "2023";
        String userDOB = "1999";

        int dateOfBirth = Integer.parseInt(userDOB); //this is how to convert a string to an integer
        int year = Integer.parseInt(currentYear);

        System.out.println(year - dateOfBirth);

    }
}
