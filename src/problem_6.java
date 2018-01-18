public class problem_6 {

    public static void main( String[] args ) {

        double sumsquare = 0;
        double squaresum = 0;
        double result;

        for ( int i = 1; i <= 100; i++ ) {

            sumsquare += Math.pow(i, 2);
            squaresum += i;
        }

        squaresum = Math.pow(squaresum, 2);

        result = squaresum - sumsquare;

        System.out.printf("%f\n", result);
    }
}
