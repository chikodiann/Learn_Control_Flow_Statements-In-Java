public class ReadingDataFromConsole {
    public static void main(String[] args) {
        int currentYear = 2023;

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

    }
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for dropping by!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";

        //note, this won't print in the console, you need to print in terminal
        // use this format to print in the terminal
        //java src/ReadingDataFromConsole.java
    }

    public static String getInputFromScanner(int currentYear) {

        return "";
    }
}
