public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean[n + 1];
        int count = 0;
        double present;

        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int num = 2; num <= Math.sqrt(n); num++){
            for (int j = 0; j < isPrime.length; j++){
                if (isPrime[num] == true && j % num == 0 && j != num){
                    isPrime[j] = false;
                }
            }     
        }

        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 0; i < isPrime.length; i++){
            if (isPrime[i] == true){
                System.out.println(i);
                count++;
            }
        }

        present = ((double)count / (double)n) * 100;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int)present + "% are primes)");
    }
}