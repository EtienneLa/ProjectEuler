public class problem_12 {

    public static void main( String[] args ) {

        int j = 0;
        int n = 0;
        double factors = 0;

        while ( factors <= 500 ) {

            factors = 0;
            j++;
            n = triangle( j );

            for ( int i = 1; i <= n; i++ )
                if ( n % i == 0 )
                    factors++;
        }

        System.out.println(n);
    }

    private static int triangle ( int n ) {

        int sum = 0;

        for ( int i = 0; i <= n; i++ )
            sum += i;

        return sum;
    }
}
