public class Pell {

    private long[] fib;

    public Pell() {
        fib = new long[1000];
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");

        if(n == 0 || n == 1) return n;
        if (fib[n] != 0) {
            return fib[n];
        }
        fib[n] = 2*(get(n-1)) + get(n-2);
        return fib[n];
    }
}