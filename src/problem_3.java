public class problem_3 {

    public static void main( String[] args ) {

        long n = 600851475143L;

        for ( long i = 2; i < n; i++ ) {

            if ( isPrime( i ) ) {
                if (isFactor( n, i ))
                    System.out.println(i);
            }
        }

    }

    public static boolean isPrime( long i ) {

        for ( int j = 2; j < i; j++ )
            if ( i % j == 0 )
                return false;
        return true;
    }

    public static boolean isFactor( long n, long i) {

        if ( n % i == 0 )
            return true;
        return false;
    }
}
