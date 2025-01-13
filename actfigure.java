import java.util.*;

public class actfigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            String s = scanner.next();
            long sum = 0;
            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
            
            for (int i = (int) n - 1; i >= 0; i--) {
                if (s.charAt(i) == '0') {
                    if (!pq.isEmpty()) {
                        pq.poll();
                    }
                    sum += (i + 1);
                } else {
                    pq.offer((long) (i + 1));
                }
            }
            
            List<Long> v = new ArrayList<>();
            while (!pq.isEmpty()) {
                v.add(pq.poll());
            }
            Collections.sort(v);
            for (int i = 0; i < (v.size() + 1) / 2; i++) {
                sum += v.get(i);
            }
            
            System.out.println(sum);
        }
    }
}
