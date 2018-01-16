public class problem_2 {

    public static void main( String[] args ) {

        int term_1 = 1, term_2 = 2, term_3, sum = 0;
        int max = 4000000;

        while ( term_1 <= max ) {

            if ( (term_1 % 2) == 0)
                sum += term_1;

            term_3 = term_1 + term_2;
            term_1 = term_2;
            term_2 = term_3;

            System.out.println(term_1 + " ");
        }

        System.out.println(sum);
    }
}
