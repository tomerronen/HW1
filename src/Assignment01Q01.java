public class Assignment01Q01 {
    public static void main(String[] args) {
        /*
         * Prints the first character of each command-line argument if its ASCII value is divisible by 5.
         * @param args The command-line arguments.
         */
        for (String str : args) {
            if ((int)str.charAt(0) % 5 == 0) {
                System.out.println(str.charAt(0));
            }
        }
    }
}
