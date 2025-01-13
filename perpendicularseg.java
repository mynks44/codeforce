import java.util.Scanner;

public class perpendicularseg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong(); 

        while (t-- > 0) {
            long x = scanner.nextLong(); 
            long y = scanner.nextLong(); 
            long k = scanner.nextLong(); 

            System.out.println("0 0 " + Math.min(x, y) + " " + Math.min(x, y));
            System.out.println(Math.min(x, y) + " 0 0 " + Math.min(x, y));
        }
    }
}
