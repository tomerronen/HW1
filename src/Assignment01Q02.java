public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        int terms = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 0; i < terms; i++) {
            double term = 1.0 / (2.0 * i + 1.0);
            sum += (i & 1) == 0 ? term : -term;
        }
        approxPi = 4.0 * sum;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
