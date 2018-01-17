public class problem_4 {

    public static void main(String[] args) {

        int prod;
        int pal = 0;

        for ( int i = 100; i <= 999; i++ )
            for ( int j = 100; j <= 999; j++ ) {
                prod = i*j;

                if ( isPalindrome(prod) ) {

                    if ( prod > pal )
                        pal = prod;
                }
            }
        System.out.println(pal);
    }

    private static boolean isPalindrome ( int n ) {

        String check = "" + String.valueOf(n);
        char[] splitted = check.toCharArray();

        for ( int i = 0; i < splitted.length/2; i++ ) {
            char temp = splitted[i];
            splitted[i] = splitted[splitted.length-(1+i)];
            splitted[splitted.length-(1+i)] = temp;
        }
        StringBuilder sb = new StringBuilder();

        for ( int i = 0; i < splitted.length; i++ ) {
            sb.append(splitted[i]);
        }
        String check_2 = sb.toString();

        if ( check.equals(check_2) )
            return true;

        return false;



    }
}
