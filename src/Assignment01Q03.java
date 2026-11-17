public class Assignment01Q03 {
    public static void main(String[] args) {
        /*
         * Prints the first x Fibonacci numbers and counts the number of odd numbers among them.
         * @param args Command-line arguments, where args[0] is the number of Fibonacci numbers to print.
         */
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int numOdd = 0;
        long current = 1;
        long next = 1;
        for (int i = 0; i < x; i++) {
            System.out.print(current);
            if ((current & 1) == 1)
                numOdd++;
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            long following = current + next;
            current = next;
            next = following;
        }
        System.out.println();

        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
