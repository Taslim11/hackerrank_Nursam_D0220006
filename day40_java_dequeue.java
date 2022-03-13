import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        HashSet<Integer> h = new HashSet<>();
        int max = -1;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            h.add(num);
            if (deque.size() == m) {
                if (h.size() > max) {
                    max = h.size();
                }
                int satu = (int) deque.remove();
                if (!deque.contains(satu)) {
                    h.remove(satu);
                }
            }

        }
        System.out.println(max);
    }
}
