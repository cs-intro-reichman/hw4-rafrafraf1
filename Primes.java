public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] preems = new boolean[n+1];

        for (int i = 0; i <= n; i++) { // default all positions as true
            preems[i] = true;
            if (i < 2) {
                preems[i] = false; // 0 and 1 default to false obv
            }
        }
        System.out.println("Prime numbers up to " + n + ":");

        int counter = 0;
        for (int i = 0; i <= n; i++) {
            if (preems[i]) { // we found a prime, very nice so now lets get rid of all it's multiples
                for (int j = 2*i; j <= n; j += i) { // we start at the next multiple of the prime and increment by the prime
                    preems[j] = false;
                }
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (int) (((double)counter / (double)n)*100) + "% are primes)");
    }
}