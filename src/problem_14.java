public class problem_14 {

    public static void main(String[] args) {

        int highest = 0;
        long chain;
        long maxChain = 0;
        for(int i = 1; i <= 1000000; i++) {
            chain = checkMax(i);
            if (chain > maxChain) {
                maxChain = chain;
                highest = i;
            }
        }
        System.out.println(highest);

    }

    private static long checkMax(long start) {

        long count = 0;
        while(start != 1) {
            if(start % 2 == 0) {
                start = start/2;
                count++;
            }
            else {
                start = start*3+1;
                count++;
            }
        }
        return count;
    }
}
