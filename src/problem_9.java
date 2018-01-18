public class problem_9 {

    public static void main( String[] args ) {

        int max = 1000;
        int productOfResults = 0;

        for ( int c = 1; c < max; c++ ) {
            for ( int b = 1; b < c; b++ ) {
                for ( int a = 1; a < b; a++ ) {

                    if ( a + b + c == max )
                        if ( Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
                            productOfResults = a*b*c;
                }
            }
        }
        System.out.println(productOfResults);
    }
}
