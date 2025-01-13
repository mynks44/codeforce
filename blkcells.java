import java.util.Scanner;
//171
public class blkcells {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long[] arr = new long[(int) n + 10];
            for (int i = 1; i <= n; i++) {
                arr[i] = scanner.nextLong();
            }

            if (n % 2 == 1) {
                long finalAns = Long.MAX_VALUE;
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 1) {
                        long lagbena = i, max1 = 1;
                        for (int j = 1; j <= n; j += 2) {
                            if (lagbena != j) {
                                max1 = Math.max(max1, arr[j + 1] - arr[j]);
                            }
                            if (lagbena == j) {
                                j--;
                            }
                        }
                        finalAns = Math.min(finalAns, max1);
                    }
                }
                System.out.println(finalAns);
            } else {
                long finalAns = 1;
                for (int i = 1; i <= n; i += 2) {
                    finalAns = Math.max(finalAns, arr[i + 1] - arr[i]);
                }
                System.out.println(finalAns);
            }
        }
    }
}
