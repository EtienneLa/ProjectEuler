public class problem_5 {

    public static void main( String[] args ) {

        long result;

        for ( int i = 20; i < 999999999; i+=20 ) {

            if ( isEvenlyDivisible(i) ) {
                result = i;
                System.out.println(result);
                break;
            }
        }
    }

    private static boolean isEvenlyDivisible( int n ) {

        int check = 0;

        for ( int i = 1; i <= 20; i++ ) {

            if ( n % i == 0 )
                check++;
        }
        if ( check == 20 )
            return true;

        else return false;
    }
}
