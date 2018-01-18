public class problem_7 {

    public static void main( String[] args ) {

        int check = 0;
        int result = 0;

        for ( int i = 2; i <= 999999; i++ ) {

            if ( isPrime (i) )
                check++;
            if ( check == 10001 ) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

    private static boolean isPrime( long i ) {

        for ( int j = 2; j < i; j++ )
            if ( i % j == 0 )
                return false;
        return true;
    }
}