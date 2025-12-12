class prog70 {
    
    public static int largestPrime(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = sieve(n);

        java.util.List<Integer> primes = new java.util.ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes.add(i);
        }

        int prefixSum = 0;
        int largest = 0;

        for (int p : primes) {
            prefixSum += p;
            if (prefixSum > n) break;
            if (isPrime[prefixSum]) largest = prefixSum;
        }

        return largest;
    }

    private static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        java.util.Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
    public static void main(String args[])
    {
        System.out.println(largestPrime(20));
    }
}