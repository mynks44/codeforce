import java.util.Scanner;

public class kevincombination {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            StringBuilder result = new StringBuilder();
            
            while (t-- > 0) {
                long x = sc.nextLong();
                result.append(canUnlock(x) ? "YES\n" : "NO\n");
            }
            
            System.out.print(result.toString());
        }
    }

    private static boolean canUnlock(long x) {
        while (x >= 33) {
            String strX = Long.toString(x);

          
            if (strX.contains("33")) {
                strX = strX.replaceFirst("33", ""); 
                x = strX.isEmpty() ? 0 : Long.parseLong(strX);
            } else {
                x -= 33;
            }
        }

        return x == 0;
    }
}
