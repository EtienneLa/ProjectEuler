public class problem_10 {

    public static void main( String[] args ) {

        long result = 2;

        for ( int i = 3; i < 2000000; i++ ) {

            if ( isPrime( i )) result = result + i;
        }

        System.out.println(result);
    }

    private static boolean isPrime( int n ) {

        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if ((n & 1) == 0 || n % 3 == 0) {
            return false;
        }
        int sqrtN = (int) Math.sqrt(n) + 1;
        for (int i = 6; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }
}
