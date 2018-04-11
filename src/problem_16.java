import java.math.BigInteger;

public class problem_16 {

         /* 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

         What is the sum of the digits of the number 2^1000? */

    public static void main(String[] args){

        BigInteger n = BigInteger.valueOf(2);
        String s;

        n = n.pow(1000);
        s = n.toString();
        System.out.println(sumDigits(s));
    }

    private static long sumDigits ( String s){

        int sum = 0;

        for (int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            String z = c.toString();
            int j = Integer.parseInt(z);
            sum += j;
        }
        return sum;
    }
}
